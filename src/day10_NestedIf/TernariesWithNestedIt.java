package day10_NestedIf;

public class TernariesWithNestedIt {
    public static void main(String[] args) {
        int s = 85;
       String b= (s >= 0 && s <= 100)?(s >= 60)? "Passed" : "Failed" : "Invalid Score";
        System.out.println(b);
    }
}
