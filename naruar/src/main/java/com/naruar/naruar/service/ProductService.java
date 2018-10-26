package com.naruar.naruar.service;

import com.naruar.naruar.model.*;
import org.springframework.stereotype.Service;

import java.util.*;

@Service
public class ProductService {

    public final String BUSINESS_DAYS = "business days";
    Map<Integer, Product> productMap;
    Map<Integer, ProductImage> productImageMap;
    Map<Integer, List<ProductReview>> productReviewMap;
    List<Ads> adsList;
    
    public ProductService() {
        this.productMap = new HashMap<>();
        setProducts();
        this.productImageMap = new HashMap<>();
        setProductImages();
        this.productReviewMap = new HashMap<>();
        setProductReview();
        this.adsList = new ArrayList<>();
        setAdsList();
    }

    
    
    public String getDeliverDays(int id){
        //TODO find days
        return BUSINESS_DAYS;
    }

    
    public ProductDetail getProductDetails(int id){
        ProductDetail productDetail = new ProductDetail();
        productDetail.setProduct(productMap.get(id));
        productDetail.setProductImage(productImageMap.get(id));
        productDetail.setProdcutReview(productReviewMap.get(id));
        productDetail.setAds(adsList);
        return productDetail;
    }


    void setAdsList(){
        Ads ads = new Ads(1,"Mens Bag","url_1");
        Ads ads1 = new Ads(2,"women jeans","url_2");
        adsList.add(ads);
        adsList.add(ads1);
    }

    public void setProductReview(){
        ProductReview pant = new ProductReview(1,1,"Good Pant", new Date());
        ProductReview pant1 = new ProductReview(1,1,"Good Pant", new Date());
        ProductReview tshirt = new ProductReview(1,1,"Good T-Shirt", new Date());
        ProductReview tshirt1 = new ProductReview(1,1,"Good T-Shirt", new Date());
        ProductReview jeans = new ProductReview(1,1,"Good Jeans", new Date());
        ProductReview jeans1 = new ProductReview(1,1,"Good Jeans", new Date());
        ProductReview bag = new ProductReview(1,1,"Good Bag", new Date());
        ProductReview bag1 = new ProductReview(1,1,"Good Bag", new Date());
        productReviewMap.put(1,Arrays.asList(pant));
        productReviewMap.put(2,Arrays.asList(pant1));
        productReviewMap.put(3,Arrays.asList(tshirt));
        productReviewMap.put(4,Arrays.asList(tshirt1));
        productReviewMap.put(5,Arrays.asList(jeans));
        productReviewMap.put(6,Arrays.asList(jeans1));
        productReviewMap.put(7,Arrays.asList(bag));
        productReviewMap.put(8,Arrays.asList(bag1));
    }

    public void setProductImages(){
        ProductImage pant = new ProductImage(1,1,"url_1");
        ProductImage pant1 = new ProductImage(2,2,"url_2");
        ProductImage tshirt = new ProductImage(3,3,"url_3");
        ProductImage tshirt1 = new ProductImage(4,4,"url_4");
        ProductImage jeans = new ProductImage(5,5,"url_5");
        ProductImage jeans1 = new ProductImage(6,6,"url_6");
        ProductImage bag = new ProductImage(7,7,"url_7");
        ProductImage bag1 = new ProductImage(8,82,"url_8");
        productImageMap.put(1,pant);
        productImageMap.put(2,pant1);
        productImageMap.put(3,tshirt);
        productImageMap.put(4,tshirt1);
        productImageMap.put(5,jeans);
        productImageMap.put(6,jeans1);
        productImageMap.put(7,bag);
        productImageMap.put(8,bag1);
    }
    public void setProducts(){
        Product pant = new Product(1," U S Polo Pant", ProductType.PANT," U S Polo Pant", 5,1999);
        Product pant1 = new Product(2,"Peter England Pant", ProductType.PANT,"Peter England Pant", 5,1599);
        Product tshirt = new Product(3," Peter England Tshirt", ProductType.TSHIRT," U S Polo Tshirt", 7,1799);
        Product tshirt1 = new Product(4," U S Polo Tshirt", ProductType.TSHIRT," Peter England Tshirt", 15,1699);
        Product jeans = new Product(5,"Peter England Pant", ProductType.JEANS," Peter England Jeans", 5,1099);
        Product jeans1 = new Product(6," U S Polo  Jeans", ProductType.JEANS," U S Polo  Jeans", 5,1099);
        Product bag = new Product(7,"American Bag", ProductType.BAG," American Bag", 5,1399);
        Product bag1 = new Product(8,"FastTrack Pant", ProductType.BAG," FastTrack Pant", 5,1299);
        productMap.put(1,pant);
        productMap.put(2,pant1);
        productMap.put(3,tshirt);
        productMap.put(4,tshirt1);
        productMap.put(5,jeans);
        productMap.put(6,jeans1);
        productMap.put(7,bag);
        productMap.put(8,bag1);
    }
}
