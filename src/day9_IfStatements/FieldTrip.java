package day9_IfStatements;

public class FieldTrip {
    public static void main(String[] args) {
      int  gradeNumber = 4;
      String grade;
      if (gradeNumber == 1){
          grade = " grade - 1" +"\n location -  Apple orchard" + "\n number of groups - 3"
                  + "\n teacher in charge - Ms. Smith";
      }else if(gradeNumber == 2){
          grade = " grade - 2" + "\n location - Zoo" + "\n number of groups - 7"+
                  "\n teacher in charge - Mr. Lee";
      }else if(gradeNumber == 3){
          grade = " grade - 3" + "\n location - Aquarium" + "\n number of groups - 5"+
                  "\n teacher in charge - Ms. Wilson";
      }else if(gradeNumber == 4){
          grade = " grade - 4" + "\n location - Movie theater" + "\n number of groups - 2"
                  + "\n teacher in charge - Ms. Reyes";
      }else if (gradeNumber == 5){
          grade = " grade - 5" + "\n location - Museum" + "\n number of groups - 5"+
                  "\n teacher in charge - Ms. Lela";
      }else{
          grade = " grade - 6"+ "\n location - Six Flags" + "\n number of groups - 8"+
                  "\n teacher in charge - Mr. Watt";
      }
        System.out.println(grade);
      }
    }

