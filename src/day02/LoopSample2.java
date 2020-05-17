package day02;

/**
 * ��ӡ100-200������
 * <p>
 * LoopSample2
 * ������:leichao
 * ʱ�䣺2020��5��10��-����4:56:52
 *
 * @version 1.0.0
 */
public class LoopSample2 {
    public static void main(String[] args) {
        for (int i = 100; i <= 200; i += 2) {
            boolean flag = true;
            for (int j = 2; j < i; j++) {
                if (i % j == 0) {
                    flag = false;
                    break;
                }
            }
            if (!flag) {
                continue;
            }
            System.out.println(i);
        }

    }

}
