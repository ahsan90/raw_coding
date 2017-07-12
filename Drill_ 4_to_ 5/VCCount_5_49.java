import java.util.Scanner;

public class VCCount_5_49{
    public static void main(String[] agrs){
        Scanner input = new Scanner(System.in);
        
        System.out.println("Enter the String: ");
        String s = input.next();
        
        String vowel = "AEIOU";
        int vCount = 0;
        int cCount = 0;
        
        for(int i = 0; i < s.length(); i++){
            
            //char ch = s.toUpperCase().charAt(i);
            for(int j = 0; j < vowel.length(); j++){
                //char ch = s.toUpperCase().charAt(i);
                
                char vowelCheck = vowel.charAt(j);
                if(vowelCheck == s.toUpperCase().charAt(i)){
                    vCount++;
                    cCount--;
                  }
                }
           cCount++;
            //System.out.print(ch + " ");
        }
        System.out.println(s.length());
        System.out.println("The number of vowels is: " +vCount);
        System.out.println("The number of consonants is: " + cCount);
    }
}