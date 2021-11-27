package day15_ForLoop;

import java.util.Scanner;

public class calculateAllNum {
    public static void main(String[] args) {

        int total = 0;
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter a number: ");
        int num= scan.nextInt();

        for (int  i = num; i >= 1; i--){
            total += i;
        }

        System.out.println(total);


    }

}
/*
3. write a program that can calculate the sum of all numbers between 1 to any given number
            ex:
                input: 100
                output: 5050

                input: 50
                output: 1275
 */