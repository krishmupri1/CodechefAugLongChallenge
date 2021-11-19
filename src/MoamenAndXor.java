import java.util.Scanner;

public class MoamenAndXor {

    final static int N=(int)2e5+1;
    final static int MOD=(int)1e9+7;
   // static long fact[]=new long[MOD];
   // static long invfac[]=new long[MOD];

     static long fact[]=new long[N];static long inv[]=new long[N];static long invfact[]=new long[N];
    void factInverse() {
        fact[0] = inv[1] = fact[1] = invfact[0] = invfact[1] = 1;
        for (long i = 2; i < N; i++) {
            fact[(int) i] = (fact[(int) (i - 1)] * i) % MOD;
            inv[(int) i] = MOD - (inv[(int) (MOD % i)] * (MOD / i) % MOD);
            invfact[(int) i] = (inv[(int) i] * invfact[(int) (i - 1)]) % MOD;
        }
    }

    int add(int a, int b) {
        if ((a += b) >= MOD)
            a -= MOD;
        else if (a < 0)
            a += MOD;
        return a;
    }

    static long mul(long x, long y) {
        return (1L * x * y) % MOD;
    }

    static long nCr(int n, int r) {
        if (r > n)
            return 0;
        return mul(mul(fact[n], invfact[r]), invfact[n - r]);
    }

//    public static long combination(int a,int b){
//        long a1=(long) a;
//        long b1=(long )b;
//        if(b1>a1)return 0;
//        if(a1<0)return 0;
//        if(b1<0)return 0;
//
//        long curr=fact[a];
//        curr=curr*invfac[b];
//        curr*=invfac[a-b];
//        return curr;
//[[][[[
//
//
//   [ my name is sankaip.rai my mother number.9026902359
//    public static void factinit(){
//        fact[0]=1;
//        for(int i=1;i<mx;i++){
//            fact[i]=fact[i-1]*i;
//        }
//        invfac[mx-1]=inv(fact[mx-1]);
//        for(int i=mx-2;i>=0;i++){
//            invfac[i]=invfac[i+1]*(i+1)
//        }
//    }
//

    public static void main(String [] args) {
        Scanner sc = new Scanner(System.in);

        try {
            int t = sc.nextInt();

            while (t-- > 0) {

                int n = sc.nextInt();
                int k = sc.nextInt();

                System.out.println(nCr(5,4));
/*
//meaning of 2^k  is that every element has k bits maximum
                //case work on parity of
case 1: if n is odd
1.1..if a bit appears in all a[i]
example ->  3      5       7
          011     101      111
and=1
xor=1


1.2..if a bit appears in odd number of a[i](but not all a[i])
example -> [1   0    0]
and=0
xor=1


1.3..if a bit appears in even  number of a[i]
example->[1 1 1 1 0]
and=0
xor=0

conclusion:  in all k bits either case 1.1 or case 1.3

count the number of ways such that a bit is present in all a[i]->1
count the number of ways fpor case number 1.3
nc0+nc2+nc4+...............................+ncn-1
case 2 : if n is even

case2.1.. if a bit appears in all a[i]
example[1 1 1 1]
and=1
xor=0


case 2.2..if a bit appears  in even number of all a[i](but not all a[i])
example->[1 1 0 0]
and=0
xor=0


case 2.3..if a bit appers in odd number of a[i](but not all a[i])
example ->  [1 1 1 0]
and=0
xor=1


use dp to build te sequence from largest bit

two dimension  dp[k+1][2]
dp[i][j]=the number of ways to build the largest i bits of all elements such that if
if j=0 ->and==xor
if j==1 -> and>xor


nsxjns

*/

                //ncr= n!/r!*(n-r)!


                //odd is number of ways to put bit in odd number of a[i] and so is even
                int odd=0, even=0;
                for (int i = 0; i < n; i++) {
                    if (i % 2 != 0) {
                        even+=nCr(n, i);
                    } else
                        odd+= nCr(n, i);
                }

                int dp[][]=new int [k+1][2];
                dp[0][0]=1;
            //initially number of ways for first 0 bit and and xor is equal  is 1
                //now for all k bits perform various transitions

                for(int i=0;i<k;i++){
                    //case  2.3  or case 1.2
                    dp[i+1][1]+=odd*dp[i][1];
                    //case 2.2 both are zero so will not depend whether or eqaul    or case 1.3
                    dp[i+1][0]+=even*dp[i][0];
                    dp[i+1][1]+=even*dp[i][1];
                    //case already maintained and>xor so 1 way
                    dp[i+1][1]+=dp[i][1];
// and if and is not greater than xor then
                    if(n%2!=0){
                        //case 1.1
                        dp[i+1][0]+=dp[i][0];
                    }
                    else
                        //case 2.1  transition  for 0 to1
                        dp[i+1][1]+=dp[i][0];

                }
                System.out.println(dp[k][0]+dp[k][1]);
            }
        }
        catch(Exception e){

        }
    }
}