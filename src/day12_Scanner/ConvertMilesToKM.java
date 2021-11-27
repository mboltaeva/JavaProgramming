package day12_Scanner;

import java.util.Scanner;

public class ConvertMilesToKM {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter Miles: ");

        double miles = scan.nextDouble();
        String num = "";

        num = miles + " miles equal to: " + (miles * 1.609) + " kilometers";
        System.out.println(num);
        scan.close();


    }
}
