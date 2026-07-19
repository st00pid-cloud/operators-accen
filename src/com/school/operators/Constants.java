package com.school.operators;

public class Constants {
    static final double TAX_RATE = 0.12;
    static final int PASSING_SCORE = 75;
    static final String CURRENCY ="PHP";
    public static void main(String[]args){
        double price = 1500.00;
        double tax_amount_calculation = price*TAX_RATE ;

        System.out.println("Price: " + price + " PHP");
        System.out.println("Tax rate: " + TAX_RATE );
        System.out.println("Tax amount: " + tax_amount_calculation + " PHP");
        System.out.println("Total: " + (price+tax_amount_calculation) + " PHP");
        System.out.println("Passing Score: " + PASSING_SCORE);

    }
}
