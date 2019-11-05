
import java.util.LinkedList;

public class Course {
    String name;
    int unit;
    public void setPyshniaz(String niaz){
        pyshniaz.add(niaz) ;
    }
    public  void setHamniaz(String niaz ) {
        hamniaz.add(niaz)  ;
    }


    LinkedList<String> pyshniaz=new LinkedList();
    LinkedList <String>hamniaz=new LinkedList();

    public Course(String name){
        this.name=name;

    }



}