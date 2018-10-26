package com.naruar.naruar.model;

import java.util.Date;

public class ProductReview {
    private int id;
    private int product_id;
    private String review;
    private Date created_at;

    public ProductReview(int id, int product_id, String review, Date created_at) {
        this.id = id;
        this.product_id = product_id;
        this.review = review;
        this.created_at = created_at;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getProduct_id() {
        return product_id;
    }

    public void setProduct_id(int product_id) {
        this.product_id = product_id;
    }

    public String getReview() {
        return review;
    }

    public void setReview(String review) {
        this.review = review;
    }

    public Date getCreated_at() {
        return created_at;
    }

    public void setCreated_at(Date created_at) {
        this.created_at = created_at;
    }
}
