import java.util.Scanner;

public class DecimalToHex{
    public static void main(String[] agrs){
        Scanner input = new Scanner(System.in);
        System.out.print("Enter Decimal value: ");
        int value = input.nextInt();
        String s = "A";
        //char ch = s.charAt(0);
        
        //String hexString = "A";
       
        if (value > 15 && value < 0){
            System.out.println("You must enter the value between 0 to 15 inclusive: ");
            System.exit(value);
        }
        //char ch = hexString.charAt(0);

        else if(value <= 15 && value >= 10){
			char ch = (char) ( value - 10 + 'A')
            /*char s;
            int i = value - 10;
            int i = ch - 'A' + 10;
            if (i == 0){
            ch = s.charAt(0);
            }
            else{
                ch = s.charAt(i);
            }*/
            //int i = ch - 'A' + 10;
            //ch = s.charAt(i);
            System.out.println("The Hex value for the decimal value of "+ value +" is: " + ch);
        }
        else if(value < 10 && value >= 0){
            System.out.println("The Hex value for the decimal value of " + value + " is " + value);
        }
        else{
            System.out.println("Invalid input");
        }
    }
}