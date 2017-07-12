import java.util.Scanner;

public class NumDivideByFiveSix{
    public static void main(String[] agrs){
        Scanner input = new Scanner(System.in);
        int count = 1;
        
        for(int i = 100; i <= 1000; i++){
           if (i%5 == 0 ^ i%6 == 0){
           //System.out.print((count++ % 10 == 0)? i+ "\n" : i + " ");
           if(count++ % 10 == 0)
               System.out.println(i);
           else
               System.out.print(i + " ");
       }
    }
  }
}