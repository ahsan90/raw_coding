import java.util.Scanner;

public class ComputeArea{
	
	public static void main(String[] args){
		double radius;
		double area;
		Scanner input = new Scanner(System.in);
		
		System.out.print("Please Enter the value of radius: ");
		
		radius = input.nextDouble();
		area = radius*radius*3.1416;
		System.out.println("The area for the circle of radius "+ radius + " is " + area);
	}
	
}