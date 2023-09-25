/*
    Name:       Marcely Guilmineau
    Date:       09/18/2023
    Period:     3

    Is this lab fully working?  (Yes)
    If not, explain:
    If resubmitting, explain:
*/
public class P3_Guilmineau_Marcely_Taxes {
    
    private double hoursWorked;
    private double hourlyRate;
        
    private final double FEDERAL_TAX = 12.4;
    private final double FICA_TAX = 7.75;
    private final double STATE_TAX = 9.3;
    
    private double grossPay;
    private double netPay;    
    
    public P3_Guilmineau_Marcely_Taxes(double hoursWorked, double hourlyRate) {
        this.hoursWorked = hoursWorked;
        this.hourlyRate = hourlyRate;
    }
    
    public void setHoursWorked(double h) {
        hoursWorked = h;
    }
    
    public double getHoursWorked() {
        return hoursWorked;
    }
    
    public void setHourlyRate(double r) {
        hourlyRate = r;
    }
    
    public double getHourlyRate() {
        return hourlyRate;
    }
    
    public double getInitialFederalTax() {
        return FEDERAL_TAX;
    }
    
    public double getInitialFICATax() {
        return FICA_TAX;
    }
    
    public double getInitialStateTax() {
        return STATE_TAX;
    }
    
    public double getGrossPay() {
        this.grossPay = hoursWorked*hourlyRate;
        return grossPay;
    }
    
    public double getFederalDeduction() {
        return grossPay*0.01*(FEDERAL_TAX);
    }
    
    public double getFICADeduction() {
        return grossPay*0.01*(FICA_TAX);
    }
    
    public double getStateDeduction() {
        return grossPay*0.01*(STATE_TAX);
    }
    
    public double getNetPay() {
        this.netPay = grossPay - getFederalDeduction() - getFICADeduction() - getStateDeduction();
        return netPay;
    }
    
    public void printInfo() {
        System.out.println("Hours worked: " + getHoursWorked());
        System.out.println("Hourly rate: " + getHourlyRate());
        System.out.println();
        System.out.println("Gross pay: " + getGrossPay());
        System.out.println();
        System.out.println("Federal Tax (" + getInitialFederalTax() + "%): " + getFederalDeduction());
        System.out.println("FICA Tax (" + getInitialFICATax() + "%): " + getFICADeduction());
        System.out.println("State Tax (" + getInitialStateTax() + "%): " + getStateDeduction());
        System.out.println();
        System.out.println("Net Pay: " + getNetPay());
    }
}
