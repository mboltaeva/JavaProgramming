package day08_ifStatement;

public class EligibleToVote {

    public static void main(String[] args) {

        String name = "Jash";
        int age = 38;
        String citizen = "USA";


        boolean isEligible = age >=21 && citizen == "USA";

        if(isEligible){
            System.out.println( name +" Eligible");

        }

        if(!isEligible){
            System.out.println(name +" Not Eligible");
        }


    }
}
