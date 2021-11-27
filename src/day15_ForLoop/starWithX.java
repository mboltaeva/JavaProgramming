package day15_ForLoop;

import java.util.Scanner;

public class starWithX {

    public static void main(String[] args) {
        System.out.println("Enter a word: ");

        String word = new Scanner(System.in).next();

        if (word.charAt(0)=='x'){//xcode
            word = word.replaceFirst("x","a");//acode


        }
        System.out.println(word);

    }
}
