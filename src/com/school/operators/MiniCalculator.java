package com.school.operators;

public class MiniCalculator {
    static final double DISCOUNT_RATE = 0.10;
    public static void main(String[]args){
        double itemPrice = 2500.00;
        int quantity = 3;

        double subtotal = (quantity*itemPrice);
        double discount = (subtotal*DISCOUNT_RATE);
        double total = (subtotal-discount);

        String note = (total > 5000) ? "Premium Purchase" : "Standard Purchase";
        boolean isExpensive = (total > 5000);

        System.out.println("Item price: " + itemPrice);
        System.out.println("Quantity: " + quantity);
        System.out.println("Subtotal: " + subtotal);
        System.out.println("Discount(10%): " + discount);
        System.out.println("Total: " + total);
        System.out.println("Note: " + note);
        System.out.println("Is expensive: " + isExpensive);

    }
}
