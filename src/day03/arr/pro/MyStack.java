package day03.arr.pro;

/**
 * 模拟栈的push pop
 */
public class MyStack {
    //定义数组的初始长度为10
    private Object[] elements = new Object[10];

    //栈针
    private int index = -1;

    public MyStack() {

    }

    public Object[] getElements() {
        return elements;
    }

    public void setElements(Object[] elements) {
        this.elements = elements;
    }

    /**
     * 压栈
     *
     * @param obj
     */
    public void push(Object obj) {
        //判单是否超出容量
        if (this.index >= elements.length - 1) {
            System.out.println("容量满，压栈失败");
            return;
        }
        //先自增
        this.elements[++index] = obj;
        System.out.println("压栈 " + obj + " 栈针 " + index);
    }

    /**
     * 出栈,先进后出
     *
     * @return
     */
    public void pop() {
        if (this.index < 0) {
            System.out.println("栈空");
            return;
        }

        System.out.print("出栈 " + elements[index] + " 栈针 " + index);
        index--;
        System.out.println(" 栈针 " + index);
    }
}
