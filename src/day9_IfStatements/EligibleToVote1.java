package day9_IfStatements;

public class EligibleToVote1 {
    public static void main(String[] args) {
        String name = "Alan" ;
        int age = 11;
        String citizen = "USA";
        boolean EligibleToVote = age >= 21 && citizen == "USA";
        if(EligibleToVote){
            System.out.println(name + " Eligible to vote");
        }else{
            System.out.println(name + " Not Eligible to vote");
        }
        }
    }








