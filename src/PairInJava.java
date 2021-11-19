import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Scanner;

public class PairInJava {

   static class  Pair {
        int number;
        int index;

        Pair(int x, int y) {
            number = x;
            index = y;
        }
    }
    public static void main (String[] args) throws java.lang.Exception
    {
        // your code goes here
        Scanner sc=new Scanner(System.in);
        try {
            int t = sc.nextInt();

            while (t-- > 0) {

                int n = sc.nextInt();
                int k=sc.nextInt();
              ArrayList<Pair> p=new ArrayList<>();
                for (int i = 0; i < n; i++) {
                    p.add(new Pair(sc.nextInt(),i));
                }
                for(int i=0;i<n;i++){
                    System.out.print(p.get(i).number+" "+p.get(i).index+"\n");
                }
                Collections.sort(p, new Comparator<Pair>() {
                    @Override
                    public int compare(Pair o1, Pair o2) {
                        return o1.number-o2.number;
                    }
                });
                for(int i=0;i<n;i++){
                    System.out.print(p.get(i).number+" "+p.get(i).index+"\n");
                }
                int count=1;
                for(int i=1;i<n;i++){
                    System.out.println("\n"+p.get(i).index+" there we go"+p.get(i-1).index+1+"\n");
                    if(p.get(i).index!=p.get(i-1).index+1){
                        count++;

                    }
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