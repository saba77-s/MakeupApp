package model;

public class Brands {
    private String name;
    private Ambassador ambassador;
    private int pay;

    public Brands(String name,Ambassador ambassador,int pay) {
        this.name = name;
        this.ambassador = ambassador;
        this.pay = pay;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setAmbassador(Ambassador ambassador) {
        this.ambassador = ambassador;
    }

    public void setPay(int pay) {
        this.pay = pay;
    }

    public String getName() {
        return this.name;
    }

    public Ambassador getAmbassador() {
        return ambassador;
    }

    public int getPay() {
        return pay;
    }
}
