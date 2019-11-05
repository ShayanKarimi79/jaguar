import java.util.LinkedList;
import java.util.Scanner;

public class Std {
    private String userName,name,password;
    static LinkedList<Std>students=new LinkedList();
    Scanner scanner =new Scanner(System.in);

    public  void adder(){

        System.out.println("please enter name ");
        setName(scanner.nextLine());

        System.out.println("pleade enter password");
        setPassword(scanner.nextLine());
        System.out.println("please enter username");
        setUserName(scanner.nextLine());
        students.add(this);
    }
    public void setName(String name) {
        this.name = name;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public void passChecker(String num)throws StdException{
        if (!password.equalsIgnoreCase(num))
            throw new StdException("WRONG PASSWORD");

    }
    public void nameChecker(String num)throws StdException{
    {
        if (!name.equalsIgnoreCase( num))
            throw new StdException("WRONG name");
    }
    }
    public   static Std search (String user)throws StdException{
        for (Std x: students)
            if (x.userName.equalsIgnoreCase(user))
                return x;
            throw  new StdException("Invalid USERNAME") ;
    }
}
