import java.util.Scanner;

public class CountLettersInArray{
   
    public static void main(String[] agrs){
       Scanner input = new Scanner(System.in);
       char[] chars = createArray();
       System.out.println("The lowercase letters are:");
       displayArray(chars);
    }
    
    public static char[] createArray(){
        char[] chars = new char[100];
        for(int i = 0; i < chars.length; i++){
            chars[i] = getRandomLowerCaseLetter();
        }
        return chars;
    }
    public static void displayArray(char[] chars){
        for(int i = 0; i < chars.length; i++){
            if((i+1)%20 == 0)
                System.out.println(chars[i]);
            else
                System.out.print(chars[i] + " ");
        }
    }
    
    public static int[] countLetters(int[] chars){
        return null;
    }
    
    public static void displayCounts(int[] counts){
        
    }
    public static char getRandomLowerCaseLetter(){
        return (char) ('a' + Math.random()*('z' - 'a' + 1)); 
    }
}