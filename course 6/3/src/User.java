import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

public class User  {
    private String userCode,userName,email,grade,passWord;
    private int age;
    Connection connection;
    PreparedStatement preparedStatement;


    public void creator(){

        try {
            connection = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:orcl", "shayer", "crysises2047");
            preparedStatement=connection.prepareStatement("insert into User(UserCode,UserName,Email,PassWord,Grade,Age) values (?,?,?,?,?,?)");
            preparedStatement.setString(1,userCode);
            preparedStatement.setString(2,userName);
            preparedStatement.setString(3,email);
            preparedStatement.setString(4,passWord);
            preparedStatement.setString(5,grade);
            preparedStatement.setInt(6,age);
        }catch(Exception e){

        }
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public void setGrade(String grade) {
        this.grade = grade;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setUserCode(String userCode) {
        this.userCode = userCode;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setPassWord(String passWord) {
        this.passWord = passWord;
    }
    public void passwordChecker(String string) throws UserException
    {
        if (!string.equalsIgnoreCase(passWord))
            throw new UserException("repeat of password does'nt match with password");
    }

     void  nullChecker(String temp)throws UserException{
        String property;
        if (userCode==null)property="UserCode";
        else if (userName==null)property="UserName";
        else if (email==null)property="E-mail";
        else if (passWord==null)property="PassWord";
        else if (temp==null)property="repeat of password";
        else if (String.valueOf(age)==null)property="age";
        else return;
          throw new UserException(property+" can not be empty");
    }
    public void emailChecker() throws UserException{
        if (email.substring(email.length()-10)!="@gmail.com")
            throw new UserException("Invalid Gmail");

    }

}