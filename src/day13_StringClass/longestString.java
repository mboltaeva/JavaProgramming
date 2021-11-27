package day13_StringClass;

import java.util.Scanner;

public class longestString {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.println("Enter the first sentences: ");
        String First = scan.nextLine();
        System.out.println("Enter the second sentences: ");
        String Second = scan.nextLine();

        int lengthFirst =First.length();
        int lengthSecond = Second.length();

        if(lengthFirst > lengthSecond){
            System.out.println(First);
        }else{
            System.out.println(Second);
        }
        scan.close();

    }
}

/*
2. write a program that asks user to enter two strings, and print out the longest string
 */