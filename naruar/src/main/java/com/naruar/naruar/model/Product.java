package com.naruar.naruar.model;

public class Product {

    private int id;
    private String name;
    private ProductType type;
    private String description;
    private int quantity;
    private int price;

    public Product() {
    }

    public Product(int id, String name, ProductType type, String description, int quantity, int price) {
        this.id = id;
        this.name = name;
        this.type = type;
        this.description = description;
        this.quantity = quantity;
        this.price = price;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public ProductType getType() {
        return type;
    }

    public void setType(ProductType type) {
        this.type = type;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }
}
