import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.*;

public class P1st {
    public static void main(String args[]){
            FasXtInput fs=new FasXtInput();
            int t=fs.nextInt();
            while(t-->0){
                int n=fs.nextInt();
                int arr[]=new int[n];
                for(int i=0;i<n;i++){
                    arr[i]=i+1;
                }
                int and=arr[0];
                int max_len=1;
                int curr=1;
                for(int i=1;i<n;i++){
                   and&=arr[i];

                   if(and==0){

                       curr=1;
                       and=arr[i];
                       //max_len=Math.max(max_len,curr);
                       continue;
                   }
                   curr++;
                   max_len=Math.max(max_len,curr);
                   // System.out.println("zxcvb"+curr);
                }
                System.out.println(max_len);

            }
    }



}
class FasXtInput{
    BufferedReader br;
    StringTokenizer st;

    public FasXtInput(){
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



