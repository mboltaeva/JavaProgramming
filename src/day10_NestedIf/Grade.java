package day10_NestedIf;

public class Grade {
    public static void main(String[] args) {
         char grade = 'D';
         String message = "";

         if(grade == 'A' || grade =='B' || grade == 'C' ||grade == 'D' || grade == 'F'){
         if (grade == 'A'){
             message = "Excellent";
         }else if (grade == 'B'){
             message = "Great job";
         }else if (grade == 'C'){
             message = "Good";
         }else if (grade == 'D'){
             message = "Passed";
         }else  if (grade == 'F') {
             message = "Failed";
         }
         }else{
             message = "Invalid";
         }
        System.out.println(message);

         //Ternaries
        String result = (grade == 'A' || grade == 'B' || grade == 'C' || grade == 'D' || grade == 'F')?
        (grade == 'A')? "Excellent" : (grade == 'B')? "Great job" :
                (grade == 'C')? "Good" :  (grade == 'D')? "Passed" : "Failed": "Invalid";
        System.out.println(result);




    }
}
