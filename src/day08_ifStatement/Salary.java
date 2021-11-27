package day08_ifStatement;

public class Salary {


    public static void main(String[] args) {
        int hourlyRate = 35;
        int weeklyHours = 40;

        double stateTax = 0.06;
        double federalTax =  0.15;
        System.out.println((hourlyRate * weeklyHours) * 52);//72800

        int salaryBeforeTax = 72800;
        double stateTax$= salaryBeforeTax * stateTax;
        double federalTax$ = salaryBeforeTax * federalTax;
        double  totalTax$ = stateTax$ + federalTax$;
        double salaryAfterTax = salaryBeforeTax - totalTax$;
        System.out.println("stateTax$ = " + stateTax$);
        System.out.println("federalTax4 = " + federalTax$);
        System.out.println("totalTax$ = " + totalTax$);
        System.out.println("salaryAfterTax = " + salaryAfterTax);


    }
}




