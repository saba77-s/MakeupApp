package model;

import observer.BrandObservers;

public class Ambassador implements BrandObservers {
    private String followers;
    private String name;
    private Brands brands;

    public Ambassador(String followers, String username) {
        this.followers = followers;
        this.name = username;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setBrands(Brands brands) {
        this.brands = brands;
        if (Brands.getAmbassador() != this) {
            brands.setAmbassador(this);
        }

    }

    public void setFollowers(String followers) {
        this.followers = followers;
    }

    public Brands getBrands() {
        return this.brands;
    }

    public String getName() {
        return this.name;
    }

    public String getFollowers() {
        return this.followers;
    }

    @Override
    public void update(Brands brand) {
        System.out.println("new brand has been added!" + brand);
    }
}
