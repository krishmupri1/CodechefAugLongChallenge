import java.io.*;
import java.util.HashMap;
import java.util.Scanner;
import java.util.StringTokenizer;

public class MissingNumber {
    //3 2 5 1 7
//i  i+1
    //arr i >arr i+1....count+=arr[i+1]-arr[i]
// arr[i+1]=arr[i]
    public static void main(String[] args) throws IOException {
        // Scanner sc = new Scanner(System.in);
        FastInput fs=new FastInput();
        // long n=sc.nextLong();
        long t=fs.nextLong();
        while(t-->0){
            long x=fs.nextInt();
            long y=fs.nextInt();

            long k=Math.max(x,y);


            long ans=(k-1)*(k-1);
            if(k%2==0){
                ans+=x+(k-y);
            }
            else
                ans+=y+(k-x);

            System.out.println(ans);

        }

        //  BufferedWriter output = new BufferedWriter(
        //        new OutputStreamWriter(System.out));


        // odd   1 3 5 7 2 4 6







       /*long arr[]=new long[(int)n];
       for(int i=0;i<n;i++){
           arr[i]=sc.nextInt();
       }*/
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


 class FastInput{
    BufferedReader br;
    StringTokenizer st;

    public FastInput(){
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

