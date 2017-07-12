import java.util.Scanner;
public class CD{
    public static void main(String[] args) {
    Scanner input = new Scanner(System.in);

    System.out.print("Enter the amount to be saved for each month: $");
    double monthlyDeposit = input.nextDouble();

    System.out.print("Enter the annual interest rate(%): ");
    double annualInterestRate = input.nextDouble();
    double monthlyInterestRate = annualInterestRate / 1200;

    System.out.print("Enter the number of months: ");
    int numberOfMonths = input.nextInt();

    System.out.println("Month\t\tCD value");
    System.out.println("----------------------");
    
    double currentValue = 0;
    for (int i = 1; i <= numberOfMonths; i++) {
      if( i == 1){
          currentValue = monthlyDeposit * (1 + monthlyInterestRate);
          //currentValue;
          System.out.println(i + "\t\t" + (int) currentValue);
      }
      else{
      currentValue = currentValue * (1 + monthlyInterestRate);
      System.out.println(i + "\t\t" + (int)currentValue);
      }
    }

    
  }
}
