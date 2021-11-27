package day9_IfStatements;

public class MaxNumBetweenTwo {
    public static void main(String[] args) {


        int a = 150,
                b = 130;
        boolean MaxNumber1 = a > b;
        boolean MaxNumber2 = a < b;
        boolean Equal = a == b;

        if(MaxNumber1){
            System.out.println( a + " is maximum number ");
        }
        if(MaxNumber2){
            System.out.println( b + " is maximum number");
        }
        if(Equal){
            System.out.println(" Equal");
        }

        //Второй вариант

        if(a > b){
            System.out.println(a + " is maximum number");
        }else if(a < b){
            System.out.println(b + " is maximum number");
        }else{
            System.out.println(" Equal");
        }

        //третий вариант

        if( a > b){
            System.out.println(a + " is maximum number");
        }
        if(a < b){
            System.out.println(b + " is maximum number");
        }
        if(a == b){
            System.out.println(" Equal");
        }
    }



    }

