import java.util.Scanner;

public class ShortTimedDepsoit extends TimedDepsoit {
    private int profitPercent;

    public ShortTimedDepsoit() {
        setProfitPercent(getShortProfit());
    }
}
