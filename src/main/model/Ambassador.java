package model;

public class Ambassador {
    private String followers;
    private String name;
    private Brands brands;

    public Ambassador(String followers, String name) {
        this.followers = followers;
        this.name = name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setBrands(Brands brands) {
        this.brands = brands;
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
}
