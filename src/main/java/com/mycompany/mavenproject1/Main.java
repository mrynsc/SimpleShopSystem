/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.mavenproject1;

import com.mycompany.mavenproject1.cart.Cart;
import com.mycompany.mavenproject1.product.*;
import com.mycompany.mavenproject1.user.Seller;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;


public class Main {
    private final Scanner scan = new Scanner(System.in);
    private final ArrayList<Cart> cartArrayList = new ArrayList<>();
    private int cikis = 0;

    public static void main(String[] args) {

        System.out.println("Press 1 if you are a customer and 2 if you are a seller");



        if (new Main().scan.nextInt()==1){
            new Main().start();
        }else  {
            new Main().startSeller();
        }

    }

    private void startSeller(){
        System.out.println("Select product type");
        System.out.println("Go to the products you want with the numbers below \n" +
                "   A - Fruit and Vegetable\n   B - Dairy products\n   C - Charcuterie\n   D - Alcohols\n Your Choice: ");
        new Seller().callSellerMenu(scan);
    }


    private void welcomeText(){
        System.out.println("     ==Welcome to Our Food Market!==");
        System.out.println("Go to the products you want with the numbers below \n" +
                "   A - Fruit and Vegetable\n   B - Dairy products\n   C - Charcuterie\n   D - Alcohols\n Your Choice: ");

    }

    private void callMenu(){
        String choice;
        if (cikis!=20){

            choice = scan.next().toLowerCase();

            getProducts(choice);

        }

    }
    private void start(){
        welcomeText();
        callMenu();
    }

    private void getProducts(String scanner){
        switch (scanner){
            case "a" -> getFruits();
            case "b" -> getDairy();
            case "c" -> getSarkuteri();
            case "d" -> getAlcohols();

            case "20" -> {
                cikis = 20;
                System.exit(0);
            }
        }
    }



    private void getFruits(){
        Fruit fruit = new Fruit();
        ArrayList<Product> arrayList;
        arrayList=fruit.getProducts();
        System.out.println("Select the number of the product you want to add.");

        int choice ;
        choice = scan.nextInt();

        if (choice>0 && choice < 8){
            System.out.println(arrayList.get(choice - 1).getProductName() + " How many kg?");
        }
        int kgChoice ;
        kgChoice = scan.nextInt();

        if (kgChoice > 0){
            cartArrayList.add(new Cart(arrayList.get(choice - 1),kgChoice));
            System.out.println(arrayList.get(choice - 1).getProductName() + " " +
                    kgChoice + " kg added to cart." + "Total Price: " + arrayList.get(choice - 1).getProductPrice() * kgChoice +
                    " \nA - Fruit and Vegetable\n   B - Dairy products\n   C - Charcuterie\n   D - Alcohols. Type 100 to proceed to checkout.");

        }

        String status;
        status = scan.next();

        if (status.equalsIgnoreCase("100")){
            getCartSummary();
        }
        if (status.equalsIgnoreCase("a")){
            getFruits();
        }
        if (status.equalsIgnoreCase("b")){
            getDairy();
        }
        if (status.equalsIgnoreCase("c")){
            getSarkuteri();
        }
        if (status.equalsIgnoreCase("d")){
            getAlcohols();
        }

    }
    private void getDairy(){
        Dairy dairy = new Dairy();
        ArrayList<Product> arrayList;
        arrayList=dairy.getProducts();
        System.out.println("Select the number of the product you want to add.");

        int choice ;
        choice = scan.nextInt();

        if (choice>0 && choice < 8){
            System.out.println(arrayList.get(choice - 1).getProductName() + " How many kg?");
        }
        int kgChoice ;
        kgChoice = scan.nextInt();

        if (kgChoice > 0){
            cartArrayList.add(new Cart(arrayList.get(choice - 1),kgChoice));
            System.out.println(arrayList.get(choice - 1).getProductName() + " " +
                    kgChoice + " kg added to cart." + "Total Price: " + arrayList.get(choice - 1).getProductPrice() * kgChoice +
                    "\nA - Fruit and Vegetable\n   B - Dairy products\n   C - Charcuterie\n   D - Alcohols. Type 100 to proceed to checkout.");

        }

        String status;
        status = scan.next();

        if (status.equalsIgnoreCase("100")){
            getCartSummary();
        }
        if (status.equalsIgnoreCase("a")){
            getFruits();
        }
        if (status.equalsIgnoreCase("b")){
            getDairy();
        }
        if (status.equalsIgnoreCase("c")){
            getSarkuteri();
        }
        if (status.equalsIgnoreCase("d")){
            getAlcohols();
        }

    }
    private void getSarkuteri(){
        Sarkuteri sarkuteri = new Sarkuteri();
        ArrayList<Product> arrayList;
        arrayList=sarkuteri.getProducts();
        System.out.println("Select the number of the product you want to add.");

        int choice ;
        choice = scan.nextInt();

        if (choice>0 && choice < 8){
            System.out.println(arrayList.get(choice - 1).getProductName() + " How many kg?");
        }
        int kgChoice ;
        kgChoice = scan.nextInt();

        if (kgChoice > 0){
            cartArrayList.add(new Cart(arrayList.get(choice - 1),kgChoice));
            System.out.println(arrayList.get(choice - 1).getProductName() + " " +
                    kgChoice + " kg added to cart." + "Total Price: " + arrayList.get(choice - 1).getProductPrice() * kgChoice +
                    " \nA - Fruit and Vegetable\n   B - Dairy products\n   C - Charcuterie\n   D - Alcohols. Type 100 to proceed to checkout.");

        }

        String status;
        status = scan.next();

        if (status.equalsIgnoreCase("100")){
            getCartSummary();
        }
        if (status.equalsIgnoreCase("a")){
            getFruits();
        }
        if (status.equalsIgnoreCase("b")){
            getDairy();
        }
        if (status.equalsIgnoreCase("c")){
            getSarkuteri();
        }
        if (status.equalsIgnoreCase("d")){
            getAlcohols();
        }

    }

    private void getAlcohols(){
        Alcohol alcohol = new Alcohol();
        ArrayList<Product> arrayList;
        arrayList=alcohol.getProducts();
        System.out.println("Select the number of the product you want to add.");

        int choice ;
        choice = scan.nextInt();

        if (choice>0 && choice < 8){
            System.out.println(arrayList.get(choice - 1).getProductName() + " How many kg?");
        }
        int kgChoice ;
        kgChoice = scan.nextInt();

        if (kgChoice > 0){
            cartArrayList.add(new Cart(arrayList.get(choice - 1),kgChoice));
            System.out.println(arrayList.get(choice - 1).getProductName() + " " +
                    kgChoice + " kg added to cart." + "Total Price: " + arrayList.get(choice - 1).getProductPrice() * kgChoice +
                    " \nA - Fruit and Vegetable\n   B - Dairy products\n   C - Charcuterie\n   D - Alcohols. Type 100 to proceed to checkout.");

        }

        String status;
        status = scan.next();

        if (status.equalsIgnoreCase("100")){
            getCartSummary();
        }
        if (status.equalsIgnoreCase("a")){
            getFruits();
        }
        if (status.equalsIgnoreCase("b")){
            getDairy();
        }
        if (status.equalsIgnoreCase("c")){
            getSarkuteri();
        }
        if (status.equalsIgnoreCase("d")){
            getAlcohols();
        }
    }



    private void getCartSummary(){
        if (cartArrayList.size()>0){
            List<Double> prices = new ArrayList<>();

            for (Cart line : cartArrayList) {
                prices.add(line.getProduct().getProductPrice() * line.getProductKg());
                System.out.println("Name: " + line.getProduct().getProductName() + " Price: " +
                        line.getProduct().getProductPrice() + " >> " + line.getProduct().getProductCategory().getCategoryName() +
                        " KG: " + line.getProductKg());
            }
            double sum = prices.stream().mapToDouble(Double::doubleValue).sum();
            System.out.println("Total Price:  "+ sum);
            System.out.println("Pay ");
            if (scan.nextDouble()>=sum){
                System.out.println("Your payment has been received. Thanks");
            }else {
                System.out.println("Your Money is Not Enough :(");
            }

        }


    }

}
