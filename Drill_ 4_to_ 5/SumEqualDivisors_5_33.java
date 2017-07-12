import java.util.Scanner;

public class SumEqualDivisors_5_33{
    public static void main(String[] agrs){
        //Scanner input = new Scanner(System.in);
        double sum = 0;
        int count = 0;
        int j;
        for(int i = 2; i < 10000; i++){
            for(j = 1; j <= i/2; j++){
                if(i % j == 0){
                   sum += j;
                }
            }
            if(sum == i){
                    count++;
                    sum = 0;
                    System.out.print(i + " ");
                }
            else{
                sum = 0;
            }
        }
        System.out.println("\n\nTotal number of such integers are: " + count);
    }
}