import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.util.Scanner;

public class Student {

    private double average;
    private String name,enYear,stdnum;
    private Connection connection;
    private PreparedStatement preparedStatement;
    public void creator(){
        Scanner scanner=new Scanner(System.in);
        System.out.println("enter name");
        name=scanner.nextLine();
        System.out.println("enter stdnum");
        stdnum=scanner.nextLine();
        System.out.println("enter enter year");
        enYear=scanner.nextLine();
        System.out.println("enter average");
        average=Double.parseDouble(scanner.nextLine());
        try{
        //Class.forName("oracle.jdbc.driver.oracleDriver");
            System.out.println("d");
             connection = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe" ,"shayer","crysises2047");
             preparedStatement=connection.prepareStatement("insert into student (stdnum,studentName,enYear,average)values (?,?,?,?)");
            preparedStatement.setString(1,stdnum);
            preparedStatement.setString(2,name);
            preparedStatement.setString(3,enYear);
            preparedStatement.setDouble(4,average);
            preparedStatement.executeUpdate();
            preparedStatement.close();
            connection.close();

        }
        catch (Exception e){
            System.out.println(e.toString());
        }

    }
    public void edit(String field){
        Scanner scanner=new Scanner(System.in);
        String temp;
        try{
         connection = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe" ,"shayer","crysises2047");
         preparedStatement=connection.prepareStatement("update student set "+field+"=? where stdnum=?");
            System.out.println("enter new value");
            temp=scanner.nextLine();
        preparedStatement.setString(1,temp);
        preparedStatement.setString(2,stdnum);
        preparedStatement.executeUpdate();
        preparedStatement.close();
        connection.close();}
        catch(Exception e){
            System.out.println("error");
        }
    }

    public void setStdnum(String stdnum) {
        this.stdnum = stdnum;
    }
    public void delete(){
        try{
        connection = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe" ,"shayer","crysises2047");
        preparedStatement=connection.prepareStatement("delete from student where stdnum=?");
        preparedStatement.setString(1,stdnum);
        preparedStatement.executeUpdate();
        preparedStatement.close();
        connection.close();
    }catch(Exception e){}
    }
    public void infoPrinter(){
        try {
            connection = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe", "shayer", "crysises2047");
            preparedStatement=connection.prepareStatement("select * from student where stdnum=?");
            preparedStatement.setString(1,stdnum);
            preparedStatement.close();
            connection.close();

        }catch(Exception e){}
    }
}
