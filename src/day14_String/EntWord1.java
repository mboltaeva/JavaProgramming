package day14_String;

import java.util.Scanner;

public class EntWord1 {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.println("Enter first word: ");
        String in = scan.nextLine();

        System.out.println("Enter second word: ");
        String in1 = scan.nextLine();


 if (in.charAt(in.length()-1)==in1.charAt(0)){
     System.out.println(in+in1.substring(1));
 }else {
     System.out.println(in+in1);
 }
    }
}


/*
4. Ask user to enter two words. Then add them together and print.
    But if the last letter if the first word and the first letter of the last letter is the same,
    print that character once.

                    Input:
                        one
                        eight
                    Output:
                        oneight
 */