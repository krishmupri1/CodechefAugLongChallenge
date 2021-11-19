import java.util.Scanner;

public class ChefAndBulbInvention {


    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);


        int t = sc.nextInt();
        while (t-- > 0) {
            long n = sc.nextLong();
            long p = sc.nextLong();
            long k = sc.nextLong();
            long x = p % k;
x--;

            long ans = 0;
long y=((n - 1)/k)*k;
y = (n - 1)-y;
            //System.out.println(y);

            if (x > y) {

                ans += (y + 1)*(((n - 1)/k) + 1) + (x- y) * ((n - 1) / k);

            } else{

                ans += (x+1) * (((n - 1) / k) + 1);
            }

            for (int j = (int) x+1; j <n; j+=k) {
                ans += 1;
               // System.out.print(ans);

                if (j == p) {
                    break;

                }

            }
            System.out.println(ans);

        }
    }
}
//            long i=(long)0;
//            long j=k;
//    long count=1;
//    if(p==i){
//        System.out.println("1");
//    }
//
//
//           else  if(p==j){
//                System.out.println("2");
//            }
//else {
//        count = 2;
//        while (i < n && jhvuj < n) {
//            i += 1;
//            count++;
//            if (i == p) break;
//            j += 1;
//            count++;
//            if (j == p) break;
//            System.out.println(i + " " + " " + j);
//        }
//
//        System.out.println( count);
//    }
//
//





