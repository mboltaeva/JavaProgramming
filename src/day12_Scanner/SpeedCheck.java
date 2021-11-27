package day12_Scanner;

import java.util.Scanner;

public class SpeedCheck {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int speedLimit = 55;
        System.out.println("Enter current speed: ");

         int num = scan.nextInt();

         if(num > speedLimit){
             System.out.println("You're driving 50 mph over the limit. Slow down!");
         }
        scan.close();
    }
}
