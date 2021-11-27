package day9_IfStatements;

public class MedianNumber {
    public static void main(String[] args) {
        int a = 10,
                b = 15,
                c = 20000;

        boolean aIsMedian = (a > b && a < c) || (a > c && a < b);
        /*  in order for a to be the median number:
        1) if c is the maximum number & b is the minimum number,
        then a is the median number
        2) if b is the maximum number & c is the minimum number< then a is the
         median number


        */
        boolean bIsMedian = (b > c && b < a) || (b > a && b < c);


        boolean cIsMedian = !aIsMedian && !bIsMedian;
       if(aIsMedian){
           System.out.println(a + " is the median number");
       }
       if(bIsMedian){
           System.out.println(b + " is the median number");
       }
       if(cIsMedian){
           System.out.println(c + "is the median number");





       }

    }
}
