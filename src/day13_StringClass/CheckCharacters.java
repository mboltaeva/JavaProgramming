package day13_StringClass;

import java.util.Scanner;

public class CheckCharacters {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.println("Enter a sentence: ");


        String sentence = scan.next();
        char First = sentence.charAt(0);


        char Last =  sentence.charAt(sentence.length() -1);


        if(First == Last){
            System.out.println("Same");
        }else{
            System.out.println("Not same");
        }

      scan.close();
    }
}
