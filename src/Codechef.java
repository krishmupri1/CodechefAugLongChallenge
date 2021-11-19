

import java.util.*;
import java.lang.*;
import java.io.*;

    /* Name of the class has to be "Main" only if the class is public. */
   public  class Codechef
    {
        public static void main (String[] args) throws java.lang.Exception
        {
            // your code goes here
            Scanner sc=new Scanner(System.in);
            try {
                int t = sc.nextInt();

                while (t-- > 0) {

                    int n = sc.nextInt();
                    int k=sc.nextInt();
                    int array[] = new int[n];

                    for (int i = 0; i < n; i++) {
                        array[i] = sc.nextInt();
                    }
int count=0;int i=0;
       while(i<n){
           while(i<n-1 && array[i]<array[i+1]){
               i++;
           }
           count++;
           i++;

       }
       boolean ans=(count<=k)?true:false;

       if(ans){
           System.out.println("YES");
       }
       else
           System.out.println("NO");


                }
            }
            catch(Exception e){}
        }

    }


//-3 3 5 17
//




