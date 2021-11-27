package day9_IfStatements;

public class LeapYear {
    public static void main(String[] args) {
         int year = 2000;
         boolean leapYear = year % 4 == 0;
         if(leapYear){
             System.out.println("Year "+ year + " is leap year");
         }
         if(leapYear){
             System.out.println("Year "+ year + " is  Not leap year");
         }

        System.out.println("-------------------------------");



         if(leapYear){
             System.out.println("Year "+ year + " is  Not leap year");
         }else{
             System.out.println("Year "+ year + " is leap year");
         }

    }
}





/*Year 2000 is leap year
Year 2000 is  Not leap year
-------------------------------
Else _ сокращает и выбирает

Year 2000 is  Not leap year

Process finished with exit code 0
*/