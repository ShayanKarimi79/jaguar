import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        boolean p,t;
        do{
            System.out.println("please choose:\n1)add new student \n2)login ");
            Scanner scanner=new Scanner(System.in);
            switch(Integer.parseInt(scanner.nextLine()))
            {
                case 1: Std student=new Std();student.adder();break;
                case 2:Std std=new Std();
                do {
                    p=false;
                    try{
                        System.out.println("please enter your username");
                        std=Std.search(scanner.nextLine());

                    }catch (Exception e){
                        System.out.println("INVALID USERNAME");
                        p=true;
                    }
                }while (p);
                    do {p=false;
                        try
                        {
                            System.out.println("please enter your name");
                            std.nameChecker(scanner.nextLine());
                        }catch (Exception e){
                            System.out.println("Username does\'nt match name ");
                            p=true;

                        }}while(p);

                do {p=false;
                try
                {
                    System.out.println("please enter your password");
                    std.passChecker(scanner.nextLine());
                }catch (Exception e){
                    System.out.println("WRONG PASSWORD");
                    p=true;

                }}while(p);
            }

        }while(true);
    }
}
