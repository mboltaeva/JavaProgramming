package day16ForLoopStringPractice;

import java.util.Scanner;

public class PositiveAndNegativ {
    public static void main(String[] args) {


        int positiv = 0;
        int negative = 0;
        int zero = 0;
        Scanner scan = new Scanner(System.in);

        for (int i = 0; i < 5; i++) {
            System.out.println("enter a number 5 times: ");
            int s = scan.nextInt();


            if (s < 0) {
                negative += 1;
            } else if (s > 0) {
                positiv += 1;

            } else {
                zero += 1;

            }

            System.out.print(" negative" + negative + "\t");
            System.out.print(" positive" + positiv + "\t");
            System.out.print(" zero" + zero + "\t");
        }

    }
}
/*
1. Write a program that asks user to enter number for 5 times, and print how many positive and negative numbers user entered
			Ex:
				Inputs:
					10
					20
					-1
					0
					3

				Output:
					3 positive and 1 negative
 */
