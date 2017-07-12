import java.util.Scanner;

public class HexToDecimal{
    public static void main(String[] agrs){
        Scanner input = new Scanner(System.in);
        System.out.print("Enter Hex value: ");
        String hexString = input.nextLine();
       
        if (hexString.length() != 1){
            System.out.println("You must enter exactly one character");
            System.exit(1);
        }
        char ch = hexString.charAt(0);
        if(ch <= 'F' && ch >= 'A'){
            int value = ch - 'A' + 10;
            System.out.println("The Decimal value for " + ch + " is " + value);
        }
        else if(Character.isDigit(ch)){
            System.out.println("The Decimal value for " + ch + " is " + ch);
        }
        else{
            System.out.println("Invalid input");
        }
    }
}