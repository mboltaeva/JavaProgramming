package day9_IfStatements;

public class Calculator {
    public static void main(String[] args) {
        int n1 = 10,
                n2 = 20;

        char mathOperator = '+';

        if (mathOperator == '+'){
            System.out.println(n1 + n2);
        }else if(mathOperator == '-'){
            System.out.println(n1 - n2);
        }else if(mathOperator == '*'){
            System.out.println(n1 * n2);
        }else if(mathOperator == '/'){
            System.out.println(n1 / n2);
        }




    }
}
