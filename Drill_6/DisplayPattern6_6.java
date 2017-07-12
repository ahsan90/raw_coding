import java.util.Scanner;

public class DisplayPattern6_6{
   
    public static void main(String[] agrs){
       Scanner input = new Scanner(System.in);
       
       for(int row = 1; row < 10; row++){
       for (int j = row; j < 10; j++)
        System.out.print("  ");
       
       for (int i = row; i >= 1; i--){
        System.out.print(" " + i);
        //System.out.print(" \n" + i++);
        //i--;
       }
       for (int i = 1; i <= row; i++)
        System.out.print(" " + i);
       
       System.out.println();
        }
    }
}