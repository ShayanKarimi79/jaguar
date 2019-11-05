import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        User user =new User.UserBuilder().address().phone().age().grade().build();user.adder();

        user.printer();




        }



}
