package day13_StringClass;

import java.util.Scanner;

public class ReturnInitials {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Enter your first name: ");
        String firstName = scan.next();

        System.out.println("Enter your last name: ");
        String lastName = scan.next();

        char first = firstName.charAt(0);
        char last = lastName.charAt(0);

        String initial =  first + "." + last;

        System.out.println("Initial :   " + initial);


        scan.close();

    }
}
/*
2. write a program that can return the initials of the user
 */
