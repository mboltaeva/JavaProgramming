package day12_Scanner;

import java.util.Scanner;

public class ScannerPractice3_NextLine {
    public static void main(String[] args) {

            //nextLine
        Scanner input= new Scanner(System.in);

        System.out.println(" Enter your full name: ");
        String fullName = input.nextLine();

        System.out.println("Enter your Programming Language");
        String programming = input.nextLine();

        //nextInt()

        System.out.println("Enter your age:");
        int age = input.nextInt();//24 тут читает только цифру

        //надо прописать дополнительно nextLine() так как она возвращает кнопку ENTER!!!

        //nextLine()
        input.nextLine();// Enter тут читает кнопку




        System.out.println("Enter your school name: ");
        String schoolName = input.nextLine();


        System.out.println("fullName = "+ fullName);
        System.out.println("programming = " + programming);
        System.out.println("age = "+ age);
        System.out.println("schoolName = " + schoolName);
        input.close();
    }
}
