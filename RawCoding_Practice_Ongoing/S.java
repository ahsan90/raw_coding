import java.util.Scanner;

public class S{
   
    public static void main(String[] args){
       Scanner input = new Scanner(System.in);
       System.out.print("Enter a number between 0 and 1000: ");
       int x = input.nextInt();
       
       if(x > 0 && x < 1000){
           int result = 0;
           while(x != 0){
           int y = x % 10;
           result = result + y;
           x = x/10;
           }
           System.out.print(result);
         }
       else
           System.out.print("The number must be between  0 to 1000 exclusive");
           
    }
}