import java.util.Scanner;

public class Person {
    private static Person instance;
    private  String name,job,major,phone,address;
    private Person(){}

    public static Person getInstance(){
        if (instance==null)
            instance=new Person();
        return instance;

    }
    Scanner scanner=new Scanner(System.in);
    public void create(){
        System.out.println("please enter your name");
        name=scanner.nextLine();
        System.out.println("please enter your major");
        major=scanner.nextLine();
        System.out.println("please enter your job");
        job=scanner.nextLine();
        System.out.println("please enter your phone");
        phone=scanner.nextLine();
        System.out.println("please enter your address");
        address=scanner.nextLine();
    }
    public void show(){
        System.out.println("\nname:"+name+"\nmajor:"+major+"\njob"+job+"\nphone"+phone+"\naddress"+address);
    }

}
