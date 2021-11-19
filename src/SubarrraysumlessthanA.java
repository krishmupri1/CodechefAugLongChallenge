import java.util.ArrayList;

public class SubarrraysumlessthanA {

public static void main(String [] args){

ArrayList<ArrayList<String>>ls=new ArrayList<>();
ls.add(new ArrayList());
        int[] A=new int[]{ 8, 5, 1, 10, 5, 9, 9, 3, 5, 6, 6, 2, 8, 2, 2, 6, 3, 8, 7, 2, 5, 3, 4, 3, 3, 2, 7, 9, 6, 8, 7, 2, 9, 10, 3, 8, 10, 6, 5, 4, 2, 3, 4, 4, 5, 2, 2, 4, 9, 8, 5 };
        int B=32;

            int []prefix_sum=new int[A.length];
            prefix_sum[0]=A[0];
            for(int i=1;i<A.length;i++){
                prefix_sum[i]=prefix_sum[i-1]+A[i];
            }
            int count=0;
            if(prefix_sum[0]<B)count++;

            for(int i=1;i<A.length;i++){
                if(prefix_sum[i]-prefix_sum[i-1]<B)count++;
            }

            System.out.println(count);


        }
    }


