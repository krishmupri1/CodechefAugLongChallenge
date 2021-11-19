import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class Sync {
public static void main(String[] args){
    Counter c=new Counter();
    new Thread(c,"a").start();
    new Thread(c,"b").start();
    new Thread(c,"c").start();
    new Thread(c,"d").start();
    new Thread(c,"e").start();
    new Thread(c,"f").start();
    Counter c2=new Counter();
    new Thread(c2,"naya").start();
}

}


class Counter implements Runnable{
Integer i=5;
    private int value=0;

Lock l=new ReentrantLock();
    public void increment(){
        try{
            Thread.sleep(100);
        }
        catch(InterruptedException e){

        }
        value++;
    }
    public void decrement(){
        value--;
    }
    public int getValue(){
        return  value;
    }


    @Override
    public void run() {
        //synchronized (this){
        l.lock();
        try {
            this.increment();

            System.out.println(Thread.currentThread().getName() + " increase   " + this.getValue());
            this.decrement();
            System.out.println(Thread.currentThread().getName() + "  decrease  " + this.getValue());
        }
        finally{
            l.unlock();
        }
    }
}
//}
