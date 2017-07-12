import java.util.Scanner;

public class PrintNbyN_Matrix{
   
    public static void main(String[] agrs){
       Scanner input = new Scanner(System.in);
       
       System.out.print("Enter the value of n: ");
       int n = input.nextInt();
       printMatrix(n);
    }
    public static void printMatrix(int n){
        for(int j = 0; j < n; j++){
          for(int k = 0; k < n; k++){
              int i = (int)(Math.random() * 2);
              System.out.print(i + " "); 
          }
          System.out.println();  
        }
    }
}