import java.util.Scanner;

public class EstimatingPI{
   
    public static void main(String[] agrs){
       Scanner input = new Scanner(System.in);
       System.out.printf("%-20s%-20s\n", "i", "m(i)");
       
       for (int i = 1; i <= 1000; i += 100)
       System.out.printf("%-20d%-20.4f\n", i, m(i));
    }
    public static double m(int i){
        
        double pi = 0;
        double sign = 1;
        for ( int j = 1; j <= i; j++){
            pi += sign/(2 * j - 1.0);
            sign = -1 * sign;
        }
        
        return 4 * pi;
    }
}