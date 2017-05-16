package lockblock;

/**
 * Created by Dr.Wen on 2017/5/16.
 */
public class Bank {
    private double[] accounts;
    private Object obj = new Object();

    public Bank(int n,double initialBalance){
        accounts = new double[n];
        for(int i=0;i<n;i++){
            accounts[i] = initialBalance;
        }
    }
    public void Transfer(int from,int to,double amount) throws InterruptedException{
        synchronized(obj){
            while(accounts[from] < amount) {
                wait();
            }
            System.out.println(Thread.currentThread());
            accounts[from] -= amount;
            accounts[to] += amount;
            System.out.println("账户" + from + "转入到账户" + to + "::" + amount + ";   总金额::" + getTotalBalance());
            notifyAll();
        }
    }
    public synchronized double getTotalBalance(){
        double sum = 0;
        for(double i:accounts){
            sum += i;
        }
        return sum;
    }
    public int getAccounts(){
        return accounts.length;
    }
}
