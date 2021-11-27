package day9_IfStatements;

public class GradeLevel {
    public static void main(String[] args) {

        int grade = 15;
        boolean ElementarySchool = grade == 1 || grade == 2 || grade == 3 || grade == 4|| grade == 5;
        boolean MiddleSchool = grade == 6 || grade == 7 ||grade == 8;
        boolean HighSchool = grade == 9 || grade == 10|| grade == 11|| grade == 12;
        boolean College = grade == 13||grade == 14||grade == 15||grade == 16;
        boolean GradSchool = grade == 17||grade == 18;

        if(ElementarySchool){
            System.out.println("Elementary school");
        }
        if(MiddleSchool){
            System.out.println("Middle school");
        }
        if(HighSchool){
            System.out.println("High school");
        }
        if(College){
            System.out.println("College");
        }
        if(GradSchool){
            System.out.println("Grade School");
        }

        // второй вариант можно сразу писать без boolean

        if(grade >= 1 && grade <= 5){
            System.out.println("Elementary school");
        }
        if(grade >= 6 && grade <= 8){
            System.out.println("Middle school");
        }
        if(grade >= 9 && grade <= 12){
            System.out.println("High school");
        }
        if (grade >= 13 && grade <= 16){
            System.out.println("College");
        }
        if(grade >= 17 && grade <= 18){
            System.out.println("Grade School");
        }
    }
}



