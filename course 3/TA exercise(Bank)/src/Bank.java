import java.util.LinkedList;

public abstract class Bank {
    private final long tranDailyLimit=30000000,cashDailyLimit=3000000;
    private final int shortProfit=10,longProfit=15;

    public long getTranDailyLimit() {
        return tranDailyLimit;
    }

    public long getCashDailyLimit() {
        return cashDailyLimit;
    }

    public int getLongProfit() {
        return longProfit;
    }

    public int getShortProfit() {
        return shortProfit;
    }
    public abstract void withdrawal()throws BankException;
    public abstract void transfer()throws BankException;
    public abstract void profitGiver();



}
