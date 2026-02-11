package org.codedifferently;

import java.util.Random;

class RandomGenerator {
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
    public static String generateReceiptCode(String fullName) {
        int visitID = (int) (Math.random() * 99999);
        String str = fullName.substring(0,3);
        String upperCase = str.toUpperCase();
        return upperCase + visitID;
    }
    //generate random app prices from $5-$15
    public static double generateAppetizerPrice(){
        appetizer = r.nextDouble(5,16);
        return appetizer;
    }//generate random item prices from $5-$30
    public static double generateEntreePrice(){
        entree = r.nextDouble(5,31);
        return entree;
    }//generate random drink prices from $1-$10
    public static double generateDrinkPrice(){
        drink = r.nextDouble(1,11);
        return drink;
    }




}

