import java.util.LinkedList;
import java.util.Scanner;

public class Student {
    private String name,stdnum,major,orientation;
    private int age;
    private static LinkedList <Student> students=new LinkedList();
    public void studentCreator (){
        Scanner scanner =new Scanner(System.in);
        System.out.println("please enter name ");
        name=scanner.nextLine();
        System.out.println("please enter stdnum");
        stdnum=scanner.nextLine();
        System.out.println("please enter age");
        age=Integer.parseInt(scanner.nextLine());
        System.out.println("please enter major");
        major=scanner.nextLine();
        System.out.println("please enter orientation");
        orientation=scanner.nextLine();
        students.add(this);
    }
    public static void printer (String num) throws  StudentException
    {
        for (Student student :students)
            if(num.equalsIgnoreCase(student.stdnum))
            {System.out.println("\nname:"+student.name+"\nstdnum:"+student.stdnum+"\nmajor:"+student.major+"\norientation:"+student.orientation+"\nage:"+student.age);
            return;}
        throw  new StudentException("sudent does'nt exist");

    }
    /*public void setScores(){
        Scanner scanner =new Scanner(System.in);
        for (int i=0;i<5;i++)
        {
            System.out.println("please enter score "+i);
            scores.add(Double.parseDouble(scanner.nextLine()));
        }

    }

    public void setAverage() {
        double sum=0;
        for (double temp:scores)
        {sum+=temp;
        }
        average=sum/5;
    }*/
}
