import java.util.Scanner;

public class HexToDecimalWithMethod{
   
    public static void main(String[] agrs){
       Scanner input = new Scanner(System.in);
       System.out.print("Enter the hex value: ");
       String hexString = input.next();
       System.out.print("The decimal value for the hex number" + hexString + " is " + hexToDecimal(hexString.toUpperCase()));
    }
    public static int hexToDecimal(String s){
        int decimalValue = 0;
        for(int i = 0; i < s.length(); i++){
            char c = s.charAt(i);
            decimalValue = decimalValue * 16 + hexCharToDecimal(c);
        }
        return decimalValue;
    }
    
    public static int hexCharToDecimal(char ch){
        if(ch >= 'A' && ch <= 'Z'){
            return 10 + ch - 'A';
        }
        else
            return ch - '0';
    }
}