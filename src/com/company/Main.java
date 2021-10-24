package com.company;

import java.util.Arrays;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Main {

    public static void main(String[] args) {
        String[] array = {"Computer", "Plate", "Chair", "Girl", "Boy", "Cat", "Dog", "Shirt", "Determination"};
        startC(array);
        endsE(array);
        lengthFive(array);
        consistE(array);
        subStringTe(array);
        histogram(array);

    }

    public static void startC(String[] array) {
        int count = 0;
        for (int i = 0; i < array.length; i++)
            if (array[i].charAt(0) == 'C')
                count++;
        System.out.printf(" %s words start with C;", count);


    }

    public static void endsE(String[] array) {
        int count = 0;
        for (int i = 0; i < array.length; i++)
            if (array[i].endsWith("e"))
                count++;
        System.out.println();
        System.out.printf(" %s words ends with e;", count);

    }

    public static void lengthFive(String[] array) {
        int count = 0;
        for (int i = 0; i < array.length; i++)
            if (array[i].length() == 5)
                count++;
        System.out.println();
        System.out.printf(" %s words has length 5;", count);
    }

    public static void consistE(String[] array) {
        int count = 0;
        for (int i = 0; i < array.length; i++)
            if (array[i].contains("e"))
                count++;
        System.out.println();
        System.out.printf(" %s words has letter e;", count);
        System.out.println();

    }

    public static void subStringTe(String[] array) {
        System.out.println("Is there any element which consists of subString 'te'?");
        int count = 0;
        for (String te : array) {
            if (te.contains("te"))
                count++;
        }
        if (count > 0) {
            System.out.printf(" -Yes, there is %s words which contains subString 'te'", count);
        } else System.out.println("No, there is not.");

    }

    public static void histogram(String[] array) {
        int[] counter = new int[]{0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0};
        for (int i = 0; i < array.length; i++) {
            counter[array[i].length() - 1]++;
            System.out.println("");
        }
        for (int i = 0; i < counter.length; i++)
            if (counter[i] > 0) {
                System.out.println("There are " + (i + 1) + " letters : in " + counter[i] + " word(s) in this array");
                // 1.count of letters, 2. count of words
            }
    }
}


