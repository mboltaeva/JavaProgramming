package day11_Switch_Scanner;

public class Elevator {
    public static void main(String[] args) {
        //Solution 1: used nested if statement
     int floorNumber = 2;
     String number = "";

     if(floorNumber == 1 || floorNumber == 2 || floorNumber == 3){
         if (floorNumber == 1){
             number = "Floor 1 selected. Companies: Lobby, Verizon, Starbucks";
         }else if (floorNumber == 2){
             number = "Floor 2 selected. Companies: Cybertek, NASA, Intelsat";
         }else{
             number = "Floor 3 selected. Companies: Lyft, BofA, Stakehouse";
         }

     }else {
         number = "Invalid floor - 6";
     }
        System.out.println(number);
//Solution 2: used switch statement

        switch (floorNumber){
            case  1:
                number = "Floor 1 selected. Companies: Lobby, Verizon, Starbucks";
                break;
            case 2:
                number = "Floor 2 selected. Companies: Cybertek, NASA, Intelsat";
                break;
            case 3:
                number = "Floor 3 selected. Companies: Lyft, BofA, Stakehouse";
                break;
            default:
                number = "Invalid floor - 6";

        }
        System.out.println(number);
//Solution 3: used if & switch statements mixed

        if(floorNumber == 1 || floorNumber == 2 || floorNumber == 3){
            switch (floorNumber){
                case 1:
                    number = "Floor 1 selected. Companies: Lobby, Verizon, Starbucks";
                    break;
                case 2:
                    number = "Floor 2 selected. Companies: Cybertek, NASA, Intelsat";
                    break;
                case 3:
                    number = "Floor 3 selected. Companies: Lyft, BofA, Stakehouse";
                    break;
            }
        }else {
            number = "Invalid floor - 6";
        }
        System.out.println(number);







    }
}












/*
Create a class called Elevator. A variable named floorNumber is given, write a program that can display the floor info
			when floorNum is 1 -> print "Floor 1 selected. Companies: Lobby, Verizon, Starbucks"
			when floorNum is 2 -> print "Floor 2 selected. Companies: Cybertek, NASA, Intelsat"
			when floorNum is 3 -> print "Floor 3 selected. Companies: Lyft, BofA, Stake house"
			 anything else: print "Invalid floor - 6"

			 Note:
			 	Solution 1: use nested if statement
				Solution 2: use switch statement
				Solution 2: use if & switch statements mixed

 */
