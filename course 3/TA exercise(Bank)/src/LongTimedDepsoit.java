public class LongTimedDepsoit extends TimedDepsoit {
    final boolean permission=false;

    private int profitPercent;

    public LongTimedDepsoit() {
        setProfitPercent(getLongProfit());
    }

    @Override
    public void transfer()throws BankException {
        throw new BankException("long timed depsoit owners have no access to this operation ");
    }
    @Override
    public void withdrawal()throws BankException{
        throw new BankException("long timed depsoit owners have no access to this operation ");
    }
    @Override
    public  void addDepsoit()throws BankException{
        throw new BankException("long timed depsoit owners have no access to this operation ");
    }
}
