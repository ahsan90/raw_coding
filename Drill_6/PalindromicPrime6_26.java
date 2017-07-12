import java.util.Scanner;

public class PalindromicPrime6_26{
   
    public static void main(String[] agrs){
       int count = 1;
       /*
       for(int i = 2; ; i++){
           if(isPalindrom(i) && isPrime(i)){
            System.out.print(i + " ");
            if(count%10 == 0){
                System.out.println();
            }  
            if(count == 100) break;
            count++;
           }
       }
       */
       int i = 2;
       do{
           if(isPalindrom(i) && isPrime(i)){
            System.out.print(i + " ");
            if(count%10 == 0){
                System.out.println();
            }  
            if(count == 100) break;
            count++;
            
           }
           i++;
       }while(true);
    }
    
    
public static int reversal(int num){
    int result = 0;
    while(num != 0){
        int lastDigit = num % 10;
        result = result * 10 + lastDigit;
        num = num/10;
    }
    return result;
}
public static boolean isPalindrom(int num){
    return num == reversal(num);
    }

public static boolean isPrime(int num){
    
    //int x = 2;
    for(int i = 2; i <= num/2; i++){
        if(num % i == 0){
        return false;
          }
        }
    return true;
    }
}