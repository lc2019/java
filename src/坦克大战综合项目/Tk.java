package 坦克大战综合项目;

import java.awt.*;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

/**
 * 窗口的初始化
 */
public class Tk extends Frame {
    private int x = 100, y = 100;

    /**
     * 构造方法初始化窗口的大小
     */
    public Tk() {
        //设置窗口位置
        this.setLocation(400, 100);
        //设置窗口大小
        this.setSize(800, 600);

        this.addKeyListener(new TkListenner());
    }

    @Override
    public void paint(Graphics g) {
        //移动坐标
        g.fillRect(x, y, 50, 50);
        x++;
    }

    private class TkListenner extends KeyAdapter {
        @Override
        public void keyPressed(KeyEvent e) {
            int key = e.getKeyCode();
            switch (key) {
//                case KeyEvent.VK_LEFT:
//                case KeyEvent.VK_LEFT:
//                case KeyEvent.VK_LEFT:
//                case KeyEvent.VK_LEFT:
            }
            x++;
        }

        @Override
        public void keyReleased(KeyEvent e) {

        }
    }
}
