public class User {
    private int age,grade ;
    private String name,nation;



    public void ageChecker () throws UserException{
        if (age <23)
            throw new UserException("age is lower than legal age ");
        else
            System.out.println("your age is legal ");
    }
    public void  gradeChecker () throws UserException{
        if (grade<3)
            throw new UserException(" grade is lower than legal grade ");
        else
            System.out.println("your age is legal ");
    }
    public void nationChecker () throws UserException{
        if (nation.equalsIgnoreCase("ok"))
            throw new UserException(" nation is not iranian");
        else
            System.out.println("your natoin  is legal ");
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setGrade(int grade) {
        this.grade = grade;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setNation(String nation) {
        this.nation = nation;
    }
}
