import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner  scanner =new Scanner(System.in);
        Ellipse ellipse=new Ellipse ();
        Square square=new Square();
        Rectangle rectangle=new Rectangle();
        Circle circle=new Circle();
        System.out.println("ellipse");
        System.out.println("please enter A");
        ellipse.setA(Double.parseDouble(scanner.nextLine()));
        System.out.println("please enter B");
        ellipse.setB(Double.parseDouble(scanner.nextLine()));
        ellipse.ambiance();
        ellipse.surface();
        System.out.println("square");
        System.out.println("please enter length");
        square.setLength_width(Double.parseDouble(scanner.nextLine()));
        square.ambiance();
        square.surface();
        System.out.println("rectangle");
        System.out.println("please enter length");
        rectangle.setLength(Double.parseDouble(scanner.nextLine()));
        System.out.println("please enter width");
        rectangle.setWidth(Double.parseDouble(scanner.nextLine()));
        rectangle.ambiance();
        rectangle.surface();
        System.out.println("circle");
        System.out.println("please enter radius");
        circle.setRadius(Double.parseDouble(scanner.nextLine()));
        circle.ambiance();
        circle.surface();
    }
}
