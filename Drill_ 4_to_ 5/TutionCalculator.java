import java.util.Scanner;

public class TutionCalculator{
    public static void main(String[] agrs){
        Scanner input = new Scanner(System.in);
        double sum = 0;
        double tuition = 10000;
        int i = 0;
        while(i <= 10){
            
            i++;
            if(i == 1 )
            continue;
            
            tuition = tuition*1.05;
            if(i<=4){
                sum += tuition*1.05;
            }
            
        }
        System.out.printf("\nTotal tuition in four(4) years: %.2f",sum);
        System.out.printf("\nTuition fee in next 10 years: %.2f\n", tuition);
    }
}