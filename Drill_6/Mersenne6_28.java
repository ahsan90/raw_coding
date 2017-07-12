import java.util.Scanner;

public class Mersenne6_28{
   
    public static void main(String[] agrs){
       int p = 2;
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
       int i = 0;
       do{
           i = (int) Math.pow(2, p) - 1;
           if(isPrime(i)){
            System.out.println(p + "\t" +i);
             
            //if(p == 30) break;
           }
           p++;
       }while(p<=31);
    }
    

public static boolean isPrime(int num){
    for(int i = 2; i <= num/2; i++){
        if(num % i == 0){
        return false;
          }
        }
    return true;
    }
}