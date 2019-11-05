
import java.util.Scanner;

public class Employee {
    int sum =0,result;
    int income,payment;
    public void incomeScanner(){
        System.out.println("please enter your income ");
        Scanner input =new Scanner(System.in);
        income=input.nextInt();
    }
    public void paymentSummer(){
        System.out.println("please enter your payement");
        Scanner in=new Scanner(System.in);
        payment=in.nextInt();
        sum+=payment;

    }
    public void resulter(){
        result=income-sum;
    }
}
