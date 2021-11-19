import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

import java.io.*;
import java.util.HashMap;
import java.util.Scanner;
import java.util.StringTokenizer;

public class TwoKnights  {
        //3 2 5 1 7
//i  i+1
        //arr i >arr i+1....count+=arr[i+1]-arr[i]
// arr[i+1]=arr[i]
        public static void main(String[] args) throws IOException {
            // Scanner sc = new Scanner(System.in);
            FstInput fs=new FstInput();
            // long n=sc.nextLong();
            long s=fs.nextLong();
            //total number of matrix element where we can put 2 knight and attack each other   n*n  c   2
            System.out.println("0");
            long n=2;

while(n<=s) {
    long x = n* n;
    x *= x - 1;
    x /= 2;
    //total number of ways such that 3*2 and 2*3 square matrix can be formed from n*n matrix

    long y = 4 * (n - 1) * (n - 2);
    long ans = x - y;
    System.out.println(ans);
    n+=1;
}

      /* long count=0;
       for(int i=0;i<n-1;i++){
           if(arr[i+1]<arr[i]){
              count+=arr[i]-arr[i+1];
              arr[i+1]=arr[i];
           }
           else{
               continue;
           }
       }*/

            // System.out.println(count);





        }
    }


    class FstInput{
        BufferedReader br;
        StringTokenizer st;

        public FstInput(){
            br=new BufferedReader(new InputStreamReader(System.in));
        }

        String next(){
            while(st==null || !st.hasMoreElements()){
                try{
                    st=new StringTokenizer(br.readLine());
                }
                catch(Exception e){
                }
            }

            return st.nextToken();
        }

        int nextInt(){
            return Integer.parseInt(next());
        }
        long nextLong(){
            return Long.parseLong(next()) ;
        }

        double nextDouble(){
            return Double.parseDouble(next()) ;
        }
        String nextLine(){
            String str="";
            try{
                str=br.readLine();
            }
            catch(Exception e){

            }
            return str;
        }


    }
