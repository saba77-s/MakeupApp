package model;

import observer.Subject;

import java.util.Objects;

public class Brands extends Subject {
    private String name;
    private static Ambassador ambassador;
    private int pay;

    public Brands(String name, int pay) {
        this.name = name;
        this.pay = pay;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setAmbassador(Ambassador ambassador) {
        this.ambassador = ambassador;
        if (ambassador.getBrands() != this) {
            ambassador.setBrands(this);
        }
        addObserver(ambassador);
        notifyObservers(this);
    }

    public void setPay(int pay) {
        this.pay = pay;
    }

    public String getName() {
        return this.name;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        Brands brands = (Brands) o;
        return name.equals(brands.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name);
    }

    public static Ambassador getAmbassador() {
        return ambassador;
    }

    public int getPay() {
        return pay;
    }
}
