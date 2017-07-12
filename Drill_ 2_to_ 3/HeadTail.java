import java.util.Scanner;

public class HeadTail{
    public static void main(String[] agrs){
        
        int number = (int)(Math.random()*2);
        Scanner input = new Scanner(System.in);
        
        System.out.print("Enter your guess either 0 for Head or 1 for Tails");
        
        int guess = input.nextInt();
        
        if (guess == number){
            System.out.println("Your guessed correctly");
        }
        else if (number == 0){
            System.out.println("Sorry this is Head");
        }
        else{
            System.out.println("Sorry this Tail");
        }
    }
}