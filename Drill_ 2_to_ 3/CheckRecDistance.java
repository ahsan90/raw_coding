import java.util.Scanner;

public class CheckRecDistance{
    public static void main(String[] agrs){
         //double w = 10/2;
         //double h = 5/2;
        
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the point (x,y): ");
        
        double x = input.nextDouble();
        double y = input.nextDouble();
        
        double hor = Math.sqrt(x*x);
        double ver = Math.sqrt(y*y);
        
        
        if (hor <= 10/2 && ver <= 5/2 ){
            System.out.println("The point ("+x+ "," +y+ ") is inside the Rectangle");
        }
        else {
            System.out.println("The point ("+x+ "," +y+ ") is outside the Rectangle");
        }
    }
}