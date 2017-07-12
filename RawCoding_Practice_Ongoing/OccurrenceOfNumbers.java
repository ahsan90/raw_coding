import java.util.Scanner;

public class OccurrenceOfNumbers{
   
    //Incomplete
    public static void main(String[] args){
       Scanner input = new Scanner(System.in);
       int i = 0;
       double item;
       double[] numbers = new double[100];
       int[] counts = new int[numbers.length];
       //int count = 0;
       do{
           item = input.nextDouble();
           
           if(item >= 0 && item < 100){
            numbers[i] = item;
            i++;
           }
       }while(item != 0);
    }
}