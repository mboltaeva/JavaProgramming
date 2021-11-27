package day10_NestedIf;

public class BiggerNum {
    public static void main(String[] args) {
         int n1 = 10, n2 = 105, n3 = 20;

        String result = (n1 > n2 && n1 > n3)? "n1 is bigger" : (n2 > n1 && n2 > n3)?
                 "n2 is bigger" :  "n3 is bigger";
        System.out.println(result);



    }
}










