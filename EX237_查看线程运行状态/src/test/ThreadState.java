package test;

/**
 * Created by Dr.Wen on 2017/5/15.
 */
public class ThreadState implements Runnable {
    public void waitForSecond() {
        try{
            wait(500);
        }
        catch (InterruptedException e){}
        catch (IllegalMonitorStateException e){}
        //System.out.println("second");
    }
    public void waitForYear() {
        try{
            wait();
        }
        catch (InterruptedException e){}
        catch (IllegalMonitorStateException e){}
        //System.out.println("year");
    }
    public  void notifyNow() {
        try{
            notify();
        }
        catch (IllegalMonitorStateException e){}
    }
    @Override
    public void run() {
            waitForSecond();
            waitForYear();
    }
}
