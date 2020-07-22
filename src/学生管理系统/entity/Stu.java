package 学生管理系统.entity;

public class Stu {
    private int id;
    private String name;
    private int age;
    private char gender;
    private int mScore;
    private int engScore;
    private int totalScore;
    private int rank;

    public Stu() {
    }

    public Stu(String name, int age, char gender, int mScore, int engScore) {
        this.name = name;
        this.age = age;
        this.gender = gender;
        this.mScore = mScore;
        this.engScore = engScore;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public char getGender() {
        return gender;
    }

    public void setGender(char gender) {
        this.gender = gender;
    }

    public int getmScore() {
        return mScore;
    }

    public void setmScore(int mScore) {
        this.mScore = mScore;
    }

    public int getEngScore() {
        return engScore;
    }

    public void setEngScore(int engScore) {
        this.engScore = engScore;
    }

    public int getTotalScore() {
        return totalScore;
    }

    public void setTotalScore(int totalScore) {
        this.totalScore = totalScore;
    }

    public int getRank() {
        return rank;
    }

    public void setRank(int rank) {
        this.rank = rank;
    }
}
