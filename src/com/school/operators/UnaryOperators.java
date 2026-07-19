package com.school.operators;

public class UnaryOperators {
    public static void main(String[] args) {
        int x = 10;
        boolean isActive = false;

        // plus-minus
        System.out.println("Unary plus: +" + x + " = " + (+x));
        System.out.println("Unary minus: -" + x + " = " + (-x));

        // pre-post-increment
        x = ++x;
        System.out.println("Pre-increment: ++x = " + x + ", x is now " + x);

        int postIncExpr = x;
        x++;
        System.out.println("Post-increment: x++ = " + postIncExpr + ", x is now " + x);

        // pre-post-decrement
        --x;
        System.out.println("Pre-decrement: --x = " + x + ", x is now " + x);
        int postDecExpr = x;
        x--;
        System.out.println("Post-decrement: x-- = " + postDecExpr + ", x is now " + x);

        // logical-not
        System.out.println("NOT isActive: " + !isActive);
    }
}