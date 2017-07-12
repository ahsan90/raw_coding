import java.util.Scanner;

public class RectangleOverlaping{
    public static void main(String[] agrs){
        Scanner input = new Scanner(System.in);
        
        System.out.print("Enter r1's center x-, y-coordinates, width, and height: ");
        
        double x1 = input.nextDouble();
        double y1 = input.nextDouble();
        double w1 = input.nextDouble();
        double h1 = input.nextDouble();
        
        System.out.print("Enter r2's center x-, y-coordinates, width, and height:");
        
        double x2 = input.nextDouble();
        double y2 = input.nextDouble();
        double w2 = input.nextDouble();
        double h2 = input.nextDouble();
        
        double v = x1 >= x2? x1 - x2 : x2 - x1;
        double h = y1 >= y2? y1 - y2 : y2 - y1;
        
        if (v <= (w1-w2)/2 && h <= (h1-h2)/4){
            System.out.println("r2 is inside r1");
        }
        else if (v > (w1+w2)/2 && h > (h1+h2)/2){
            System.out.println("r2 does not overlap r1");
        }
        else{
            System.out.println("r2 overlaps r1");
        }
    }
}