
import java.util.LinkedList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        LinkedList<Course>courses=new LinkedList();
        Course temp;
        String course;
        Scanner scanner=new Scanner(System.in);
        while(true){
            System.out.println("1)add\n2)search");

            switch(Integer.parseInt(scanner.nextLine())){
                //add
                case 1:
                    System.out.println("please enter name");
                    temp=new Course(scanner.nextLine());
                    System.out.println("please enter units");
                    temp.unit=Integer.parseInt(scanner.nextLine());
                    outer:while(true){
                        System.out.println("1)hamniaz\n2)pyshniaz\n3)exit");
                        switch(Integer.parseInt(scanner.nextLine())) {
                            case 1:
                                System.out.println("please enter hamniaz");
                                temp.setHamniaz(scanner.nextLine());break;
                            case 2:System.out.println("please enter pishniyaz");
                                temp.setPyshniaz(scanner.nextLine());break;
                            case 3:break outer;}

                    }

                    courses.add(temp);break;
                case 2:
                    System.out.println("please enter course name");


                    for (Course x:courses) {
                        if(x.name.equalsIgnoreCase(scanner.nextLine())) {
                            System.out.println(x.name + "\nhamniaz:" + x.hamniaz + "\npyshniaz:" + x.pyshniaz+"\n units:"+x.unit);
                        }
                    }
            }
        }

    }
}
