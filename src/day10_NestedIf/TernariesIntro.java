package day10_NestedIf;

public class TernariesIntro {
    public static void main(String[] args) {
         int n = 100;
         if (n%2 == 0){
             System.out.println("Even");
         }else{
             System.out.println("Odd");
         }
        System.out.println("----------------------------------");
        String result1 =(n%2 == 0)? "Even" : "Odd";
        System.out.println(result1);


        System.out.println("-------------------------------------");
        int age = 17;
        if(age >= 21){
            System.out.println("eligible");
        }else{
            System.out.println(" not eligible");
        }
        System.out.println("-----------------------------");

        String result2 =(age >= 21)? "eligible" : "not eligible";
        System.out.println(result2);

        System.out.println("---------------------");

        int number = 100;
        if(number > 0){
            System.out.println("Positiv");
        }else if(n < 0){
            System.out.println("negativ");
        }else{
            System.out.println("Zero");
        }
        System.out.println("-----------------------------------");


        String result3= (number > 0)? "Positiv" : (number < 0)? "negativ" : "Zero";
        System.out.println(result3);








    }
}





















