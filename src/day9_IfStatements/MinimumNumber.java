package day9_IfStatements;

public class MinimumNumber {


    public static void main(String[] args) {
        int x = 10,
                y = 19;

        if (x < y) {
            System.out.println(x + " is the minimum number");
        } else {
            System.out.println(y + " is the minimum number");
        }


        //второй вариант

        if(x  <  y){
            System.out.println(x + " is the minimum number");
        }
        if(y < x){
            System.out.println(y + " is maximum number");
        }

    }
}









