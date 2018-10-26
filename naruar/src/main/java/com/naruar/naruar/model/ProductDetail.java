package com.naruar.naruar.model;

import java.util.List;

public class ProductDetail {

    public Product product;
    public ProductImage productImage;
    public List<ProductReview> prodcutReview;
    public List<Ads> ads;

    public ProductDetail() {
    }

    public ProductDetail(Product product, ProductImage productImage, List<ProductReview> prodcutReview, List<Ads> ads) {
        this.product = product;
        this.productImage = productImage;
        this.prodcutReview = prodcutReview;
        this.ads = ads;
    }

    public Product getProduct() {
        return product;
    }

    public void setProduct(Product product) {
        this.product = product;
    }

    public ProductImage getProductImage() {
        return productImage;
    }

    public void setProductImage(ProductImage productImage) {
        this.productImage = productImage;
    }

    public List<ProductReview> getProdcutReview() {
        return prodcutReview;
    }

    public void setProdcutReview(List<ProductReview> prodcutReview) {
        this.prodcutReview = prodcutReview;
    }

    public List<Ads> getAds() {
        return ads;
    }

    public void setAds(List<Ads> ads) {
        this.ads = ads;
    }
}
