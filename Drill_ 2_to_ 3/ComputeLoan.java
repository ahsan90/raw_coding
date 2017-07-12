import java.util.Scanner;

public class ComputeLoan{
	
	public static void main(String[] args){
		
		Scanner input = new Scanner(System.in);
		
		System.out.print("Enter annual interest rate, e.g., 7.25%: ");
		
		double annualInterestRate = input.nextDouble();
		double monthlyInterestRate = annualInterestRate/1200;
		
		System.out.print("Enter the number of years: ");
		
		int numberOfYears = input.nextInt();
		
		System.out.print("Enter total Loan amount: ");
		
		double loanAmount = input.nextDouble();
		
		double monthlyPayment = loanAmount*monthlyInterestRate/(1-
		1/Math.pow(1 + monthlyInterestRate,numberOfYears*12));
		
		double totalPayment = monthlyPayment*numberOfYears*12;
		
		System.out.println("Monthly Payment is: $" +(int) monthlyPayment+
		" and the total payment amount is: $" +(int) totalPayment);
		}
	
}