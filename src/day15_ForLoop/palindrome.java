package day15_ForLoop;

import java.util.Scanner;

public class palindrome {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.println("enter a string: ");
        String word = scan.nextLine();

      //  String word = "Civic";

        String reversed = "";

        for (int i = word.length()-1;  i >=0 ; i--) {
            reversed += word.charAt(i);
        }

        boolean isPalindrome = word.equalsIgnoreCase(reversed);

        System.out.println("isPalindrome = " + isPalindrome);


    }

}

/*
 "Java" ==> "avaJ" ===> false (not palindrome)
 "Anna" ==> "annA" ===>true
 "Level"
 "Racecar
 Dad
 Mom
 ....
 */













