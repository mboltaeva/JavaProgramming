package day9_IfStatements;

public class EligibleBuyCigarettes {
    public static void main(String[] args) {

        byte age = 20;
        boolean eligibleBuyCigarettes = age > 21;
        if (eligibleBuyCigarettes) {
            System.out.println("Eligible");
        }
        if (!eligibleBuyCigarettes) {
            System.out.println("Not Eligible");
        }

//второй вариант


        if (age >= 21) {
            System.out.println("Eligible");
        }
        if (age <= 21) {
            System.out.println("Not Eligible");
        }

        //третий вариант



        if (age >= 21) {
            System.out.println(" eligible buy cigarettes");
        } else {
            System.out.println("not eligible buy cigarettes");
        }
        }


    }
