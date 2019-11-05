
public class Ellipse implements Shape {
    private double a,b;
    protected final double p=3.14;

    public void setA(double a) {
        this.a = a;
    }

    public void setB(double b) {
        this.b = b;
    }

    @Override
    public void surface() {
        System.out.println("surface:"+p*a*b);
    }

    @Override
    public void ambiance() {
        System.out.println("ambiance:"+2*p*Math.pow((a*a+b*b)/2,0.5));

    }
    public Ellipse (){}
}