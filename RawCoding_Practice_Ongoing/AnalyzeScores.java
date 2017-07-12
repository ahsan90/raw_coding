import java.util.Scanner;

public class AnalyzeScores{
   
    public static void main(String[] args){
       Scanner input = new Scanner(System.in);
       double[] scores = new double[100];
       int numeberOfAbove = 0;
       int numbersOfBellow = 0;
       int count = 0;
       double avg = 0;
       double item;
       double sum = 0;
       
       do{
           System.out.print("Enter the numeber: ");
           item = input.nextDouble();
           if(item >= 0){
           scores[count] = item;
           
           sum += item;
           count++;
           }
       }while(item >= 0);
       
       avg = sum/count;
       
       for(int i = 0; i < count; i++){
           if(scores[i] >= avg){
              numeberOfAbove++; 
           }
           else
              numbersOfBellow++;
       }
           System.out.println("Average is " + avg);
    System.out.println("Number of scores above or equal to the average "
        + numeberOfAbove);
    System.out.println("Number of scores below the average " + numbersOfBellow);

    }
}