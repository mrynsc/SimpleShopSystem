package com.mycompany.mavenproject1.product;

import com.mycompany.mavenproject1.category.Category;

import java.util.ArrayList;

public class Alcohol extends Product{

    private ArrayList<Product> alcohols;


    public Alcohol(){

    }

    public Alcohol(String productName, double productPrice, Category productCategory, int productId,String productionDate,String consumptionDate) {
        super(productName, productPrice, productCategory, productId,productionDate,consumptionDate);
    }

    @Override
    public ArrayList<Product> getProducts(){
        alcohols = new ArrayList<>();

        alcohols.add(new Alcohol("Beer",1.0,new Category("Alcohols"),1,"12 Mar 2022","12 Mar 2023"));
        alcohols.add(new Alcohol("White Wine",4.0,new Category("Alcohols"),2,"12 Mar 2022","12 Mar 2023"));
        alcohols.add(new Alcohol("Red Wine",3.5,new Category("Alcohols"),3,"12 Mar 2022","12 Mar 2023"));
        alcohols.add(new Alcohol("Whiskey",2.5,new Category("Alcohols"),4,"12 Mar 2022","12 Mar 2023"));
        alcohols.add(new Alcohol("Vodka",4.5,new Category("Alcohols"),5,"12 Mar 2022","12 Mar 2023"));

        for (Product line : alcohols) {
            if (line instanceof Alcohol){
                System.out.println(new StringBuilder().append(line.getProductId()).append(". ").append(line.getProductName()).append(" Price: ")
                        .append(line.getProductPrice()).append(" >> ").append(line.getProductCategory().getCategoryName()).append(" Production Date: ")
                        .append(line.getProductionDate()).append(" Consumption Date: ").append(line.getConsumptionDate()).toString());
            }
        }
        return alcohols;
    }


}
