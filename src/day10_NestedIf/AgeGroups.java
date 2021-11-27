package day10_NestedIf;

public class AgeGroups {
    public static void main(String[] args) {
         int age = 15;
         String group = "";


         if(age >= 0 && age<= 150 ){
             if(age < 21){
                 group = "Teenager";
             }else if (age >= 21 && age < 55){
                 group = "Adult";
             }else{
                 group = "Senior";
             }
         }else {
             group = "Invalid";
         }
        System.out.println(group);


          // Ternary

        group =  (age >= 0 && age<= 150 )? (age < 21)? "Teenager" :
                (age >= 21 && age < 55)? "Adult" : "Senior" : "Invalid";
        System.out.println(group);





    }
}
