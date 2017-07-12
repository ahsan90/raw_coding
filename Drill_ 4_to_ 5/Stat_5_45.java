import java.util.Scanner;

public class Stat_5_45{
    public static void main(String[] agrs){
        Scanner input = new Scanner(System.in);
        //for(int count = 1; count <=10; count++){}
        double sum = 0;
        double num = 0;
        int count = 1;
        
        while(count <= 10){
        System.out.print("Enter the numebr: ");
        num = input.nextDouble();
        sum += num;
        count++;
        }
        double mean = sum/(count-1);
        double deviation = Math.sqrt(((sum * sum) - (sum * sum)/(count - 1))/(count - 2));
        System.out.println(count);
        
        System.out.println("The mean is: " + mean + " and Deviation is: " + deviation);
    }
}