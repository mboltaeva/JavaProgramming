package day12_Scanner;

import java.util.Scanner;

public class ConvertCentsToDollar {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter Cents: ");

        int cents = scan.nextInt();
        String num = "";
        num = cents + " cents equal to: " + (cents / 100) + " dollars and " + (cents % 100)
                + "cents";
        System.out.println(num);
        scan.close();
    }
}

