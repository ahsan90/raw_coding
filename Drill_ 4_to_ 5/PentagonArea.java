import java.io.PrintStream;
import java.util.Scanner;

public class PentagonArea{
    public static void main(String[] agrs){
        //final int PI = 180;
        double s = 0; //Side length declaration
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the length from the center to a vertex: ");
        double r = input.nextDouble(); //Center distance to vertex
        
        s = 2*r*Math.sin(Math.PI/5);
        
        double area = (5*s*s)/(4*Math.tan(Math.PI/5));
        System.out.printf("Pentagon area is %.2f", area);
        
    }
}
