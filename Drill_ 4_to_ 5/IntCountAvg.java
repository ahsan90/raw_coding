import java.util.Scanner;

public class IntCountAvg{
    public static void main(String[] agrs){
        Scanner input = new Scanner(System.in);
        int positives = 0;
        int negatives = 0;
        int totalNoOfInputs = 0;
        double sum = 0;
        double number;
        System.out.print("Enter an integer, the input ends if it is 0: ");
        number = input.nextDouble();
            
        if (number == 0){
            System.out.println("No numbers are entered except: " + (int) number);
        }
        
        else
        {
        while(number != 0)
        {
            if(number > 0){
               positives++;
            }
            if(number < 0){
               negatives++;
            }
            sum += number;
            totalNoOfInputs++;
            
            System.out.print("Enter an integer, the input ends if it is 0: ");
            number = input.nextDouble();
        }
        
        double avgResult = sum/(totalNoOfInputs);
        System.out.println("\nNumber of Positives: " + positives);
        System.out.println("Number of Negatives: " + negatives);
        System.out.println("Total inputs: " + (totalNoOfInputs+1));
        System.out.printf("Average is: %.1f", avgResult);
        }
    }
}