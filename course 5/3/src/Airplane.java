import java.util.Scanner;

public abstract class Airplane {
    private String model,brand;
    private int weight,speed,fuelUsage;
    public void creator(){
        Scanner scanner=new Scanner(System.in);
        System.out.println("please enter model");
        model=scanner.nextLine();
        System.out.println("please enter speed");
        speed=Integer.parseInt(scanner.nextLine());
        System.out.println("please enter fuelUsage");
        fuelUsage=Integer.parseInt(scanner.nextLine());
        System.out.println("please enter weight");
        weight=Integer.parseInt(scanner.nextLine());


    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public void printer(){
        System.out.println("\nbrand"+brand+"\nmodel"+model+"\nspeed"+speed+"\nfuelusage"+fuelUsage+"\nweight"+weight);

    }
    public abstract void fly();



}
