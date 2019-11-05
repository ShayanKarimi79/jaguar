import java.util.LinkedList;
import java.util.Scanner;

public class  TimedDepsoit extends Depsoit {
     private int profitPercent,period ;

     public boolean profitability=true;

    @Override
    public boolean getProfitability() {
        return profitability;
    }



    static void allprofitgiver (){
        LinkedList <Depsoit>accounts=getAccounts();
        for (Depsoit  x : accounts) {
            if (x.getProfitability())
                x.profitGiver();
        }
    }
    @Override
    public  void profitGiver(){
        setDepsoit(getDepsoit()+getMindDepsoit()*getProfitPercent()/100);
    }



}

