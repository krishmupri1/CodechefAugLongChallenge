public class MyThread {
    public static void main(String [] args){
        Dummy d=new Dummy();
        d.start();
        //d.run();
        Thread.currentThread().setName("krish");
        int t=5;
        while(t-->0)
System.out.println("abcd"+Thread.currentThread().getName());
        //int k=10/0;
    }
}
class Dummy extends Thread
{
   // @Override
    public void run(){
    System.out.println(Thread.currentThread().getName());

        //super.run();
        int t=9;
        while(t-->0)
            System.out.println("a");
    }


}
