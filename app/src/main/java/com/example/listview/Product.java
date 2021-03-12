package com.example.listview;

public class Product {
private String name;
private int imageProduct;
private double productPrice;

    public Product() {
    }

    public Product(String name, int imageProduct, double productPrice) {
        this.name = name;
        this.imageProduct = imageProduct;
        this.productPrice = productPrice;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getImageProduct() {
        return imageProduct;
    }

    public void setImageProduct(int imageProduct) {
        this.imageProduct = imageProduct;
    }

    public double getProductPrice() {
        return productPrice;
    }

    public void setProductPrice(double productPrice) {
        this.productPrice = productPrice;
    }
}
