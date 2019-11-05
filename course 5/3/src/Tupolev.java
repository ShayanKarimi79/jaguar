public class Tupolev extends Airplane {
    Tupolev(){
        setBrand("Tupolev");
    }
    @Override
    public void fly() {
        System.out.println("Tupolev flies");
    }
}
