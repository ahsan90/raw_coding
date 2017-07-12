import java.util.Scanner;

public class SumPi{
    public static void main(String[] agrs){
        Scanner input = new Scanner(System.in);
        double sum = 0;
        for(int i = 1; i <= 10000; i++){
            sum += Math.pow((-1), i + 1)/(2*i - 1);
        }
        System.out.println(4*sum);
    }
}