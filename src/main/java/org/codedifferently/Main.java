package org.codedifferently;
import java.util.Scanner;

public class Main {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);

        System.out.println("WELCOME TO FAT BOY FREDDY'S \nHome of Fat Fingers and Fried Footlongs!");
        System.out.println("Enter your name: " );
        String userName = sc.nextLine();
        System.out.println("What is your budget?");
        double userBudget = sc.nextDouble();

        double app1 = RandomGenerator.generateAppetizerPrice();
        double ent1 = RandomGenerator.generateEntreePrice();
        double drink1 = RandomGenerator.generateDrinkPrice();
        System.out.println("Appetizer costs: $" + Calculator.roundTotals(app1));
        System.out.println("Entree costs: $" + Calculator.roundTotals(ent1));
        System.out.println("Drink costs: $" + Calculator.roundTotals(drink1));

        double subtotal = Calculator.calculateSubtotal(app1, ent1, drink1);
        System.out.println("Here is your subtotal: $" + Calculator.roundTotals(subtotal));

        System.out.println("Do you have a coupon code to enter?");

        double discount = Calculator.validateCoupon();
        double discountedSubtotal = Calculator.calcDiscount(subtotal,discount);
        System.out.println("********************FAT BOY FREDDY's*******************");
        System.out.println("******************************************************");
        System.out.println("********************Final Receipt*********************");
        System.out.println("Appetizer costs: $" + Calculator.roundTotals(app1));
        System.out.println("Entree costs: $" + Calculator.roundTotals(ent1));
        System.out.println("Drink costs: $" + Calculator.roundTotals(drink1));
        System.out.println("Discount: -$" + discount);
        System.out.println("Here's your discounted pre-tax total: $"+ discountedSubtotal);
        double randomTaxRate = Calculator.returnRandomTaxRate();
        double taxCharged = Calculator.calcTax(discountedSubtotal,randomTaxRate);
        System.out.println("Sales tax: $" + taxCharged + " (Simulated tax rate: "+Calculator.roundTotals(randomTaxRate)+"%)");
        double finalTotal = Calculator.calculateTrueTotal(discountedSubtotal,taxCharged);
        System.out.println("Total due: $" + Calculator.roundTotals(finalTotal));
        double finalBudget = Calculator.calculateBudget(userBudget,finalTotal);
        Calculator.completeTransaction(finalBudget);
        System.out.println("VisitID: " + RandomGenerator.generateReceiptCode(userName));
    }
    }
