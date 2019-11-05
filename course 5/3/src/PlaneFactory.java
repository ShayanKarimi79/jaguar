public class PlaneFactory {
    public static Airplane getPlane(String plane){
        if (plane==null)
            return null;
        if (plane.equalsIgnoreCase("1"))
            return  new Boeing();
        if (plane.equalsIgnoreCase("2"))
            return new Airbus();
        if (plane.equalsIgnoreCase("3"));
            return new Tupolev();
    }

}
