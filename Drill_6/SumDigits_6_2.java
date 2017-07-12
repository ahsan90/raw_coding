import java.util.Scanner;

public class SumDigits_6_2{
   
    public static void main(String[] agrs){
       Scanner input = new Scanner(System.in);
       
       System.out.print("Enter the number: ");
       int number = input.nextInt();
       
       sumDigits(number);
    }
    
    public static void sumDigits(int number){
        //int temp = (int) Math.abs(number);
        int sum = 0;
        int reverse = 0;
        while (number != 0){
            int remainder = number % 10;
            sum += remainder;
            reverse = reverse * 10 + remainder; 
            number = number/10;
        }
        System.out.print(sum + " and ther reverse integer is " + reverse);
    }
    /*public static boolean isPalindrome(int number){
        int initialNum = 0;
        int lastDigit = 0;
    }*/
}