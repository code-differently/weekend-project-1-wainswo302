package org.codedifferently;

import java.util.Random;


public class Calculator {
    static double calculatedTax;
    static Random r = new Random();

    public static double calcTax (double billAmount, double tax){
        calculatedTax = billAmount * (tax / 100);
        return calculatedTax;
    } // return random tax rate between 0-10%
    public static double returnRandomTaxRate() {
        double taxRate = r.nextDouble(10);
        return taxRate/100;
    }//return actual taxes to be billed
    public static double calculateTax(double totalPrice, double taxRate) {
        return totalPrice * (taxRate / 100);
    }
    public static double calculateSubtotal(double appetizer,double entree, double drink) {
        return appetizer+entree+drink;
    }
    public static double calculateTrueTotal(double subtotal, double tax){
        return subtotal+tax;
    }
    public static double calculateBudget(double userBudget, double trueTotal){
        return userBudget+trueTotal;
    }




    }

