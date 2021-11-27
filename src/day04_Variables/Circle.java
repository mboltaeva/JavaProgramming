package day04_Variables;

public class Circle {

    //PI, radius, diameter, area, perimeter

    public static void main(String[] args) {
        double radius = 5.5;

        double PI = 3.14;

        double diameter = radius * 2;
        double area = radius * radius * PI;
         double perimeter = diameter * PI;


        System.out.println("radius = " + radius);
        System.out.println("diameter = " + diameter);
        System.out.println("area = " + area);
        System.out.println("perimeter = " + perimeter);

    }






}
// finds the diameter by multiplying the radius to 2
// finds the area of the circle
// finds the perimeter of the circle

/*
3. Create a class named Circle, write a program that can calculate the area & perimeter of any given Circle
			PI, radius, diameter, area, perimeter
					Hints: 	PI = 3.14
							area = radius * radius * PI
							Perimeter = diameter * PI
 */



