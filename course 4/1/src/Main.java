import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        boolean t;
        do {
            System.out.println("please choose \n1)create new student \n2)print student info");
            switch (Integer.parseInt(scanner.nextLine())) {
                case 1:
                    Student student = new Student();
                    student.studentCreator();
                    break;
                case 2:
                    do {
                        t = true;
                        try {
                            System.out.println("please enter student num");
                            Student.printer(scanner.nextLine());
                            t = false;
                        } catch (Exception e) {
                            System.out.println(e.toString());
                        }
                    } while (t);

            }
            }
            while (true) ;

    }
}