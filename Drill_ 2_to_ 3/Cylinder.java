import java.util.Scanner;

public class Cylinder{
	
	public static void main(String[] args){
		
		final double PI = 3.1416;
		
		Scanner input = new Scanner(System.in);
		
		System.out.print("Enter the raidus of the Cylinder: ");
		
		double raidus = input.nextDouble();
		
		System.out.print("Enter the length of the Cylinder: ");
		
		double length = input.nextDouble();
		
		System.out.println("Area is: " +(int)(raidus*raidus*PI));
		System.out.println("Volume is: " +(int)(raidus*length));
		
		}
	
}