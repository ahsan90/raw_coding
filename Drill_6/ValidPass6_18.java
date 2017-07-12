import java.util.Scanner;

public class ValidPass6_18{
   
    public static void main(String[] agrs){
       Scanner input = new Scanner(System.in);
       
       System.out.print("Enter the password: ");
       String password = input.next();
       if(isValidPassword(password)){
           System.out.println("Valid password");
       }
       else
           System.out.println("Invalid password");
    }
    
    public static boolean isValidPassword(String password){
        int count = 0;
        for (int i = 0; i < password.length(); i++){
            if (!Character.isDigit(password.charAt(i)) 
                && !Character.isLetter(password.charAt(i)))
                return false;
        }
        if (password.length() < 8)
            return false;
        for ( int i = 0; i < password.length(); i++){
            if (Character.isDigit(password.charAt(i)))
                count++;
        }
        if (count >= 2){
            return true;
        }
        else
            return false;
    }
}