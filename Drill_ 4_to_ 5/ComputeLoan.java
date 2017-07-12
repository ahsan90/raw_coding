import java.util.Scanner;

public class ComputeLoan{
    public static void main(String[] agrs){
        Scanner input = new Scanner(System.in);
        System.out.print("Enter loan amount: $");
        double loanAmount = input.nextDouble();
        System.out.print("Enter number of years: ");
        int years = input.nextInt();
        System.out.println();
        System.out.println("Interest Rate(%)\tMonthly Payment\t\tTotal Payment");
        System.out.println("----------------------------------------------------------------------------");
        /*
        for(double interestRate = 5; interestRate <= 8; interestRate += 0.125){
            double monthlyInterestRate = interestRate/1200;
            double monthlyPayment = loanAmount*monthlyInterestRate/(1 -  1 / Math.pow(1 + monthlyInterestRate, years * 12));
            double totalPayment = monthlyPayment * years * 12;
            System.out.printf("%.3f \t\t$%.2f\t\t\t$%.2f",(monthlyInterestRate*1200), monthlyPayment, totalPayment);
            System.out.println();
        }
        */
        for ( int i = 40; i <= 64; i++){
            double monthlyInterestRate = (double) i/(8*1200);
            double monthlyPayment = loanAmount*monthlyInterestRate/(1 -  1 / Math.pow(1 + monthlyInterestRate, years * 12));
            double totalPayment = monthlyPayment * years * 12;
            System.out.printf("%.3f \t\t\t$%.2f\t\t\t$%.2f",(monthlyInterestRate*1200), monthlyPayment, totalPayment);
            System.out.println();
        }
    }
}