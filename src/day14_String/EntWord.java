package day14_String;

import java.util.Scanner;

public class EntWord {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.println("Enter a word: ");
        String str = scan.next();

        if(str.endsWith("ly")){
            System.out.println("really???");
        }else{
            System.out.println("never mind");
        }

        scan.close();
    }
}
