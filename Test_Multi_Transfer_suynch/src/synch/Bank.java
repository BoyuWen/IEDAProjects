package synch;

import java.util.concurrent.locks.*;

/**
 * Created by Dr.Wen on 2017/5/15.
 */
public class Bank {
    private Lock mylock;
    private Condition funds;
    private double[] accounts;

    public Bank(int n,double initialBalance){
        accounts = new double[n];
        for(int i=0;i<n;i++){
            accounts[i] = initialBalance;
        }
        mylock = new ReentrantLock();
        funds = mylock.newCondition();
    }
    public void Transfer(int from,int to,double amount) throws InterruptedException{
        mylock.lock();
        try{
            while(accounts[from] < amount) {
                funds.await();
            }
                System.out.println(Thread.currentThread());
                accounts[from] -= amount;
                accounts[to] += amount;
                System.out.println("账户" + from + "转入到账户" + to + "::" + amount + ";   总金额::" + getTotalBalance());
                funds.signalAll();
        }
        finally {
            mylock.unlock();
        }
    }
    public double getTotalBalance(){
        mylock.lock();
        try{
            double sum = 0;
            for(double i:accounts){
                sum += i;
            }
            return sum;
        }
        finally{
            mylock.unlock();
        }
    }
    public int getAccounts(){
        return accounts.length;
    }
}
