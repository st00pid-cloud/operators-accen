package com.school.operators;

public class OperatorPrecedence {
    public static void main(String[]args){
        int r1 = 10 + 5 * 3;
        int r2 = (10 + 5) * 3;
        int r3 = 20 - 4 / 2 + 1;
        int r4 = 20 - 4 % 3 + 2;
        boolean r5 = 5 > 3 && 10 < 20;
        boolean r6 = 5 > 3 || 10 > 20;

        System.out.println("10 + 5 * 3 = " + r1);
        System.out.println("(10 + 5) * 3 = " + r2);
        System.out.println("20 - 4 / 2 + 1 = " + r3);
        System.out.println("20 - 4 % 3 + 2 = " + r4);
        System.out.println("5 > 3 && 10 < 20 = " + r5);
        System.out.println("5 > 3 || 10 > 20 = " + r6);
    }
}
