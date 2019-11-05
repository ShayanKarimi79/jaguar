public class Main {
    public static void main(String[] args) {

        Student student=new Student();
        student.creator();
        Student student1,student2,student3,student4,student5;
        try {
             student1=(Student)student.clone();
             student2=(Student)student.clone();
             student3=(Student)student.clone();
            student4=(Student)student.clone();
            student5=(Student)student.clone();

        }catch(Exception e){
            System.out.println("clone not supported");
        }
    }
}
