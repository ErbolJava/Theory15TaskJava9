public class Xbox extends Microsoft{
    private int YearOfIssue;
    private String name;

    @Override
    public String toString() {
        return "Xbox{" +
                "YearOfIssue=" + YearOfIssue +
                ", name='" + name + '\'' +
                '}';
    }

    public int getYearOfIssue() {
        return YearOfIssue;
    }

    public void setYearOfIssue(int yearOfIssue) {
        YearOfIssue = yearOfIssue;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Xbox(int yearOfIssue, String name) {
        super("Bill Gates",1975);
        this.YearOfIssue = yearOfIssue;
        this.name = name;
    }
    public String thirdGeneration(){
        return name;
    }
    public String createdLocation(){
        return "America";
    }
}
