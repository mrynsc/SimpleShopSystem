package com.mycompany.mavenproject1.cart;

import com.mycompany.mavenproject1.product.Product;


public class Cart {

    private Product product;
    private double productKg;

    public Cart(){

    }

    public Cart(Product product) {
        this.product = product;
    }

    public Cart(Product product, double productKg) {
        this.product = product;
        this.productKg = productKg;
    }

    public Product getProduct() {
        return product;
    }

    public double getProductKg() {
        return productKg;
    }

    @Override
    public String toString() {
        return "Cart{" +
                "product=" + product +
                '}';
    }
}
