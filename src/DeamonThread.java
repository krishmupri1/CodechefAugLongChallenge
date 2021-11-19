import java.util.Scanner;

public class DeamonThread {
    public static void main(String [] args){

        while(true){

            System.out.println("Enter the number : ");
            Scanner sc=new Scanner(System.in);
            int n=sc.nextInt();
            if(n==0)break;

            findFa1ctorial x=new findFa1ctorial();

            Runnable threads=()->System.out.println(x.getFactorial(n));
            Thread t=new Thread(threads);
            t.start();
            }
    }
}

class findFa1ctorial{

    public int getFactorial(int n){
        int ans=1;
        for(int i=2;i<=n;i++){
            ans*=i;
        }
        return ans;
    }

}