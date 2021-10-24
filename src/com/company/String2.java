package com.company;

public class String2 {
    public static void main (String [] args) {
        String expression = "Climb mountains not so the world can see you, but so, you can see the world";
            wordsAmount (expression);
            theWords(expression);
    }

    public static void wordsAmount(String expression) {
        String [] words = expression.split("\\s+");
        System.out.println("There are " + words.length + " words in the expression");
    }
    public static void theWords(String expression) {
        String substring = "the";
        int counter = expression.split(substring, -1).length-1;
        System.out.println("There are " + counter + " words \"the\" in this expression");
    }
}
