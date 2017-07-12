import java.util.Scanner;

public class GCD{
   
    public static void main(String[] agrs){
       Scanner input = new Scanner(System.in);
       
       System.out.print("Enter the first integer: ");
       int n1 = input.nextInt();
       
       System.out.print("Enter the first integer: ");
       int n2 = input.nextInt();
       
       int gcd = gcd(n1, n2);
       
       System.out.println("The greatest common integer of "+ n1 
               + " and " + n2 + " is :" + gcd);
        
    }
    public static int gcd(int n1, int n2) {
        int gcd = 1;
        int k = 2;
        while(k <= n1 && k <= n2){

            if( n1 % k == 0 && n2 % k == 0){
                gcd = k;
            }
             k++;
        }
        return gcd;
    }
}