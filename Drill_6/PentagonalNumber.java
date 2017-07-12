import java.util.Scanner;

public class PentagonalNumber{
   
    public static void main(String[] agrs){
       Scanner input = new Scanner(System.in);
       disPlayNumber(1);
    }
    
    public static int getPentagonalNumber(int n){
        return n * (3*n - 1)/2;
    }
    public static void disPlayNumber(int number){
        final int limit = 100;
        int count = 0;
        final int NUMBER_PER_LINE = 10;
        while (count < limit){
            count++;
            int p = getPentagonalNumber(number);
            if(count % NUMBER_PER_LINE == 0)
                System.out.printf("%7d\n", p);
            else
                System.out.printf("%7d", p);
            number++;
            
        }
    }
}