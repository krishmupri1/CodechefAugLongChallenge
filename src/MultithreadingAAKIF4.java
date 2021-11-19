import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class MultithreadingAAKIF4 {

    public static void main(String... args) {
        MAIN m=new MAIN();
        Thread th=new Thread(m);
        th.setName("1");
        th.start();
        Thread th1=new Thread(m);
        th1.setName("2");
        th1.start();
        Thread th2=new Thread(m);
        th2.setName("3");
        th2.start();
        Thread th3=new Thread(m);
        th3.setName("4");
        th3.start();
        Thread th4=new Thread(m);
        th4.setName("5");
        th4.start();

    }

}


class MAIN implements Runnable{
  // int [] vehicleNumber =new int[]{1,2,3,4,5};




    Lock l = new ReentrantLock();




  public void tollBooth(){
      try {
          Thread.sleep(100);
      } catch (InterruptedException e) {

      }

  }


    @Override
    public void run () {
        //synchronized (this){
        System.out.println(Thread.currentThread().getName()+"bridge crossing");
        l.lock();
        try {
            this.tollBooth();

            System.out.println(Thread.currentThread().getName() + " tolbooth  ");

            //System.out.println(Thread.currentThread().getName() + "  decrease  " + this.getValue());
        } finally {
            l.unlock();
        }


    }
}


