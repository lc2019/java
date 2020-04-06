package pro1;
/*
学生类10个成员变量
    学号 姓名 性别 班级 年龄 java成绩 c成绩 php成绩 html5成绩 总分 rank
 */

/**
 * 学生实体类
 */
public class Student {
    /*
    成员变量
     */
    private int id;
    private String name;
    private boolean gender;
    private String className;
    private float javaScore;
    private float cScore;
    private float phpScore;
    private float htmlScore;
    private float totalScore;

    /**
     * @param id        学号
     * @param name      姓名
     * @param gender    性别
     * @param className 班级
     * @param javaScore java成绩
     * @param cScore    c成绩
     * @param phpScore  php成绩
     * @param htmlScore html成绩
     */
    public Student(int id, String name, boolean gender, String className, float javaScore, float cScore, float phpScore, float htmlScore) {
        this.id = id;
        this.name = name;
        this.gender = gender;
        this.className = className;
        this.javaScore = javaScore;
        this.cScore = cScore;
        this.phpScore = phpScore;
        this.htmlScore = htmlScore;
        this.totalScore = javaScore + cScore + phpScore + htmlScore;
    }

    private float rank;

    /*
    学生类无参构造方法
     */
    public Student() {
    }

    ;

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

    public boolean isGender() {
        return gender;
    }

    public void setGender(boolean gender) {
        this.gender = gender;
    }

    public String getClassName() {
        return className;
    }

    public void setClassName(String className) {
        this.className = className;
    }

    public float getJavaScore() {
        return javaScore;
    }

    public void setJavaScore(float javaScore) {
        // 500 100 150
        //原来的总成绩-原来的java成绩
        totalScore -= this.javaScore;

        //使用传递参数赋值新的成绩
        this.javaScore = javaScore;

        //总成绩加上原来的java成绩
        totalScore += this.javaScore;
    }

    public float getcScore() {
        return cScore;
    }

    public void setcScore(float cScore) {
        // 500 100 150
        //原来的总成绩-原来的java成绩
        totalScore -= this.cScore;

        //使用传递参数赋值新的成绩
        this.cScore = cScore;

        //总成绩加上原来的java成绩
        totalScore += this.cScore;
    }

    public float getPhpScore() {
        return phpScore;
    }

    public void setPhpScore(float phpScore) {
        // 500 100 150
        //原来的总成绩-原来的java成绩
        totalScore -= this.phpScore;

        //使用传递参数赋值新的成绩
        this.javaScore = phpScore;

        //总成绩加上原来的java成绩
        totalScore += this.phpScore;
    }

    public float getHtmlScore() {
        return htmlScore;
    }

    public void setHtmlScore(float htmlScore) {
        // 500 100 150
        //原来的总成绩-原来的java成绩
        totalScore -= this.htmlScore;

        //使用传递参数赋值新的成绩
        this.javaScore = htmlScore;

        //总成绩加上原来的java成绩
        totalScore += this.htmlScore;
    }

    public float getTotalScore() {
        return totalScore;
    }

    public void setTotalScore(float totalScore) {
        this.totalScore = totalScore;
    }

    public float getRank() {
        return rank;
    }

    public void setRank(float rank) {
        this.rank = rank;
    }
}
