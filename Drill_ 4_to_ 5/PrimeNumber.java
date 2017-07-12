import java.util.Scanner;

public class PrimeNumber{
    public static void main(String[] agrs){
        int count = 0;
        //Scanner input = new Scanner(System.in);
        //boolean isPrime = true;
        for(int i = 2; i <= 1000; i++){
           boolean isPrime = true;
           for(int j = 2; j <= i/2; j++){
               if (i % j == 0){
                   isPrime = false;
                   break;
               }
           }
           if(isPrime){
               count++;
               System.out.print(count % 8 == 0?  i + "\n" : i + " ");
               
               /*
               if(count % 8 == 0)
                   System.out.println(i + " ");
               else
                   System.out.print(i + " ");
               */
               }
        }
    }
}