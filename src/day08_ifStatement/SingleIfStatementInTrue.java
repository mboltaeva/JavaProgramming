package day08_ifStatement;

public class SingleIfStatementInTrue {

    public static void main(String[] args) {

        int number = 100;

        boolean evenNumber = number % 2 == 0;
        if (evenNumber) {
            System.out.println(number + " is even number");


        }

        if (!evenNumber) {

            System.out.println(number + " is odd number");

        /*
        System.out.println("Odd number ");
        System.out.println("even number");
        */


        }
        System.out.println("--------------------");
        int n = 200;
        if(n > 0){//if the n is greater than zero, then it is positive
            System.out.println(n + " is positive");
        }
         if (n < 0){
             System.out.println(n+ "is negative");
         }

         if (n == 0){

             System.out.println(n+ " is zero");
         }





    }


}