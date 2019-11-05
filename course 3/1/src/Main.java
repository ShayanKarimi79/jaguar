import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Boolean p=false;
        User user=new User ();
        Scanner scanner=new Scanner(System.in);
        System.out.println("please enter your  name ");
        user.setName(scanner.nextLine());
        do {p=false;
            try {
                System.out.println("please enter your age");
                user.setAge(Integer.parseInt(scanner.nextLine()));
                user.ageChecker();
            } catch (Exception e) {
                System.out.println(e.toString()+"your age is not legal");
                p=true;
            }
        }while (p);

        do {p=false;
            try {
                System.out.println("if you are iranian please enter ok");
                user.setNation(scanner.nextLine());
                user.nationChecker();
            } catch (Exception e) {
                System.out.println("you are not iranian!");
                p=true;
            }
        }while (p);



        do {p=false;
        try {
            System.out.println("please choose your grade 1)");
            user.setGrade(Integer.parseInt(scanner.nextLine()));
            user.gradeChecker();
        } catch (Exception e) {
            System.out.println("your grade is lower than legal ");
            p=true;
        }
        }while (p);
    }
}
