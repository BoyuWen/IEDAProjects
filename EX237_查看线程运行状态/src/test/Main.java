package test;

/**
 * Created by Dr.Wen on 2017/5/15.
 */
public class Main {
    public static void main(String[] args) throws InterruptedException{
        ThreadState test = new ThreadState();
        Thread thread = new Thread(test);
        System.out.println("新建线程："+thread.getState());
        thread.start();
        System.out.println("启动线程："+thread.getState());
        thread.sleep(100);
        System.out.println("计时等待："+thread.getState());
        thread.sleep(1000);
        System.out.println("等待线程："+thread.getState());
        try{
            test.notifyNow();
        }
        catch (IllegalMonitorStateException e){}
        System.out.println("唤醒线程："+thread.getState());
        thread.sleep(1000);
        System.out.println("终止线程："+thread.getState());
    }
}
