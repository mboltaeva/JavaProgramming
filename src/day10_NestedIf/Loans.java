package day10_NestedIf;

public class Loans {
    public static void main(String[] args) {
        int salary = 100000;
        int CreditScore = 700;
        String loan = "";

        loan = (salary >= 60000 && CreditScore >= 650)? "Loan Approved" : "Loan Denied";
        System.out.println(loan);
    }
}
