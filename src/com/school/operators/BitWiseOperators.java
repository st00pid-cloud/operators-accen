package com.school.operators;

public class BitWiseOperators {
    public static void main(String[]args){
        int a = 12;
        int b = 10;

        int and = a & b;
        int or = a | b;
        int xor = a ^ b;
        int not = ~a;
        int left_shift = a << 2;
        int right_shift = a >> 2;

        System.out.println(a + " & " + b + " = " + and);
        System.out.println(a + " | " + b + " = " + or);
        System.out.println(a + " ^ " + b + " = " + xor);
        System.out.println("~"+ a + " = " + not);
        System.out.println(a + " << 2 +" + left_shift);
        System.out.println(a + " >> 2 = " + right_shift);

    }
}
