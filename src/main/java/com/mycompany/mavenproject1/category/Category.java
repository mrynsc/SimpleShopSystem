/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.mavenproject1.category;


public class Category {
    
    private String categoryName;

    public Category(){
        
    }

    public Category(String categoryName) {
        this.categoryName = categoryName;
    }


    public String getCategoryName() {
        return categoryName;
    }

    @Override
    public String toString() {
        return "Category{" +
                "categoryName='" + categoryName + '\'' +
                '}';
    }
}
