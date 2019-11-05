import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        boolean p;

        do {
            p = false;
            Scanner scanner = new Scanner(System.in);
            System.out.println("please choose :\n1)add\n2)search");
            switch (Integer.parseInt(scanner.nextLine())) {
                case 1:
                    College student = new College();
                    student.adder();
                    break;
                case 2:
                    College stu = new College();
                    do {
                        System.out.println("please enter username ");
                        try {
                            stu = College.search(scanner.nextLine());
                        } catch (Exception e) {
                            System.out.println("username does\'nt exist ");
                            p = true;
                        }
                        System.out.println("name:" + stu.getName());
                        System.out.println("year:" + stu.getYear());
                        System.out.println("average:" + stu.getAverage());
                        try {
                            stu.aveChecker();
                        } catch (Exception e) {
                            System.out.println("limted");
                        }


                    } while (p);

            }
            } while (true) ;
        }
    }