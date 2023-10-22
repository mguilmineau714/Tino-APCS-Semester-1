import java.util.Scanner;
/*
    Name:       Marcely Guilmineau
    Date:       10/21/2023
    Period:     3

    Is this lab fully working?  (Yes)
    If not, explain:
    If resubmitting, explain:
*/
public class P3_Guilmineau_Marcely_LoanTable {
    public static void main(String[] args) {
       Scanner s = new Scanner(System.in);
       System.out.print("Enter the amount of the loan in $: ");
       double loan = s.nextDouble();
       System.out.print("Enter the length of the loan in years: ");
       double length = s.nextDouble();
       System.out.print("Enter a low interest rate in %: ");
       double low = s.nextDouble();
       System.out.print("Enter a high interest rate in %: ");
       double high = s.nextDouble();
       printLoans(loan, length, low, high);
    }
    
    public static void printLoans(double loan, double length, double low, double high) {
        System.out.println();
        System.out.println("Annual Interest Rate\tMonthly Payment");
        for(int i = 0; i <= (high-low)*4; i++) { 
            double p = loan;
            double n = length*12;
            double k = (low+(i/4.0))/100/12.0;
            double c = Math.pow((1 + k), n);
            double a = p*k*c/(c-1);
            System.out.printf(low+(i/4.0) + "\t\t\t" + "$%.2f", a);
            System.out.println();
        }
    }
}
