package lockblock;

/**
 * Created by Dr.Wen on 2017/5/16.
 */
public class Transfer implements Runnable {
    private Bank bank;
    private int fromaccount;
    private double maxAmount;
    private double amount;
    private int toaccount;
    private int DELAY = 10;

    public Transfer(Bank b,int from,double max){
        bank = b;
        fromaccount = from;
        maxAmount = max;
    }
    @Override
    public void run() {
        try{
            while (true) {
                toaccount = (int)(bank.getAccounts()*Math.random());
                amount = maxAmount*Math.random();
                bank.Transfer(fromaccount,toaccount,amount);
                Thread.sleep((int)(DELAY*Math.random()));
            }
        }catch(InterruptedException e){e.printStackTrace();}
    }
}
