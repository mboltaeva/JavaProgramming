package day05_Concatenation;

public class CarInfo {

    public static void main(String[] args) {

        String name = " Car",
                year = "2020",
                make = "USA",
                model = "Ford",
                miles = "125",
                color = "Black",
                price = "89000 $";
        String content = name + " \n " + year + " " + make + " \n " + model + "," +
                miles +" \n " + color + " , " + price;
        System.out.println(content);




    }
}
