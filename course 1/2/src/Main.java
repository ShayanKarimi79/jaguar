import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Student daneshjo=new Student();
        outer:while (true)
        {
            System.out.println("please choose \n 1)entering a score \n 2) count");
            Scanner in=new Scanner(System.in);
            int i=in.nextInt();
            switch(i){
                case 1:daneshjo.summer();
                    break;
                case 2: daneshjo.resulter();
                    break outer;
            }
        }
        daneshjo.comparer();

    }

}
