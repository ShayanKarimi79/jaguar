
public class Rectangle implements Shape {
    private double length,width;


    public void setLength(double length) {
        this.length = length;
    }

    public void setWidth(double width) {
        this.width = width;
    }

    @Override
    public void ambiance() {
        System.out.println("ambiance:"+2*(length+width));

    }

    @Override
    public void surface() {
        System.out.println( "surface:"+width*length);

    }
    public Rectangle(){}
}

