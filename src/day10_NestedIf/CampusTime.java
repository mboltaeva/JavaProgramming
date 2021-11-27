package day10_NestedIf;

public class CampusTime {
    public static void main(String[] args) {
        int time = 24;
        if(time >= 1 && time <= 24){
            if(time >= 8 && time <= 23){
                System.out.println("The Campus is OPEN");
            }else {
                System.out.println("The Campus is CLOSED");
            }
            }else{
            System.out.println("Invalid Number");
            }
        }
    }


