import java.util.*;
import java.lang.*;
import java.io.*;

    /* Name of the class has to be "Main" only if the class is public. */
    public class MaximumMedian {
static int n;
static int k;
static long [] array;

        static boolean check(int x){

            int moves=0;
            for(int i=n/2;i>=0;i--){
                if(x-array[i]>0){
                    moves+=x-array[i];
                }
            }
            if(moves<=k)return true;
            return false;





        }

        public static void main(String[] args) throws java.lang.Exception {
            // your code goes here
            Scanner sc = new Scanner(System.in);
            try {
                int t = sc.nextInt();

                while (t-- > 0) {

                    n = sc.nextInt();
                    k = sc.nextInt();
                    array = new long[n];
                    for (int i = 0; i < n; i++) {
                        array[i] = sc.nextLong();
                    }
                    int i=0;
                    int j=200000000;

                    while(i<=j){
                        int mid=i+(j-i)/2;
                        if(check(mid)){
                        i=mid;
                        }
                        else{
                            j=mid-1;
                        }
                    }
System.out.println(i);

                }
            } catch (Exception e) {
            }
        }
    }


//-3 3 5 17
//




