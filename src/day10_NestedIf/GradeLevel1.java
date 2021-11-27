package day10_NestedIf;

public class GradeLevel1 {
    public static void main(String[] args) {


        byte grade = 5;
        String level = "";

        if(grade >= 1 && grade <=5){
            level = "Elementary school";
        }else if (grade >=6 && grade <= 8){
            level = "Middle school";
        }else if (grade >= 9 && grade <= 12){
            level = "High school";
        }else if (grade >= 13 && grade <= 16){
            level = "College";
        }else if (grade >= 17 && grade <= 18){
            level = "Grad school";
        }else {
            level = "Invalid grade";
        }
        System.out.println(level);

// 2 Nested

         level =(grade >= 1 && grade <=5)?  "Elementary school" : (grade >=6 && grade <= 8)?
                "Middle school" : (grade >= 9 && grade <= 12)? "High school" :
                (grade >= 13 && grade <= 16)?   "College" : (grade >= 17 && grade <= 18)?
                        "Grad school" :  "Invalid grade";
        System.out.println(level);







    }
}
