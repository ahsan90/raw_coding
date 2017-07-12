import java.util.Scanner;

public class PrimeNumberMethod{
   
    public static void main(String[] agrs){
       //Scanner input = new Scanner(System.in);
       System.out.println("The first 50 prime numbers are \n");
       printPrimeNumbers(50);
    }
    
    public static void printPrimeNumbers(int numberOfPrimes) {
        final int NUMBER_OF_PRIME_PER_LINE = 10;
        int number = 2;
        int count = 0;
        while( count < numberOfPrimes ){
            if (isPrime(number)){
                count++;
            
                if (count % NUMBER_OF_PRIME_PER_LINE == 0) {
        // Print the number and advance to the new line
         System.out.printf("%-5s\n", number);
            }
         else
         System.out.printf("%-5s", number);
        }
        // Check whether the next number is prime
        number++;
         
      }
    }
        
    
    public static boolean isPrime(int number) {
        for (int divisor = 2; divisor <= number / 2; divisor++) {
            if (number % divisor == 0) { // If true, number is not prime
                return false; // Number is not a prime
            }
        }
        return true;
    }
}