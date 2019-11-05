import java.util.LinkedList;
import java.util.Scanner;

public class College {
    private int average;
    private String userName,name,year;
    static LinkedList<College> students=new LinkedList();
    Scanner scanner =new Scanner(System.in);

    public int getAverage() {
        return average;
    }

    public String getName() {
        return name;
    }

    public String getYear() {
        return year;
    }
    public void aveChecker ()throws CollegeException{
        if (average<12){
            throw new CollegeException("limited");
        }
    }

    public  void adder(){

        System.out.println("please enter name ");
        setName(scanner.nextLine());
        System.out.println("please enter username");
        setUserName(scanner.nextLine());
        System.out.println("please enter year");
        setYear(scanner.nextLine());
        System.out.println("please enter average");
        setAverage(Integer.parseInt(scanner.nextLine()));
        students.add(this);
    }
    public void setName(String name) {
        this.name = name;
    }


    public void setUserName(String userName) {
        this.userName = userName;
    }

    public void setAverage(int average) {
        this.average = average;
    }

    public void setYear(String year) {
        this.year = year;
    }

    public   static College search (String user)throws CollegeException{
        for (College x: students)
            if (x.userName.equalsIgnoreCase(user))
                return x;
        throw  new CollegeException("username does\'nt exist ") ;

    }
}
