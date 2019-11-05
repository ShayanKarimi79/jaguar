public class Student {
    double average;
    int years;
    String name;
    public Student(String name,double average,int years){
        this.name=name;
        this.average=average;
        this.years=years;
    }
    public void printer(){
        System.out.println("average"+average+"\nyears:"+years);

    }
}
