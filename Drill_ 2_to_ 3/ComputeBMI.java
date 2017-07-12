import java.util.Scanner;

public class ComputeBMI{
	
	public static void main(String[] args){
		
		Scanner input = new Scanner(System.in);
		
		System.out.print("Enter Weight in pounds: ");
		
		double weight = input.nextDouble();
		
		System.out.print("Enter Height in Inches: ");
		
		double height = input.nextDouble();
		
		double bmi = weight*0.45359237/(Math.pow(height*0.0254,2));
		
		System.out.println("BMI is: " +bmi);
		
		}
	
}