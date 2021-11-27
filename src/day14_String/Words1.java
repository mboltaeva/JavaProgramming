package day14_String;

import java.util.Scanner;

public class Words1 {

    public static void main(String[] args) {


        Scanner scan = new Scanner(System.in);

        System.out.println("Enter two words: ");
        String str = scan.nextLine();

       String s = str.substring(1,str.indexOf(" "));
       String s1 = str.substring(str.indexOf(" ")+2 );
       String s2 = s + s1;
        System.out.println(s2);
 scan.close();
    }
}


/*
1. Ask user to enter two words. Print first word without its first character
        then print the second word without its first character.
                Input:
                    apple
                    banana
                Output:
                    ppleanana

 */
