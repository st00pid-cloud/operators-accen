package com.school.operators;

public class ArithmeticOperators {
    static void main(String[]args){
        int a = 48;
        int b = 13;
        int addition = a + b;
        int subtraction = a - b;
        int multiplication = a * b;
        int integer_division = a / b;
        int modulus = a % b;

        System.out.println(a + " + " + b + " = " + addition);
        System.out.println(a + " - " + b + " = " + subtraction);
        System.out.println(a + " * " + b + " = " + multiplication);
        System.out.println(a + " / " + b + " = " + integer_division);
        System.out.println(a + " % " + b + " = " + modulus);
    }
}
