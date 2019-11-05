import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Student student=new Student("shayan",19.5,2);
        Scanner scanner=new Scanner(System.in);
        if(student.name.equalsIgnoreCase(scanner.nextLine()))
            student.printer();
    }
}
