import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("please choose 1)Boeing 2)Airbus 3)Tupolev");
        Airplane airplane = PlaneFactory.getPlane(scanner.nextLine());
        airplane.creator();
        airplane.printer();
        airplane.fly();
    }
}
