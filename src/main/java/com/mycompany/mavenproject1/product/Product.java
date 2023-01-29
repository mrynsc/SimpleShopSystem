/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.mavenproject1.product;

import com.mycompany.mavenproject1.category.Category;
import com.mycompany.mavenproject1.interfaces.ProductListener;

import java.util.ArrayList;


public abstract class Product implements ProductListener {
    
    private String productName;
    private double productPrice;
    private Category productCategory;

    private int productId;

    private String productionDate;
    private String consumptionDate;

    public Product(){
        
    }



    public Product(String productName, double productPrice, Category productCategory,int productId,String productionDate,String consumptionDate) {
        this.productName = productName;
        this.productPrice = productPrice;
        this.productCategory = productCategory;
        this.productId = productId;
        this.productionDate = productionDate;
        this.consumptionDate = consumptionDate;
    }

    public String getProductionDate() {
        return productionDate;
    }

    public String getConsumptionDate() {
        return consumptionDate;
    }

    public int getProductId() {
        return productId;
    }

    public String getProductName() {
        return productName;
    }

    public double getProductPrice() {
        return productPrice;
    }

    public Category getProductCategory() {
        return productCategory;
    }


    @Override
    public String toString() {
        return "Product{" +
                "productName='" + productName + '\'' +
                ", productPrice=" + productPrice +
                ", productCategory=" + productCategory +
                ", productId=" + productId +
                ", productionDate='" + productionDate + '\'' +
                ", consumptionDate='" + consumptionDate + '\'' +
                '}';
    }

    @Override
    public ArrayList<Product> getProducts() {
        return null;
    }


}
