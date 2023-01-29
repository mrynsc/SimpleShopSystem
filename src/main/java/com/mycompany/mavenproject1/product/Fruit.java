/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.mavenproject1.product;

import com.mycompany.mavenproject1.category.Category;

import java.util.ArrayList;

public class Fruit extends Product{

    private ArrayList<Product> fruits;

    public Fruit() {
    }

    public Fruit(String productName, double productPrice, Category productCategory, int productId,String productionDate,String consumptionDate) {
        super(productName, productPrice, productCategory,productId,productionDate,consumptionDate);
    }

    @Override
    public ArrayList<Product> getProducts(){
        fruits = new ArrayList<>();

        fruits.add(new Fruit("Tomatoes",2.0,new Category("Fruits"),1,"12 Mar 2022","12 Mar 2023"));
        fruits.add(new Fruit("Potatoes",2.5,new Category("Fruits"),2,"12 Mar 2022","12 Mar 2023"));
        fruits.add(new Fruit("Pepper",1.3,new Category("Fruits"),3,"12 Mar 2022","12 Mar 2023"));
        fruits.add(new Fruit("Onion",3.5,new Category("Fruits"),4,"12 Mar 2022","12 Mar 2023"));
        fruits.add(new Fruit("Carrot",2.0,new Category("Fruits"),5,"12 Mar 2022","12 Mar 2023"));
        fruits.add(new Fruit("Apple",0.5,new Category("Fruits"),6,"12 Mar 2022","12 Mar 2023"));
        fruits.add(new Fruit("Banana",3.0,new Category("Fruits"),7,"12 Mar 2022","12 Mar 2023"));


        for (Product line : fruits) {
            if (line instanceof Fruit){
                System.out.println(new StringBuilder().append(line.getProductId()).append(". ").append(line.getProductName()).append(" Price: ")
                        .append(line.getProductPrice()).append(" >> ").append(line.getProductCategory().getCategoryName()).append(" Production Date: ")
                        .append(line.getProductionDate()).append(" Consumption Date: ").append(line.getConsumptionDate()).toString());
            }
        }
        return fruits;
    }


}
