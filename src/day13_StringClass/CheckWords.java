package day13_StringClass;

import java.util.Scanner;

public class CheckWords {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.println("Enter 3 words: ");
       String str = scan.next();
       String str1 = scan.next();
       String str2 = scan.next();

       if(str.length()== str1.length()&& str.length()== str2.length()){
           System.out.println("All words are same length");
       } else if(str.length()!= str1.length()&& str1.length()!= str2.length()&&
       str2.length() != str.length()){
           System.out.println("All different length");
       }else {
           System.out.println("Not Same nor Different lengths");
       }
       scan.close();

    }
}


/*
5. Write a program  for CheckWords, the program accepts 3 words and :
            - if they are same length:  print "All words are same length"
            - if some same length and others not:    print "Not Same nor Different lengths"
            - if all different length :  print "All different length"

 */