package org.codedifferently;

import java.util.Random;

public class RandomGenerator {
    String storeName = "Fatboy Freddy's";
    int visitID;
    String couponCode;
    double userBudget;
    double taxRate;
    double discount;
    static double entree;
    static double appetizer;
    static double drink;
    static Random r = new Random();

// generate receipt code using first and last initial and random number 0-9999
    public String generateReceiptCode(String fullName) {
        visitID = (int) (Math.random() * 99999);
        String str =fullName.toUpperCase(substring(0,3));
        return str + visitID;
    }
    //generate random app prices from $5-$15
    public static double generateAppetizerPrice(){
        return appetizer = r.nextDouble(5,16);
    }//generate random item prices from $5-$30
    public static double generateEntreePrice(){
        return entree = r.nextDouble(5,31);
    }//generate random drink prices from $1-$10
    public static double generateDrinkPrice(){
        return drink = r.nextDouble(1,11);
    }

//    public void setDiscount(double discount) {
//        this.discount = discount;


}

