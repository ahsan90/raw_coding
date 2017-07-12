import java.util.Scanner;

public class ComputeAcceleration{
	
	public static void main(String[] args){
		
		Scanner input = new Scanner(System.in);
		
		System.out.print("Enter v0, v1, and t: ");
		double initialV = input.nextDouble();
		
		//System.out.print("Enter final Velocity: ");
		double finalV = input.nextDouble();
		
		//System.out.print("Enter time: ");
		double time = input.nextDouble();
		
		double avgAcc = 0;
		avgAcc = (finalV-initialV)/time;
		
		System.out.println("Average acceleration is: " +avgAcc);
		
		}
	
}