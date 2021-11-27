package day12_Scanner;

import java.util.Scanner;

public class PeopleLive {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.println("How many people they live with: ");

        int people = scan.nextInt();

        if (people < 3){
            System.out.println("Live with less than 3 people");
        }else if (people >= 3 && people <= 6){
            System.out.println("Live with 3-6 people");
        }else {
            System.out.println("Live with more than 6 people");
        }
        scan.close();
    }
}
