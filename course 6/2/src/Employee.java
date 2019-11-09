import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.util.Scanner;


public class Employee {
    private String code,name,fatherName,nationCode,post,record;
    private  int age,income;
    private Connection connection;
    private PreparedStatement preparedStatement;
    private Scanner scanner=new Scanner(System.in);

    public  void tableCreator(){
        try {
            connection = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:orcl", "shayer", "crysises2047");
            preparedStatement=connection.prepareStatement("create table bank(code varchar2(20) not null ,name varchar2(20) NOT NULL ,fatherName varchar2(20) ,nationCode varchar2(20) unique ,age int ,post varchar2 (20),income int ,record varchar2(200),primary key (code))  when bank not exists ");
            preparedStatement.close();
            connection.close();
        }catch (Exception e){
            System.out.println("connection failed");
        }
    }

    public void setCode() {
        try{
            System.out.println("please enter code");
        this.code = numberChecker(code);
        }catch(Exception e){
            System.out.println("Code"+e.toString());
            setCode();
        }
    }

    public void setName() {
        try{ System.out.println("enter name");
            this.name= stringChecker(scanner.nextLine());
        }catch(Exception e){
            System.out.println("Name"+e.toString());
            setName();
        }
    }

    public void setFatherName() {
        try{
            System.out.println("please enter father name");
            this.fatherName = stringChecker(scanner.nextLine());
        }catch(Exception e){
            System.out.println("FatherName"+e.toString());
            setFatherName();
        }
    }

    public void setAge() {
        try{
            System.out.println("please enter age");
            this.age = Integer.parseInt(scanner.nextLine());
        }catch(Exception e){
            System.out.println("age only contain nums");
            setAge();
        }
    }

    public void setNationCode() {
        try{
            System.out.println("please enter nation code");
            this.nationCode = numberChecker(scanner.nextLine());
        }catch(Exception e){
            System.out.println("NationCode"+e.toString());
            setNationCode();
        }
    }

    public void setPost() {
        try{
            System.out.println("please enter post");
            this.post = stringChecker(scanner.nextLine());
        }catch(Exception e){
            System.out.println("Post"+e.toString());
            setPost();
        }
    }

    public void setRecord() {
        try{
            System.out.println("please enter record");
            this.record = stringChecker(scanner.nextLine());
        }catch(Exception e){
            System.out.println("Record"+e.toString());
            setRecord();
        }
    }

    public void setIncome() {
        try{
            System.out.println("please enter income");
            this.income= Integer.parseInt(scanner.nextLine());
        }catch(Exception e){
            System.out.println("income only contain nums");
            setIncome();
        }
    }

    public void creator(){
        Scanner scanner=new Scanner(System.in);
       setName();
       setCode();
       setNationCode();
       setFatherName();
       setAge();
       setPost();
       setIncome();
       setRecord();
        try {
            connection = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:orcl", "shayer", "crysises2047");
            preparedStatement=connection.prepareStatement("insert into bank (code,name,fatherName,nationCode,age,post,income,record)values(?,?,?,?,?,?,?,?)");
            preparedStatement.setString(1,code);
            preparedStatement.setString(2,name);
            preparedStatement.setString(3,fatherName);
            preparedStatement.setString(4,nationCode);
            preparedStatement.setInt(5,age);
            preparedStatement.setString(6,post);
            preparedStatement.setLong(7,income);
            preparedStatement.setString(8,record);
            preparedStatement.executeUpdate();
            preparedStatement.close();
            connection.close();
        }catch (Exception e){

        }


    }
    private static String stringChecker(String str) throws BankException {
        for (char c: str.toCharArray())
        {int n=(int)c;
            if (!(n<91&&n>64)||!(n<123&&n>96))
                throw new BankException(" only can contain a-z or A-Z");
        }
        return str;

    }
    private static String numberChecker(String str)throws  BankException{
        for (char c: str.toCharArray())
            if(!"0123456789".contains( String.valueOf(c)))
                throw new BankException("only contains numbers");
            return str;

    }


}