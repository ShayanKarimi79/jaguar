import java.util.LinkedList;
import java.util.Scanner;

public class Student implements  Cloneable {
    String username, usercode,password;
    private static LinkedList<Student> students=new LinkedList();
    private LinkedList <Double>scores=new LinkedList();

    public void creator(){
         double temp;
        Scanner scanner=new Scanner(System.in);
        System.out.println("please enter username");
        username=scanner.nextLine();
        System.out.println("please enter usercode");
        usercode=scanner.nextLine();
        System.out.println("please enter password");
        password=scanner.nextLine();
        for (int i=0;i<5;i++)
        {
            System.out.println("please enter score");
           temp=Double.parseDouble(scanner.nextLine());
           scores.add(temp);

        }
        students.add(this);
    }

    @Override
    protected Object clone() throws CloneNotSupportedException {
        return super.clone();
    }
}
