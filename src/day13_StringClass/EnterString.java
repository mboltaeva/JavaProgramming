package day13_StringClass;

import java.util.Scanner;

public class EnterString {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.println("Enter else: ");
        String str = scan.nextLine();
        scan.close();


        int elseLength = str.length();
        if (elseLength == 0){
            System.out.println("string is empty");
        }else if (elseLength <= 3){
            System.out.println(str);
        }else {
            System.out.println("" + str.charAt(elseLength - 3)+ str.charAt(elseLength - 2)+
                    str.charAt(elseLength -1));
        }



    }
}
/*
3. Write a method that asks user to enter a string.
        if the string is empty, print: string is empty
        if the string has more than 3 characters, print the last three characters
        if the string has less than or equal 3 characters, print the string itself
 */