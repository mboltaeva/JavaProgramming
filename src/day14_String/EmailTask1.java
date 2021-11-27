package day14_String;

import java.util.Scanner;

public class EmailTask1 {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Enter email address:");
        String email = scan.nextLine();
        scan.close();

        if(email.contains("_")){
            String firstName = email.substring(0,email.indexOf("_"));
            String lastName = email.substring(email.indexOf('_')+1,email.indexOf("@"));
            String domain = email.substring(email.indexOf("@"));


            System.out.println(lastName + "_" + firstName + domain );
        }else {
            System.out.println(email);
        }
        System.out.println("-------------------------------------");




       // пример для себя
        Scanner s = new Scanner(System.in);

        System.out.println("Enter email address:");
        String email1 = s.nextLine();
        s.close();


        if (email1.contains("%")){
            String first = email1.substring(0,email1.indexOf("%"));
            String last = email1.substring(email1.indexOf("%")+1,email1.indexOf("#"));
            String at = email1.substring(email1.indexOf("#"));
            System.out.println( last+ "%"+ first+ at);
        }else {
            System.out.println(email1);
        }




    }


    }

/*
Create a class calledEmailTask1.
       Assume that email address is constructed by person's first name and followed by an underscore and last name.

        Write a program that can swap first name with last name in the email (Saperated by an underscore).
        If the email doesn't contain an underscore print the given input email.

            Ex:
                input: mike_tyson@gmail.com
                output: tyson_mike@gmail.com

              madina%Boltava#gmail.com
              Boltaeva#Madina%gmail .com


 */