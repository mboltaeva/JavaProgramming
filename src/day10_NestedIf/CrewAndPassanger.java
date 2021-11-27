package day10_NestedIf;

public class CrewAndPassanger {
    public static void main(String[] args) {

        int people = 100;
        String result = "";

        if(people >= 50 && people <= 100){

            if(people == 50){
            result = "20 crew, 30 passengers";
        }else if (people == 75){
            result = "25 crew, 50 passengers";
        }else if (people == 100) {
            result = "30 crew, 70 passengers";
        }

        }else{
            result = "invalid";
        }
        System.out.println(result);

        //Ternary



        String a = (people == 50 || people == 75 || people == 100)?
            a = (people == 50)? "20 crew, 30 passengers" : (people == 75)?
                    "25 crew, 50 passengers" : "30 crew, 70 passengers" : "invalid" ;

        System.out.println(a);
    }
}
