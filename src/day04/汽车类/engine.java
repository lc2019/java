package day04.汽车类;

public class engine {
    private String name;
    private float cap;

    public engine() {
    }

    public engine(String name, float cap) {
        this.name = name;
        this.cap = cap;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public float getCap() {
        return cap;
    }

    public void setCap(float cap) {
        this.cap = cap;
    }
}
