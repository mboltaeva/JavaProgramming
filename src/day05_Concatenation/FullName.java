package day05_Concatenation;

public class FullName {
    public static void main(String[] args) {

        String firstName = "Madina";
        String lastName = "Boltaeva";

        String fullName = firstName + " " + lastName;
        int age = 28;
        String jobTitle = "SDET";
        String companyName = "Apple Inc";
        double salary = 100000.58;

       // System.out.println("Full name of the person is " + fullName + " is "+ age +" years old");
        System.out.println(fullName + " is " + jobTitle + " works at "
                + companyName + ", and " + fullName + "is salary is $" + salary);






    }



}
