package day15_ForLoop;

import java.util.Scanner;

public class ReturnDigits {
    public static void main(String[] args) {


        Scanner scan = new Scanner(System.in);
        System.out.println("enter a string: ");
        String s = scan.nextLine();
        int sum = 0;

        for(int i = 0;i < s.length();i++ ){

            if (s.charAt(i)>= '0'&& s.charAt(i)<= '9'){
                sum = sum+ s.charAt(i)-'0';
            }
        }

        System.out.println(sum);


    }
}

/*
6. Write a program that can return the sum of digits from a  string
             Ex:
                 input: A1B2C3

                 output:    6

             Hint: You need to get each of the character by using a loop
	             	To convert char to number:
						             	   '0' - 48   ==> 0
						             	   '1' - 48   ==> 1
						             	   		...

 */