package day9_IfStatements;

public class EligibleBuyAlcohol {
    public static void main(String[] args) {
        byte age = 20;
        boolean EligibleBuyAlcohol1 = age > 21;
        boolean EligibleBuyAlcohol2 = age < 21;
        boolean Equal = age == 21;

        if(age > 21){
            System.out.println("Eligible buy alcohol");
        }else if(age < 21){
            System.out.println("Not  Eligible buy alcohol");
        }else{
            System.out.println(" Equal");
        }



//Второй вариант


        if (EligibleBuyAlcohol1) {
            System.out.println(" Eligible buy alcohol");
        }
        if (EligibleBuyAlcohol2) {
            System.out.println(" Not  Eligible buy alcohol");
        }
        if (Equal) {
            System.out.println(" Equal");
        }


    }

}