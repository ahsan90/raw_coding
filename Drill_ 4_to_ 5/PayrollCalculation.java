import java.util.Scanner;

public class PayrollCalculation{
    public static void main(String[] agrs){
        Scanner input = new Scanner(System.in);
        
        System.out.print("Enter Employee name(e.g Smith): ");
        String employeeNmae = input.next();
        
        System.out.print("Enter number of hours worked in a week: ");
        double hoursWorked = input.nextDouble();
        
        System.out.print("Enter hourly pay rate: ");
        double payRate = input.nextDouble();
        
        System.out.print("Enter federal tax withholding rate: ");
        double taxRate = input.nextDouble();
        
        System.out.print("Enter state tax withholding rate: ");
        double stateTaxRate = input.nextDouble();
        
        System.out.println("Employee name: " + employeeNmae);
        
        System.out.println("Hours worked: " + hoursWorked);
        
        System.out.println("Pay rate: $" + payRate);
        
        System.out.println("Gross pay: $" +(hoursWorked*payRate));
        
        double netPay = (hoursWorked*payRate) - ((hoursWorked*payRate)*(taxRate/100) + (hoursWorked*payRate)*(stateTaxRate/100));
        
        System.out.println("Deduction: ");
        System.out.println("\n\tFaderal Withholding (" +taxRate+ "%): " +(hoursWorked*payRate)*(taxRate/100));
        System.out.println("\tState Withholding    ("+ stateTaxRate +"%): " + (hoursWorked*payRate)*(stateTaxRate/100));
        System.out.println("--------------------------------------------------------");
        System.out.println("\tTotal Deduciotn:            " 
                + ((hoursWorked*payRate)*(taxRate/100) + (hoursWorked*payRate)*(stateTaxRate/100)));
        System.out.println("\nNet pay: $" + netPay);
        
        
    }
}