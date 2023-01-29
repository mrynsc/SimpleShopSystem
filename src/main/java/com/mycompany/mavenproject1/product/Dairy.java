/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.mavenproject1.product;

import com.mycompany.mavenproject1.category.Category;

import java.util.ArrayList;

public class Dairy extends Product {

    private ArrayList<Product> milks;

    public Dairy() {
    }

    public Dairy(String productName, double productPrice, Category productCategory, int productId,String productionDate,String consumptionDate) {
        super(productName, productPrice, productCategory,productId,productionDate,consumptionDate);
    }


    @Override
    public ArrayList<Product> getProducts(){
        milks = new ArrayList<>();

        milks.add(new Dairy("Yogurt",2.3,new Category("Dairy Products"),1,"12 Mar 2022","12 Mar 2023"));
        milks.add(new Dairy("Cheese",4.0,new Category("Dairy Products"),2,"12 Mar 2022","12 Mar 2023"));
        milks.add(new Dairy("Kefir",1.5,new Category("Dairy Products"),3,"12 Mar 2022","12 Mar 2023"));
        milks.add(new Dairy("Ayran",2.5,new Category("Dairy Products"),4,"12 Mar 2022","12 Mar 2023"));
        milks.add(new Dairy("Mozzarella",4.5,new Category("Dairy Products"),5,"12 Mar 2022","12 Mar 2023"));
        milks.add(new Dairy("White cheese",10.0,new Category("Dairy Products"),6,"12 Mar 2022","12 Mar 2023"));
        milks.add(new Dairy("Milk",0.5,new Category("Dairy Products"),7,"12 Mar 2022","12 Mar 2023"));

        for (Product line : milks) {
            if (line instanceof Dairy){
                System.out.println(new StringBuilder().append(line.getProductId()).append(". ").append(line.getProductName()).append(" Price: ")
                        .append(line.getProductPrice()).append(" >> ").append(line.getProductCategory().getCategoryName()).append(" Production Date: ")
                        .append(line.getProductionDate()).append(" Consumption Date: ").append(line.getConsumptionDate()).toString());
            }
        }
        return milks;
    }

}
