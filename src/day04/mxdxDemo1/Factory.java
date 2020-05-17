package day04.mxdxDemo1;

/**
 * 修理店
 */
public class Factory {
    private String name;
    private String tel;
    private String address;

    public Factory() {
    }

    public Factory(String name, String tel, String address) {
        this.name = name;
        this.tel = tel;
        this.address = address;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getTel() {
        return tel;
    }

    public void setTel(String tel) {
        this.tel = tel;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    /**
     * 修理电脑-需要一个电脑对象
     * 1.获取电脑是否正常来判断
     * 2.修理电脑，更改电脑的属性
     */
    public void repair(computer c) throws InterruptedException {
        if (false == c.isScreenShow()) {
            System.out.println("电脑有问题,修理中。。。");
            Thread.sleep(10);
            c.setScreenShow(true);
            System.out.println("修理完毕");
        } else {
            System.out.println("电脑没问题");
        }
    }
}
