package day16ForLoopStringPractice;

import java.util.Scanner;

public class FrequencyOfWord {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);


        System.out.println("enter  sentence: ");
        String str = scan.nextLine().toUpperCase();
        System.out.println("Enter a word:");
        String word = scan.next().toUpperCase();
        int frequency = 0;

        for (int i = 0; i < str.length() -word.length(); i++) {
           if (str.substring(i, i + word.length()).equalsIgnoreCase(word)){
               frequency++;
           }
        }

        System.out.println(frequency);
        scan.close();

    }
}

/*
4. write a program that can return the frequency of the a word Java from the sentence

        Ex:
            sentence = "Java Java";

            output:
                2

            Hint: you need to create
 */


