public class Airbus extends Airplane {
    Airbus(){
        setBrand("Airbus");
    }

    @Override
    public void fly() {
        System.out.println("Airbus flies");
    }
}
