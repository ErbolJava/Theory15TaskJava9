public class Microsoft {
    private String director;
    private int yearOfIssue;

    @Override
    public String toString() {
        return "Microsoft{" +
                "director='" + director + '\'' +
                ", yearOfIssue=" + yearOfIssue +
                '}';
    }

    public String getDirector() {
        return director;
    }

    public void setDirector(String director) {
        this.director = director;
    }

    public int getYearOfIssue() {
        return yearOfIssue;
    }

    public void setYearOfIssue(int yearOfIssue) {
        this.yearOfIssue = yearOfIssue;
    }

    public Microsoft(String director, int yearOfIssue) {
        this.director = director;
        this.yearOfIssue = yearOfIssue;
    }
    public String returnDirectorsFriend(){
        return director;
    }
}
