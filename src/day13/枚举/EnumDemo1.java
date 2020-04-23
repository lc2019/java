package day13.枚举;

/**
 * final 多例  私有构造器
 * 信息标志，信息分类
 */
public class EnumDemo1 {
    public static void main(String[] args) {
        Enum1 g1 = Enum1.GRIL;
        System.out.println(g1);

        /**
         * 强烈的约束性
         */
        sex(Enum1.BOY);

    }

    public static void sex(Enum1 e) {
        switch (e) {
            /**
             * 自动识别枚举类型
             */
            case GRIL:
                System.out.println("nvhai");
                break;
            case BOY:
                System.out.println("nanhai");
        }
    }
}
