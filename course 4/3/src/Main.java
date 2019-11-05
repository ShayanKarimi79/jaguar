import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        boolean t,p;
        do {
            System.out.println("please choose 1)create new student  2)scores 3)show info");
            switch(Integer.parseInt(scanner.nextLine()))
            { case 1:Student student=new Student();student.creator();break;

              case 2:do{t=true;
                  try {
                      System.out.println("please enter name");
                      Student.search(scanner.nextLine()).enterScore();
                      t=false; }
                  catch(Exception e){ System.out.println(e.toString()); }
              }while(t);
              break;

              case 3:do{ p=true;
                  try{
                      System.out.println("please enter name");
                  Student.search(scanner.nextLine()).printer();
                  p=false;
              }catch(Exception e){
                  System.out.println(e.toString());
              }
              }while(p);

            }
        }while(true);
    }
}
