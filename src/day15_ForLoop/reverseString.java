package day15_ForLoop;

import java.util.Scanner;

public class reverseString {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.println("enter a string: ");

       String s = scan.nextLine();
        String reversed = "";

        for (int i = s.length()-1;i >= 0;i--){
           char r =  s.charAt(i);
           reversed = reversed + r;

        }

        System.out.println(reversed);
        scan.close();




    }
}
