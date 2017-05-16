package test;

/**
 * Created by Dr.Wen on 2017/5/15.
 */
public class ThreadState implements Runnable {
    public void waitForSecond() throws InterruptedException{
        wait(500);
        //System.out.println("second");
    }
    public void waitForYear() throws InterruptedException{
            wait();
        //System.out.println("year");
    }
    public  void notifyNow() throws InterruptedException{
            notify();
    }
    @Override
    public void run() {
        try {
            waitForSecond();
            waitForYear();
        }
        catch (InterruptedException e){}
        catch (IllegalMonitorStateException e){}
    }
}
