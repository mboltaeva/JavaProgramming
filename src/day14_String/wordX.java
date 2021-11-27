package day14_String;

import java.util.Scanner;

public class wordX {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.println("Enter a word: ");
        String str = scan.next();
        if (str.charAt(0)== 'x'){
            System.out.println(str.substring(1));
        }else {
            System.out.println(str);
        }
scan.close();


    }
}



/*
3. Ask user to enter a word. If the work starts with x, print the word without x.
                    Input:
                        xcode
                    Output:
                        code
 */