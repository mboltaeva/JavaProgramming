package day9_IfStatements;

public class MaximumNumber {
    public static void main(String[] args) {


        int n1 = 100,
                n2 = 200;

        boolean n1IsMax = n1 > n2;
        boolean n2IsMax = n2 > n1;
        boolean equal = n1 == n2;

        if (n1IsMax) {
            System.out.println(n1 + " is the maximum number");
        }
        if (n2IsMax) {
            System.out.println(n2 + " is the maximum number");
        }
        if (equal) {
            System.out.println("Equal");
        }

        //второй вариант

            if (n1 > n2) {
                System.out.println(n1 + " is the maximum number");
            } else if (n2 > n1) {
                System.out.println(n2 + " is the maximum number");
           } else {
               System.out.println("Equal");
            }


        }
    }


