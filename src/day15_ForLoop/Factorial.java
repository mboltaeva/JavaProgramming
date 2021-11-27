package day15_ForLoop;

import java.util.Scanner;

public class Factorial {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int factorial = 1;
        int num = scan.nextInt();

        for (int b = num; b >= 1; b--){
            factorial *= b;
        }

        System.out.println(factorial);

        System.out.println("----------------------------------");
        System.out.println();

        for (int i = 1;i <= 8;i++){
            System.out.println("\t\t\t\t"+ "* * * * * * ");
        }




    }
}


/*
4. Write a program that can return the factorial number of any given number

            Ex:
                input: 5
                output: 120

                    ( because: 5! = 5 * 4 * 3 * 2* 1 = 120 )

 */