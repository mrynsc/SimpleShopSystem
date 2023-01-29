package com.mycompany.mavenproject1.user;

import com.mycompany.mavenproject1.cart.Cart;
import com.mycompany.mavenproject1.product.*;

import java.util.ArrayList;
import java.util.List;
import java.util.OptionalDouble;
import java.util.Scanner;

public class Seller {
    public void callSellerMenu(Scanner scan) {
        int cikis = 0;
        String choice;
        while (cikis != 20) {

            choice = scan.next().toLowerCase();

            switch (choice) {
                case "a" -> getFruits();
                case "b" -> getDairy();
                case "c" -> getSarkuteri();
                case "d" -> getAlcohols();
                case "20" -> cikis = 20;
            }

        }


    }

    private void getFruits(){
        Fruit fruit = new Fruit();
        List<Double> averagePrice = new ArrayList<>();


        for (Product line : fruit.getProducts()) {
            averagePrice.add(line.getProductPrice());
        }
        int size = averagePrice.size();

        OptionalDouble average = averagePrice.stream().mapToDouble(Double::doubleValue).average();
        System.out.println("Average Price: "+average.getAsDouble());
        System.out.println("Stock: "+size);





    }
    private void getDairy(){
        Dairy dairy = new Dairy();
        List<Double> averagePrice = new ArrayList<>();


        for (Product line : dairy.getProducts()) {
            averagePrice.add(line.getProductPrice());
        }
        int size = averagePrice.size();

        OptionalDouble average = averagePrice.stream().mapToDouble(Double::doubleValue).average();
        System.out.println("Average Price: "+average.getAsDouble());
        System.out.println("Stock: "+size);



    }
    private void getSarkuteri(){
        Sarkuteri sarkuteri = new Sarkuteri();
        List<Double> averagePrice = new ArrayList<>();


        for (Product line : sarkuteri.getProducts()) {
            averagePrice.add(line.getProductPrice());
        }
        int size = averagePrice.size();

        OptionalDouble average = averagePrice.stream().mapToDouble(Double::doubleValue).average();
        System.out.println("Average Price: "+average.getAsDouble());
        System.out.println("Stock: "+size);


    }

    private void getAlcohols(){
        Alcohol alcohol = new Alcohol();
        List<Double> averagePrice = new ArrayList<>();


        for (Product line : alcohol.getProducts()) {
            averagePrice.add(line.getProductPrice());
        }
        int size = averagePrice.size();

        OptionalDouble average = averagePrice.stream().mapToDouble(Double::doubleValue).average();
        System.out.println("Average Price: "+average.getAsDouble());
        System.out.println("Stock: "+size);

    }




}
