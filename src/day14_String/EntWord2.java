package day14_String;

import java.util.Scanner;

public class EntWord2 {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.println("Enter a word: ");
        String s = scan.next();
        String  out = "";
        scan.close();

        char ch = s.charAt(0);

        if (ch >= '0' && ch <= '1'){
            out = "first character is digit";
        }else if (ch >= 'a' && ch <= 'b'){
            out = "first character is lowercase letter";
        }else if (ch >= 'A' && ch <= 'B'){
            out = "first character is uppercase letter";
        }else {
            out = "first character is special character";
        }
        System.out.println(out);

    }
}
/*
 5. Ask user to enter a word,
         if the word starts with digits, print "first character is digit"
         if the word starts with uppercase letters, print "first character is lowercase letter"
         if the word starts with lowercase letters, print "first character is uppercase letter"
         if the word starts with special characters, print "first character is special character"


         HINT: 1. you need charAt() method
         2. Ascii Table
*/
