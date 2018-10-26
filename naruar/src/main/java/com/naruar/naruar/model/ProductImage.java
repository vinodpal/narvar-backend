package com.naruar.naruar.model;

public class ProductImage{
    private int id;
    private int prduct_id;
    private String image_url;

    public ProductImage(int id, int prduct_id, String image_url) {
        this.id = id;
        this.prduct_id = prduct_id;
        this.image_url = image_url;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getPrduct_id() {
        return prduct_id;
    }

    public void setPrduct_id(int prduct_id) {
        this.prduct_id = prduct_id;
    }

    public String getImage_url() {
        return image_url;
    }

    public void setImage_url(String image_url) {
        this.image_url = image_url;
    }
}
