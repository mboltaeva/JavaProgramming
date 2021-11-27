package day11_Switch_Scanner;

public class CappuccinoBuyer {
    public static void main(String[] args) {

//Solution 1: used if statement
        String size = "small";

        if (size == "tall: " || size == "grande: " || size == "venti: ") {
            if (size == "tall") {
                System.out.println("price is $3.69 \n 90 calories");
            } else if (size == "grande") {
                System.out.println("price is $3.99 \n 120 calories");
            } else {
                System.out.println("price is $4.29 \n 150 calories");
            }
        } else {
            System.out.println("Invalid size");
        }

//Solution 2: used switch statement

        switch (size) {
            case "tall":
                System.out.println("price is $3.69 \n 90 calories");
                break;
            case "grande":
                System.out.println("price is $3.99 \n 120 calories");
                break;
            case "venti":
                System.out.println("price is $4.29 \n 150 calories");
                break;
            default:
                System.out.println("Invalid size");
        }
        //Solution 3: used if & switch statements mixed

        if (size == "tall: " || size == "grande: " || size == "venti: ") {
            switch (size) {
                case "tall":
                    System.out.println("price is $3.69 \n 90 calories");
                    break;
                case "grande":
                    System.out.println("price is $3.99 \n 120 calories");
                    break;
                default:
                    System.out.println("price is $4.29 \n 150 calories");
            }
        }else {
            System.out.println("Invalid size");
        }


    }
}


/*
1. Create a class called  CappuccinoBuyer. A variable named Size is given, write a program that can display the price and calories of cappuccino

        Valid sizes are tall, grande, venti and thier price & calories are:

        tall:
        price is $3.69
        90 calories

        grande:
        price is $3.99;
        120 calories

        venti:
        price is $4.29
        150 calories

        If the size is invalid then the output shoud be "Invalid Size"


        Note:
        Solution 1: use if statement
        Solution 2: use switch statement
        Solution 2: use if & switch statements mixed

 */