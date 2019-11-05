import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        String input=scanner.nextLine();
        Benz m1 = new Benz("o600", 250, 2000, 8, 6);
        Benz m2 = new Benz("w100", 200, 2550, 6, 4);
        Benz m3 = new Benz("s300", 230, 2900, 7, 6);
        Benz m4 = new Benz("s700", 290, 2200, 5, 8);
        Benz m5 = new Benz("s500", 190, 2000, 10, 6);
        if(input.equalsIgnoreCase("benz")){
            m1.printer();
            m2.printer();
            m3.printer();
            m4.printer();
            m5.printer();
        }

    }
}
