import java.util.LinkedList;
import java.util.Scanner;

public class User {
    private String username,name,userpass,address,phone,grade;
    private int age;
    LinkedList <User> users=new LinkedList();

    public User(UserBuilder builder) {
        username=builder.username;
        name=builder.name ;
        userpass=builder.userpass;
        address= builder.address;
        phone=builder.phone;
        grade=builder.grade ;
        age=builder.age ;
    }
    public void printer(){
        System.out.println("username:"+username+"\nname:"+name+"\nuserpass:"+userpass+"\naddress:"+address+"\nphone:"+phone+"\ngrade:"+grade+"\nage:"+age);
    }
    public void adder(){
        users.add(this);
    }
    public static class UserBuilder {
        private String username;
        private String name;
        private String userpass;
        private String address;
        private String phone;
        private String grade;
        private int age;
        Scanner scanner=new Scanner(System.in);
        public  User build(){
            User user=new User(this);
            return  user;
        }
        UserBuilder (){
            System.out.println("please enter name");
            this.username = scanner.nextLine();
            System.out.println("please enter username");
            this.name = scanner.nextLine();
            System.out.println("please enter userpass");
            this.userpass = scanner.nextLine();
        }

        public UserBuilder address() {
            System.out.println("please enter address");
            this.address = scanner.nextLine();
            return this;
        }

        public UserBuilder phone() {
            System.out.println("please enter phone number");
            this.phone = scanner.nextLine();
            return this;
        }

        public UserBuilder grade() {
            System.out.println("please ener grade");
            this.grade = scanner.nextLine();
            return this;
        }

        public UserBuilder age() {
            System.out.println("please enter age");
            this.age =Integer.parseInt(scanner.nextLine());
            return this;
        }

    }
}
