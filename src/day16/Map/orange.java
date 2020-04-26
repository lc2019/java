package day16.Map;

public class orange {
    private String name;
    private String price;

    public orange() {
    }

    public orange(String name, String price) {
        this.name = name;
        this.price = price;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPrice() {
        return price;
    }

    public void setPrice(String price) {
        this.price = price;
    }

    @Override
    public String toString() {
        return "orange{" +
                "name='" + name + '\'' +
                ", price='" + price + '\'' +
                '}';
    }
}
