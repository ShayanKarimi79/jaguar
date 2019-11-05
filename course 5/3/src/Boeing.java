public class Boeing extends Airplane {
    Boeing(){
        setBrand("Boeing");
    }
    @Override
    public void fly() {
        System.out.println("Boeing flies");
    }
}
