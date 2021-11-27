package day13_StringClass;

import java.util.Scanner;

public class firstAndLastCharacters {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.println("Enter a sentence: ");


        String sentence = scan.next();
        char first = sentence.charAt(0);


        char last =  sentence.charAt(sentence.length() -1);

        System.out.println("first: " + first);
        System.out.println("last: " + last);

        scan.close();

    }
}


/*
. write a program that asks user to enter a sentence.
        then print the first & last characters of the sentence
        */
