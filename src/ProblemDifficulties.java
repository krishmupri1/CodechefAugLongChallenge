import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class ProblemDifficulties {

    public static void main(String [] args){
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();

        while(t-->0){
int array[]=new int [4];
for(int i=0;i<4;i++) {
    array[i] = sc.nextInt();
}
 Arrays.sort(array);

Map<Integer,Integer> hm=new HashMap<>();
for(int i:array){
    hm.put(i,1+hm.getOrDefault(i,0));
}

if(hm.size()==1)System.out.println("0");
else if(hm.size()==2)System.out.println("1");
else if(hm.size()==3)System.out.println("1");
else System.out.println("2");
}

        }

}
