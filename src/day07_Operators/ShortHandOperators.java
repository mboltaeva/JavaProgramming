package day07_Operators;

public class ShortHandOperators {
    public static void main(String[] args) {


         //assignment
        int number = 100;
        System.out.println("number = " + number);

        number = 200;
        System.out.println("number = " + number);

        System.out.println("---------------------------------");


        String word = " Java Programmong";
        System.out.println("word = " + word);

        word = "Wooden Spoon";
        System.out.println("word = " + word);

        word = "Cydeo";//reassign viable
        System.out.println("word =" + word);

       // word = 123 no works
        // addition assignment
        int x = 100;
        System.out.println("x = "+ x);
        System.out.println( x + 200);
       // x = x + 200;
        x += 200;
        System.out.println("x = "+ x);

        String str =" madina";
        str += " boltaeva";
        System.out.println("str = " + str);

        double num1 = 2.5;

        System.out.println("num = " + num1);
         num1 += 5.5;
        System.out.println("num = " + num1);


        double availableBalance = 1000.50;
        availableBalance += 300;
        System.out.println("availableBalance = "+ availableBalance);

        System.out.println("-----------------------------");


        availableBalance -= 200;
        availableBalance += 400;
        System.out.println("availableBalance = "+ availableBalance);

        System.out.println("---------------------------");

        double salary = 50000.50;
        salary *= 2;
        System.out.println("salary = " + salary);

        double dodge = 0.000000001;
        dodge *= 10000000;
        System.out.println("dodge = " + dodge);

        double  num2 = 25000;
        num2 /= 2;
        System.out.println("num2 = " + num2);

        System.out.println("---------------");


        double num3 = 100;
        num3 %= 3;
        System.out.println( "num3 = "+ num3);

        System.out.println("----------------------------------------------");


         int amount = 127;
         int quarters = 127 / 25;
         int cents = 127 % 25;
        System.out.println("quarters = " + quarters);
        System.out.println("cents = "+ cents);

        int cents2 = 127;
        cents %= 25;
        System.out.println("cents = "+ cents);
        System.out.println("------------------------");

        int y = 300;
        y %= 16;
        System.out.println("y = "+ y);

        System.out.println("-------------------");

        int balance = 3500;
        balance %= 153;
        System.out.println("balance = "+ balance);







    }



    }






