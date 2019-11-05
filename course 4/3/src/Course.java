public class Course {
    private double score;
    private String pass;

    public void setScore(double score) {
        this.score = score;
    }

    public void setPass() {
        if(score<10)
            pass="not passed";
        else
            pass="passed";
    }

    public String isPass() {
        return pass;
    }

    public double getScore() {
        return score;
    }
}
