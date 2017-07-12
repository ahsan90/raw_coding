
import java.util.Scanner;

public class FiveThousand{
    public static void main(String[] agrs){
        //Scanner input = new Scanner(System.in);
        double sum = 0;
        for(int n = 1; n <= 50000; n++)
            sum += (double) 1/n;
        //}
        //for(int n = 50000; n >= 1; n--)
        //sum += (double) 1/n;
        System.out.println(sum);
    }
}