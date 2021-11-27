package day13_StringClass;

import java.util.Scanner;

public class Log_InFunction {
    public static void main(String[] args) {


        Scanner scan = new Scanner(System.in);

        System.out.println("Enter username: ");
        String u = scan.next();
        String username = "Cydeo";
        System.out.println("Enter password: ");
        String p = scan.next();
        String password = "WoodenSpoon";


        if (username.equals(u)&&(password.equals(p))){
            System.out.println("Logged in.");
        }else {
            System.out.println("Incorrect username or password");
        }


    }

}


/*
You are writing a code for the log-in function of the Cybertek Application, assume that your credentials are:
                    username: Cydeo
                    password: WoodenSpoon

        Ask the user to enter their credentials. If credentials are matched, your program should print "Logged in."
        otherwise print "Incorrect username or password" as error message

    	Hints: 	In order to login, both username and password MUST be correct
    			you will need to use equals() method
 */