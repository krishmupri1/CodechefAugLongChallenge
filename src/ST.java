
import java.util.Scanner;

class Pair<T>{

    T B,C;
    Pair(T i,T j){
        B=i;
        C=j;
    }

}
public class ST {


    public static void main(String[] args) {
        //Pair<Integer> P=new Pair<>(1,1);
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- > 0) {
            int n = sc.nextInt();
            int count = 0;
            //choosing b
            //choosing c
            // c will always between 1 to b-1
//Pair

            //  loop for b must be greater than or equal to 2
//            int b=2;
//            int c=1;
//            while(c<b){
//                while(b%c!=0 && b<=n){
//                        b++;
//                }
//for(int i=1;i<=n;i++){
//    if(i%b==c)count++;
//
//}
//                b+=c;
//
//                }




for(int c=1;c<=n;c++){
    for(int b=c;b<=n;b+=c){
        if(b%c==0){
            for(int a=c;a<=n;a+=b){
                if(a%b==c) {
                   // System.out.println(a + " " + b + " " + c);
                    count++;
                }
            }
        }
    }
}
System.out.println(count);





        }
    }
}