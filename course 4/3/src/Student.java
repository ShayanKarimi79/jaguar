import java.util.HashMap;
import java.util.LinkedList;
import java.util.Map;
import java.util.Scanner;

public class Student {
    private String name;
    private Map <String,Course>courses=new HashMap();
    private  static  LinkedList <Student> students=new LinkedList();

    public  void creator(){
        Scanner scanner =new Scanner(System.in);
        System.out.println("please enter name");
        name=scanner.nextLine();students.add(this);

    }

    public void  enterScore(){
        boolean b=true;
        Scanner scanner=new Scanner (System.in);
        String tempKey;
        Course tempValue=new Course();
        do {
            System.out.println("please choose :1)add new score  2)exit");
            switch(Integer.parseInt(scanner.nextLine())) {
                case 1:
                    System.out.println("what course do you want to enter score");
                    tempKey = scanner.nextLine();
                    System.out.println("enter score");
                    tempValue.setScore(Double.parseDouble(scanner.nextLine()));
                    tempValue.setPass();
                    courses.put(tempKey, tempValue);break;
                case 2:
                    b = false;
            }

        }while(b);

    }

    public static Student search(String name)throws StudentException{
        for (Student student:students)
            if (name.equalsIgnoreCase(student.name))
                return student;
        throw new StudentException("student not found"); }

    public  void printer(){
        for (String key:courses.keySet())
        {
            System.out.println(key+" : "+courses.get(key).getScore()+"   "+courses.get(key).isPass());
        }
    }
    }

