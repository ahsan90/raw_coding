import java.util.Scanner;

public class ComputeTriangleArea{
	
	public static void main(String[] args){
		
		Scanner input = new Scanner(System.in);
		
		System.out.print("Enter three point input: ");
		
		double x1 = input.nextDouble();
		double x2 = input.nextDouble();
		double x3 = input.nextDouble();
		double x4 = input.nextDouble();
		double x5 = input.nextDouble();
		double x6 = input.nextDouble();
		
		double side1 = Math.pow((Math.pow(x2-x1,2) + Math.pow(x4-x3,2)),0.5);
		double side2 = Math.pow((Math.pow(x4-x3,2) + Math.pow(x6-x5,2)),0.5);
		double side3 = Math.pow((Math.pow(x6-x5,2) + Math.pow(x2-x1,2)),0.5);
		
		Double s = (side1 + side2 + side3)/2;
		
		double p = s*(s-side1)*(s-side2)*(s-side3);
		
		double area = Math.pow(p,0.5);
		
		System.out.println("Three sides are: "+(int)side1
		+" "+(int)side2+ " and " +(int)side3);
		
		System.out.println("Area is: " +(int)area);
		
		}
	
}