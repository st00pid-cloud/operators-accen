package com.school.operators;

public class TernaryOperators {
    public static void main(String[]args){
        int age = 17;
        int score = 82;
        int temperature = 30;

        String category = (age >= 18) ? "Adult" : "Minor";
        String result = (score >= 75) ? "Passed" : "Failed";
        String weather = (temperature >= 30) ? "Hot" : "Cool";

        System.out.println("Age " + age +": " + category);
        System.out.println("Score " + score +": " + result);
        System.out.println("Temperature " + temperature + ": " + weather);
    }
}
