
import java.util.Scanner;

public class Student {
    int sumScore;
    int result;
    int factor;
    int score;
    int factort;
    public void summer(){
        System.out.println("please enter the score ");
        Scanner inp=new Scanner (System.in);
        score=inp.nextInt();
        System.out.println("please enter the score factor");
        Scanner input=new Scanner(System.in);
        factor=input.nextInt();
        sumScore +=score*factor;
        factort+=factor;
    }
    public void resulter(){
        result=sumScore/factort;
    }
    public void comparer(){
        System.out.println("this is your score : "+result);
        if (result >=12)
            System.out.println("you didn't get limited");
        else
            System.out.println("you got limited");


    }
}