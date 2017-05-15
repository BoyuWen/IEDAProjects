package synch;

import java.util.concurrent.locks.*;

/**
 * Created by Dr.Wen on 2017/5/15.
 */
public class Bank {
    private Lock mylock;
    //private Condition funds = new Condition();
    private double[] accounts;

    public Bank(int n,double initialBalance){
        accounts = new double[n];
        for(int i=0;i<n;i++){
            accounts[i] = initialBalance;
        }
        mylock = new ReentrantLock();
    }
    public void Transfer(int from,int to,double amount){
        mylock.lock();
        try{
            if(accounts[from] >= amount) {
                accounts[from] -= amount;
                accounts[to] += amount;
                System.out.println("账户" + from + "转入到账户" + to + "::" + amount + ";   总金额::" + getTotalBalance());
            }
        }
        finally {
            mylock.unlock();
        }
    }
    public double getTotalBalance(){
        double sum = 0;
        mylock.lock();
        try{
            for(double i:accounts){
                sum += i;
            }
        }
        finally{
            mylock.unlock();
        }
        return sum;
    }
    public int getAccounts(){
        return accounts.length;
    }
}
