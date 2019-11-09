import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Student student=new Student();
        Scanner scanner =new Scanner(System.in);
        boolean t,p,q;
        do{t=true;
            System.out.println("choose : 1)add new student 2)edit student info 3)delete student 4)student info print 5)exit");
            switch (Integer.parseInt(scanner.nextLine())){
                case 1: student.creator();break;
                case 2:do {p=true;
                    System.out.println("enter student num");student.setStdnum(scanner.nextLine());System.out.println("which field do you want to edit: 1) name  2)student num  3)entering year  4)average 5)back");
                switch(Integer.parseInt(scanner.nextLine()))
                { case 1:student.edit("studentName");break;
                    case 2:student.edit("stdnum");break;
                    case 3:student.edit("enYear");break;
                    case 4:student.edit("average");break;
                    case 5:p=false;
                }}while (p);
                case 3:
                    System.out.println("enter student num");
                    student.setStdnum(scanner.nextLine());
                    student.delete();break;
                case 4:
                    System.out.println(" enter student num");student.setStdnum(scanner.nextLine());student.infoPrinter();
                case 5: t=false;

            }


        }while(t);
    }
}
