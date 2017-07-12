import java.util.Scanner;

public class Inverstment6_7{
   
    public static void main(String[] agrs){
       Scanner input = new Scanner(System.in);
       
       System.out.print("Enter the Investment amount: $");
       double investmentAmount = input.nextDouble();
       
       //System.out.print("Enter the number of years: ");
       //int years = input.nextInt();
       final int years = 30;
       
       System.out.print("Enter the interest rate: ");
       double interestRate = input.nextDouble();
       
       System.out.println("\nYears     Future Value\n-------------------------------");
       
       for(int count = 1; count <= years; count++){
           
           System.out.printf("%-2d         %4.2f" ,count, futureInvestmentValue(
           investmentAmount, monthlyInterestRate(interestRate), count));
           System.out.println();
        } 
    }
    public static double futureInvestmentValue(double 
            investmentAmount, double monthlyInterestRate, int years){
        
        double futureInvestmentValue = 0;
        
        futureInvestmentValue = investmentAmount * Math.pow(
                1 + monthlyInterestRate, years * 12);
        
        return futureInvestmentValue;
    }
    public static double monthlyInterestRate(double interestRate){
        return interestRate/1200;
    }
}