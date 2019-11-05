import java.util.LinkedList;
import java.util.Scanner;


public class Depsoit extends Bank {
    private long cashCapacity,tranCapacity,depsoit,mindDepsoit;
    private int period;
    private final long tranDailyLimit=getTranDailyLimit();
    private final long cashDailyLimit=getCashDailyLimit();
    private final int due=1;
    private  String password;
    private int  profitPercent =0;
    private String accountNum,name;
    private boolean profitability=false;
    private boolean permission=true;

    public static void nextDay(){
        for(Depsoit x:accounts)
        {x.tranCapacity=0;
         x.cashCapacity=0;}


    }

    public void setPassword(String password) {
        this.password = password;
    }
    public boolean passwordChecker(String input)throws BankException{
        if (password.equalsIgnoreCase(input))
        {System.out.println("welcome");
            return false;}
        else
            throw new BankException("invalid passvord");
    }

    public static void nextMonth()
    {for(Depsoit x:accounts)
        x.mindDepsoit=x.depsoit;}

    public boolean getProfitability() {
        return profitability;
    }

    private static LinkedList<Depsoit>accounts=new LinkedList();

    //search
    protected static Depsoit  search(String num){
        for (Depsoit x:accounts )
            if (num.equalsIgnoreCase(x.accountNum))
                return x;
         return null;
    }

    public int getProfitPercent() {
        return profitPercent;
    }

    public void profitGiver(){}

    public void setProfitPercent(int profitPercent){this.profitPercent=profitPercent;}
    public void setPeriod(int period) {
        this.period = period;
    }

    public static LinkedList<Depsoit> getAccounts() {
        return accounts;
    }

    public long getMindDepsoit() {
        return mindDepsoit;
    }

    //setting items
    public void adder(){
        Scanner scanner=new Scanner(System.in);
        System.out.println("please enter name");
        setName(scanner.nextLine());
        System.out.println("please enter AccountNum");
        setAccountNum(scanner.nextLine());
        System.out.println("please enter a valid password");
        setPassword(scanner.nextLine());
        System.out.println("please enter depsoit amount");
        setDepsoit(Integer.parseInt(scanner.nextLine()));
        System.out.println("please enter period ");
        setPeriod(Integer.parseInt(scanner.nextLine()));
        accounts.add(this);
    }

    public static void blocker(String num)
    {Depsoit account =search(num);
    account.permission=false;
    }



    public void mindDepsoitChecker() {
        if (depsoit<mindDepsoit)
            mindDepsoit=depsoit;
    }

    public long getDepsoit() {
        return depsoit;
    }

    public void setDepsoit(long depsoit) {
        this.depsoit = depsoit;
        this.mindDepsoit=depsoit;
    }



    public void setName(String name) {
        this.name = name;
    }

    public void setAccountNum(String accountNum) {
        this.accountNum = accountNum;
    }


    public void transfer ( ) throws BankException{

        System.out.println("please enter amount of money");
        Scanner scanner =new Scanner(System.in);
        int amount =Integer.parseInt(scanner.nextLine());
        System.out.println("please enter  Destination Account Num");
        Depsoit destination=search(scanner.nextLine());
        if(destination==null)
            throw new BankException("invalid account num");
        else if (destination.permission==false)
            throw new BankException ("you can not tranfer money to this account");
        else
         if (depsoit >= amount)
         {
             if (tranCapacity+amount>tranDailyLimit)
                 throw new BankException("more than transfer daily limit ");
             else
             {
                 depsoit -= amount;
                 destination.depsoit+=amount;
                 tranCapacity+=amount;
                 System.out.println(" transfer successfully accomplished \namount:"+amount+"\n remaining depsoit"+depsoit);
                 mindDepsoitChecker();
             }
         }
        else
        {throw new BankException(" not enough Depsoit");
           //exception position
        }

    }

    @Override
    public void withdrawal()throws BankException
        {System.out.println("please enter amount of money");
        Scanner scanner =new Scanner(System.in);
        int amount =Integer.parseInt(scanner.nextLine());

        if (amount+cashCapacity>cashDailyLimit)
            throw new BankException("more than withdrawal daily limit");
        else{
            if (depsoit >= amount) {
                depsoit -= amount;
                System.out.println("withdrawal accomplished amount:"+amount);
                cashCapacity+=amount;
                mindDepsoitChecker();

            }
        else
            throw new BankException(" not enough Depsoit");}


    }
    public  void addDepsoit()throws BankException
    {
        Scanner scanner=new Scanner (System.in);
        if(!permission)
            throw new BankException(" the account is banned");
        else
        {System.out.println("please enter amount of money");
        int amount =Integer.parseInt(scanner.nextLine());
        depsoit+=amount;}

    }
    public Depsoit(){}
}
