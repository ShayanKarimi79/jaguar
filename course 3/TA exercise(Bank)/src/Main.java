import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Boolean t=true,c=true,o=true,a=true,p=true;
        Scanner scanner=new Scanner(System.in);
        do {
            System.out.println("1)staff\n2)user");
            switch (Integer.parseInt(scanner.nextLine())){
                case 1:
                    do {c=true;
                        System.out.println( "please choose:\n1)creating account\n2)giving profit\n3)blocking account\n4)add to depsoit\n5)back");
                        switch (Integer.parseInt(scanner.nextLine())){
                            case 1:
                                System.out.println("which type of account do you want to create :\n1)common depsoit \n2)long timed depsoit \n3)short timed depsoit\n4)back ");
                                outer:switch(Integer.parseInt(scanner.nextLine())){
                                    case 1:Depsoit common =new Depsoit();common.adder();break;
                                    case 2:Depsoit longtimed =new LongTimedDepsoit();longtimed.adder();break;
                                    case 3:Depsoit shorttimed =new ShortTimedDepsoit();shorttimed.adder();break;
                                    case 4:break outer;
                                }break;
                            case 2:TimedDepsoit.allprofitgiver();break;
                            case 3:
                                System.out.println("please enter tne account to block");Depsoit.blocker(scanner.nextLine());break;
                            case 4: try{
                                System.out.println("please enter account num ");
                                Depsoit x=Depsoit.search(scanner.nextLine());x.addDepsoit();
                                System.out.println(x.getDepsoit());}
                                catch (Exception e){ System.out.println("account is blocked"); }break;
                            case 5:c=false;break;
                            case 6:Depsoit m=Depsoit.search(scanner.nextLine());
                                System.out.println(m.getDepsoit()+m.getProfitPercent());break;


                        }
                    }while(c);break;
                case 2:o=true;
                    System.out.println("welcome to our bank \nplease enter your account num ");
                    Depsoit account=Depsoit.search(scanner.nextLine());
                    do {

                        try {
                            System.out.println("please enter your password");
                            o = account.passwordChecker(scanner.nextLine()); }
                        catch (Exception e) { System.out.println("invalid password"); }
                    } while(o);
                    do{
                        p=true;
                        System.out.println("what we can do for you:\n1)tranfer money\n2)wihdraw\n3)setting new password\n4)show remainig\n5)exit" );
                    switch (Integer.parseInt(scanner.nextLine())){
                        case 1:try{account.transfer();}catch (Exception e){e.printStackTrace();}break;
                        case 2:try{account.withdrawal();}catch(Exception e){e.printStackTrace();}break;
                        case 3: System.out.println("please enter new password");account.setPassword(scanner.nextLine());break;
                        case 4: System.out.println("remaining:"+account.getDepsoit());break;
                        case 5:p=false;
                    }
                }while(p);



            }
        }while(t);
    }
}
