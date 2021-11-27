package day9_IfStatements;

public class AgeGroups {
    public static void main(String[] args) {
        int age = 2;
        String group;
        if (age >= 1 && age <= 2){
           group = " infant";
        }else if(age >= 3 && age <= 5){
            group = " Toddler";
        }else if(age >= 6 && age <= 9){
            group = " Kid";
        }else if(age >= 10 && age <= 12){
            group = " Pre-Teen";
        }else if(age >= 13 && age <= 17){
            group = " Teenager";
        }else  if(age >= 18 && age <= 20){
            group = " Young Adult";
        }else if(age >= 21 && age <= 39){
            group = " Adult";
        }else if(age >= 40 && age <= 49){
            group = " Young Middle-Aged Adult";
        }else if(age >= 50 && age <= 54){
            group = " Middle-Aged Adult";
        }else if(age >= 55 && age <= 64){
            group = " Very Young Senior Citizen";
        }else if(age >= 65 && age <= 74){
            group = " Young Senior Citizen";
        }else  if(age >= 75 && age <= 84){
            group = " Senior Citizen";
        }else{
            group = " Old Senior Citizen";
        }
        System.out.println("group = "+ group);
        }
    }

