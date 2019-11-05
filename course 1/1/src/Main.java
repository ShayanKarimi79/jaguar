
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Employee person=new Employee();
        person.incomeScanner();
        outer:while(true){
            System.out.println("please choose \n1)entering your payment \n2)count" );
            Scanner inp=new Scanner(System.in);
            switch(inp.nextInt()){
                case 1:person.paymentSummer();
                    break;
                case 2: person.resulter();
                    break outer;
            }
        }
        System.out.println("your remained money :"+person.result);
    }


}
