import java.util.Scanner;

public class CompoundInterest{
    public static void main(String[] agrs){
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the amount of savings: $");
        final double initialSaving = input.nextDouble();
        System.out.print("\nEnter the number of months: ");
        int months = input.nextInt();
        System.out.print("\nEnter Interest rate: ");
        double interestRate = input.nextDouble();
        double savings = 0;
        System.out.println();
        
        double monthlyInterestRate = interestRate/(1200);
        for(int i = 1; i <= months; i++){
            if(i == 1){
                savings = initialSaving * (1 + monthlyInterestRate);
            }
            else{
                savings = (initialSaving + savings) * (1 + monthlyInterestRate);
            }
        }
        System.out.printf("The amount in Savings A/C after %d months is : $%.2f", months, savings);
    }
}