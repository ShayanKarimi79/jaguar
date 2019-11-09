import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in) ;
        Employee employee=new Employee();
        employee.tableCreator();
        boolean t;
        do {t=true;
            System.out.println("choose : 1)create new employee 2)exit");
            switch (Integer.parseInt(scanner.nextLine()))
            { case 1:employee.creator();break;
              case 2:t=false;
            }
        }while(t);
    }
}
