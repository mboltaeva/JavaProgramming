package day16ForLoopStringPractice;

import java.util.Scanner;

public class CatAndDog {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.println("enter a sentens: ");
        String str = scan.nextLine();
        for (int i = 0; i < str.length(); i++) {
            if (str.contains("cat ")) {
                System.out.println("true");
            } else {
                System.out.println("false");
            }
        }

        scan.close();
    }
}






/*
5. write a program to print true if the string "cat" and "dog" appear the same number of times in the given sentence

	        Ex:
	            sentence = "caT dog dogG cAt"

	            output:
	                true
 */


