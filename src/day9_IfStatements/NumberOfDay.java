package day9_IfStatements;

public class NumberOfDay {
    public static void main(String[] args) {
        int month = 5;
        if(month == 2){
            System.out.println("28 days");
        }else if (month == 4 || month == 6 || month == 9 ||month == 11){
            System.out.println("30 days");
        }else{
            System.out.println("31 days");
        }


    }


}



