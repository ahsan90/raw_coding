import java.util.Scanner;

public class PolygonPoints{
    public static void main(String[] agrs){
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the radius of the circle: ");
        double radius = input.nextDouble();
        
        double angle = Math.random() * 360;
        double x1 = radius * Math.cos(angle * Math.PI / 180);
        double y1 = radius * Math.sin(angle * Math.PI / 180);
        System.out.println("The point P1 is: (" + x1 + ", " + y1 + ")");
        
    }
}