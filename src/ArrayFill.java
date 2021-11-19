import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.*;

public class ArrayFill {

    static class Pair{
       int x;
       int y;
       Pair(int x,int y){
           this.x=x;
           this.y=y;
       }
       public int getX(){
           return this.x;
       }
       public int getY(){
          return this.y;
        }
    }

//static class Compare {
//    static void compare(ArrayList<Pair> ls) {
//
//        Collections.sort(ls, new Comparator<Pair>() {
//            @Override
//            public int compare(Pair o1, Pair o2) {
//                return o1.x - o2.x;
//            }
//        });
//
//    }
//}

    static class FastInput{
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




    static long gcd(long a,long b){
        if(a==0)return b;
        return gcd(b%a,a);
    }


    public static void main(String args[]){
        FastInput fs=new FastInput();
        int t=fs.nextInt();
        while(t-->0){
            long n=fs.nextLong();
            long m=fs.nextLong();

            List<Pair> ls1=new ArrayList<>();
           for(int i=1;i<=m;i++){
               ls1.add(new Pair(    (int)fs.nextInt(),      (int)fs.nextInt()       ));
           }

Collections.sort(ls1, new Comparator<Pair>() {
    @Override
    public int compare(Pair o1, Pair o2) {
        return o1.x-o2.x;
    }
});

//System.out.println(ls1.get(0).x+"            "+ls1.get(0).y);
           long temp=1;
            long ans=0;
            long count=n;


           for(int i=(int)m-1;i>=0 && count>0 ;i--){
               long x=(long)ls1.get(i).getX();
               long y=(long)ls1.get(i).getY();
               temp=(temp*y)/gcd(temp,y);
               ans+=(count-(n/temp))*x;
               count=n/temp;
           }
System.out.println(ans);


        }
    }



}
