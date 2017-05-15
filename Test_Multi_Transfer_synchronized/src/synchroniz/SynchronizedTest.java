package synchroniz;

/**
 * Created by Dr.Wen on 2017/5/15.
 */
public class SynchronizedTest {
    public static final int ACCOUNTS = 100;
    public static final double INITIAL_BLANCE = 1000;
    public static void main (String[] args){
        Bank bank = new Bank(ACCOUNTS,INITIAL_BLANCE);
        for (int i=0;i<10;i++){
            new Thread(new Transfer(bank,i,INITIAL_BLANCE)).start();
        }
    }
}
