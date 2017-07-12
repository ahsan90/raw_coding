import java.util.Scanner;

public class CountLetters{
   
    public static void main(String[] agrs){
       Scanner input = new Scanner(System.in);
       System.out.print("Enter the string: ");
       String s = input.next();
       
       System.out.print("The number of letters in the string " + s + " is : " +countLetters(s));
       
    }
    public static int countLetters(String s){
        int count = 0;
        for ( int i = 0; i < s.length(); i++){
            if (Character.isLetter(s.charAt(i)))
                count++;
        }
        return count;
    }
}