package com.school.operators;

public class AssignmentOperators {
    static void main(String[]args){
        //main-score
        int main_score = 100;

        //operators
        int increment = main_score += 10;
        int decrement = main_score -= 25;
        int multiply = main_score *= 2;
        int divide = main_score /= 5;
        int modulus = main_score %= 7;

        //print-out
        System.out.println("After +=: " + increment );
        System.out.println("After -=: " + decrement );
        System.out.println("After *=: " + multiply );
        System.out.println("After /=: " + divide );
        System.out.println("After %=: " + modulus );

    }
}
