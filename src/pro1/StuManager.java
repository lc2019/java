package pro1;

/*
管理类
    学生类数组来保存学生对象
    增删查改 排序 过滤
 */
public class StuManager {
    /**
     * 准备1个学生类对象,用于保存调用构造方法时创建的学生数组
     */
    private Student[] allstu = null;
    private int size = 0;

    //常量
    private static final int DEFAULT_CAPACITY = 10;

    /**
     * StuManager 无参构造方法，需要初始化数组容量
     */
    public StuManager() {
        //数组容量初始化
        this.allstu = new Student[DEFAULT_CAPACITY];
    }

    /**
     * 用户指定底层数组初始化容量
     *
     * @param initCapcity
     */
    public StuManager(int initCapcity) {
        if (initCapcity <= 0) {
            this.allstu = new Student[DEFAULT_CAPACITY];
        } else {
            allstu = new Student[initCapcity];
        }
    }

    //添加方法

    /**
     * 添加学生的方法
     *
     * @param stu
     * @return 添加成功返回true，失败返回false
     */
    public boolean add(Student stu) {
        if (null == stu) {
            System.out.println("wuxiao");
            return false;
        }
        allstu[size++] = stu;
        return true;
    }

    private void grow(int minCap) {
        int oldCap = allstu.length;

        int newCap = oldCap + (oldCap >> 1) / 2;

        if (newCap - minCap < 0) {
            newCap = minCap;
        }

        Student[] tmp = new Student[newCap];

        for (int i = 0; i < allstu.length; i++) {
            tmp[i] = allstu[i];
        }

        allstu = tmp;
    }

    public void show() {
        for (Student stu : allstu) {
            System.out.println(stu);
        }
    }
}
