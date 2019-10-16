package ru.itpark.model;

public class Rate {
    private String id;
    private String name;
    private String description;
    private int price;
    private String internet;

    public Rate() {
    }

    public Rate(String id, String name, String description, int price, String internet) {
        this.id = id;
        this.name = name;
        this.description = description;
        this.price = price;
        this.internet = internet;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public String getInternet() {
        return internet;
    }

    public void setInternet(String internet) {
        this.internet = internet;
    }

    @Override
    public String toString() {
        return name + '\'' +
                "  " + description + '\'' +
                "  " + price +
                " руб, " + internet;
    }
}
