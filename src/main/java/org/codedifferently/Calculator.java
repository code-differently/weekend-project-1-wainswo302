package org.codedifferently;

import java.util.Random;
import java.util.Scanner;


public class Calculator {
    static double calculatedTax;
    static Random r = new Random();
    static Scanner sc = new Scanner (System.in);

    public static double calcTax(double subtotal, double tax) {
        calculatedTax = subtotal * tax;
        return roundTotals(calculatedTax);
    } // return random tax rate between 0-10%

    public static double returnRandomTaxRate() {
        double taxRate = r.nextDouble(1, 10);
        return taxRate / 100;
    }//return actual taxes to be billed

    public static double calculateSubtotal(double appetizer, double entree, double drink) {
        //        if (discount > 0) {
//            subtotal = subtotal * discount;
//        } else {
//        }
        return appetizer + entree + drink;
    }

    public static double calculateBudget(double userBudget, double trueTotal) {
        return userBudget - trueTotal;
    }

    public static double roundTotals(double total) {
        return Math.round(total * 100.00) / 100.00;
    }

    public static void completeTransaction(double budgetRemaining) {
        if (budgetRemaining >= 0) {
            System.out.println("You can afford this transaction and have $" + roundTotals(budgetRemaining) + " remaining.");
        } else {
            System.out.println("You cannot afford this transaction! \nYou are short by $" + roundTotals(Math.abs(budgetRemaining)));
        }
    }

    public static double validateCoupon() {
        String couponCode = sc.nextLine();
        if ((couponCode).equalsIgnoreCase("quarterback")) {
            System.out.println("Coupon code " + "\"" + couponCode + "\" accepted!\"You have saved 25%");
            return 0.25;
        } else if ((couponCode).equalsIgnoreCase("freddysemployee")) {
            System.out.println("Coupon code " + "\"" + couponCode + "\" accepted!\"You have saved 50%");
            return 0.50;
        } else {
            System.out.println("Coupon code " + "\"" + couponCode + "\" not found!\"No discount applied. :(");
            return 0.0;
        }
    }

    public static double calcDiscount(double subtotal, double discount) {
        return roundTotals(subtotal*(1-discount));
        }
    public static double calculateTrueTotal(double subtotal, double taxCharged) {
        return subtotal + taxCharged;
    }

    }
