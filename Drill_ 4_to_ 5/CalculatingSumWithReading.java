import java.util.Scanner;

public class CalculatingSumWithReading{
    public static void main(String[] agrs){
        Scanner input = new Scanner(System.in);
        
        int sum = 0;
        System.out.print("Enter number for the sum (program ends if input is 0) :");
        
        int data = input.nextInt();
        
        while(data != 0){
            sum += data;
            System.out.print("Enter number for the sum (program ends if input is 0) :");
        
            data = input.nextInt();
        }
        
        System.out.println("The sum is: " + sum);
    }
}