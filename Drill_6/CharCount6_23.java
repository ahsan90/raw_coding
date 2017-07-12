import java.util.Scanner;

public class CharCount6_23{
   
    public static void main(String[] agrs){
       Scanner input = new Scanner(System.in);
       
       System.out.print("Enter the string: ");
       String s = input.next();
       
       System.out.print("Enter the string: ");
       char a = (char) input.nextInt();
       //char p = Character.toLowerCase(a);

       //Run time error/Exeption
       
      System.out.print("The number of letters in the string " + s + " is : " +count(s, a));
       
    }
    public static int count(String s, char a){
        int count = 0;
        for ( int i = 0; i < s.length(); i++){
            if (s.charAt(i) == a)
                count++;
        }
        return count;
    }
}