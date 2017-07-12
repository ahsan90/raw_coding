import java.util.Scanner;

public class SalesTax{
	
	public static void main(String[] args){
		
		Scanner input = new Scanner(System.in);
		
		System.out.print("Please Enter the Purchase amount: ");
		
		double purchaseAmount = input.nextDouble();
		
		int taxAmount = (int) (purchaseAmount*0.15);
		
		System.out.println("Total tax is: $" +taxAmount);
		}
	
}