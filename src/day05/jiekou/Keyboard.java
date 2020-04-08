package day05.jiekou;


public class Keyboard {
    //keyboard
    private String name;
    private int keycount;


    public Keyboard() {
    }

    public Keyboard(String name, int keycount) {
        this.name = name;
        this.keycount = keycount;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getKeycount() {
        return keycount;
    }

    public void setKeycount(int keycount) {
        this.keycount = keycount;
    }

    public void coing() {
        System.out.println("pilipala coing");
    }
}
