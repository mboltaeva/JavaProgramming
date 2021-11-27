package day05_Concatenation;

public class PhonNumber {

    public static void main(String[] args) {

        String countryCode = "1",
                areaCode = "703",
                localNumber = "4512625";

        String  PhonNumber = ("+" + countryCode  + "(" + areaCode + ")" + "-"  +
                localNumber);


       // String PhonNumber  = ("+" + countryCode + "(" + areaCode + ")" + "-" +
        //        localNumber);
        System.out.println(PhonNumber);








    }

}