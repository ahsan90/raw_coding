import java.util.Scanner;

public class CheckCircleDistance{
    public static void main(String[] agrs){
        
        //int o1 = 0;
        //int o2 = 0;
        double distance = 0;
        
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the point (x,y): ");
        
        int x = input.nextInt();
        int y = input.nextInt();
        
        distance = Math.sqrt(x*x + y*y);
        
        if (distance < 10){
            System.out.println("The point ("+x+ "," +y+ ") is inside the circle of radius 10" );
        }
        else{
            System.out.println("The point ("+x+ "," +y+ ") is outside the circle of radius 10" );
        }
        
    }
}