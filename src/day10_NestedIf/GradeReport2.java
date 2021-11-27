package day10_NestedIf;

public class GradeReport2 {
    public static void main(String[] args) {
        int score = 135;
        String b =  (score >= 0 && score <= 100)? (score>= 90 )? "Excellent" : (score >= 80 )? "Great" :
                (score >= 70)? "Good " :
                (score >= 60)? "Passed"  : "Failed" : "Invalid Score";
        System.out.println(b);

        System.out.println("----------------------");

// 3












    }
}






