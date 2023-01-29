/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.mavenproject1.product;

import com.mycompany.mavenproject1.category.Category;

import java.util.ArrayList;


public class Sarkuteri extends Product{

    private ArrayList<Product> sarkuteries;
    public Sarkuteri() {
    }

    public Sarkuteri(String productName, double productPrice, Category productCategory, int productId,String productionDate,String consumptionDate) {
        super(productName, productPrice, productCategory,productId,productionDate,consumptionDate);
    }

    @Override
    public ArrayList<Product> getProducts(){
        sarkuteries = new ArrayList<>();

        sarkuteries.add(new Sarkuteri("Bacon",1.5,new Category("Sarkuteri"),1,"12 Mar 2022","12 Mar 2023"));
        sarkuteries.add(new Sarkuteri("Sausage",2.0,new Category("Sarkuteri"),2,"12 Mar 2022","12 Mar 2023"));
        sarkuteries.add(new Sarkuteri("Salami",2.5,new Category("Sarkuteri"),3,"12 Mar 2022","12 Mar 2023"));
        sarkuteries.add(new Sarkuteri("Meat",3.0,new Category("Sarkuteri"),4,"12 Mar 2022","12 Mar 2023"));
        sarkuteries.add(new Sarkuteri("Chicken",1.5,new Category("Sarkuteri"),5,"12 Mar 2022","12 Mar 2023"));
        sarkuteries.add(new Sarkuteri("Duck",1.5,new Category("Sarkuteri"),6,"12 Mar 2022","12 Mar 2023"));



        for (Product line : sarkuteries) {
            if (line instanceof Sarkuteri){
                System.out.println(new StringBuilder().append(line.getProductId()).append(". ").append(line.getProductName()).append(" Price: ")
                        .append(line.getProductPrice()).append(" >> ").append(line.getProductCategory().getCategoryName()).append(" Production Date: ")
                        .append(line.getProductionDate()).append(" Consumption Date: ").append(line.getConsumptionDate()).toString());
            }
        }
        return sarkuteries;
    }
    
}
