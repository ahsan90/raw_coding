import java.util.Scanner;

public class P{
    public static void main(String[] agrs){
        Scanner input = new Scanner(System.in);
        //System.out.print("Enter the integer number: ");
        //int number = input.nextInt();
        //System.out.println();
        
        /* pattern B
         for (int i = 1; i <= 6; i++) {
            for (int j = 1; j <= 7 - i; j++){
                System.out.print(j + " ");
            }
            System.out.println();
        }
        //with orbitrary input integer
        for (int i = 1; i <= number; i++) {
            for (int j = 1; j <= (number+1) - i; j++){
                System.out.print( j + " ");
            }
            System.out.println();
        }
         */
        //Pattern D
        for (int i = 1; i <= 6; i++) {
            for (int j = 1; j <= 7 - i; j++){
                System.out.print(j + " ");
            }
            System.out.println();
        }
        //for (int i = 1; i <= 6; i++)
        //    System.out.print("      "+i);
        
    }
}