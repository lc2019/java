package day04.Constructor;

public class demo2 {
    private int id;
    private double balance;
    private double ann;

    public demo2(int id, double balance, double ann) {
        this.id = id;
        this.balance = balance;
        this.ann = ann;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public double getAnn() {
        return ann;
    }

    public void setAnn(double ann) {
        this.ann = ann;
    }

    //提款
    public void withdrw(double amount) {
        if (balance < amount) {
            System.out.println("余额不足");
            return;
        }
        balance -= amount;
        System.out.println("取钱成功" + amount);
    }

    public void deposit(double amount) {//存钱
        if (amount > 0) {
            balance += amount;
            System.out.println("存钱钱成功" + amount);
        }

    }
}

