package day16ForLoopStringPractice;

import java.util.Scanner;

public class Frequency {
    public static void main(String[] args) {


        Scanner scan = new Scanner(System.in);


        System.out.println("enter string: ");
        String str = scan.nextLine();
        System.out.println("enter char: ");
        String ch = scan.next();

        int c = 0;

        for (int i = 0; i < str.length(); i++) {
          if (ch.charAt(0) == str.charAt(i)){
              c++;
          }

        }

        System.out.println(c);


    }
}
/*
 Write a program that asks user to entera string and a char, the returns the frequency of the char from the given string
            Ex:
                inputs:
                    str = "aabcccd";
                    char = 'c';

                output: 3

                inputs:
                    "Java programming language"
                    'g'

                output: 4
 */