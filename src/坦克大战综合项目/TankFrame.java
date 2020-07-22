package 坦克大战综合项目;

import java.awt.*;

/**
 * 创建1个窗口
 * 显示1个窗口
 * 画出一个方块
 * 移动方块
 * 自动化
 * 响应键盘事件
 */
public class TankFrame {
    public static void main(String[] args) {
        Tk tk1 = new Tk();
        tk1.setVisible(true);

        for (; ; ) {
            try {
                Thread.sleep(25);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            //通过repaint去调用paint来移动方块
            tk1.repaint();
        }
    }
}
