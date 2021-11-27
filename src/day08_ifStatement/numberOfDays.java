package day08_ifStatement;

public class numberOfDays {
    public static void main(String[] args) {
         int number = 5;
         boolean has28days = number == 2;// for the mounts has 28 days
          boolean has30Days =  number == 4 || number == 6 || number == 11;//for the mount has 30 days
          boolean has31 = !has28days && !has30Days;//if the month does not have 28 and 30 days

        if(has28days){//if the month  has 28 days
            System.out.println("28 days");

        }

        if(has30Days){//if the month  has 30 days
            System.out.println("30 days");

        }

        if(has31){//if the month  has 31 days
            System.out.println(" 31 days");
        }





    }



}
