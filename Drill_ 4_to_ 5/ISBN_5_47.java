import java.util.Scanner;

public class ISBN_5_47{
    public static void main(String[] agrs){
        Scanner input = new Scanner(System.in);
        
        System.out.print("Enter the digit: ");
        String s = input.nextLine();
    
        //String result = "";
        int checksum = 0;
        int sum = 0;
        
          //result = s.charAt(i) + result;
          if(s.length() == 12){
            for (int i = 0; i < s.length(); i++) {
                char ch = s.charAt(i);
                if(s.length() % 2 == 0){
                sum += 3 * (ch - 48);
                }
                else{
                    sum += ch - 48;
                  }
                //System.out.print(ch + " ");
                }
            checksum = 10 - (sum)%10;
          //System.out.println(s.length());
            if(checksum == 10){
               checksum = 0;
            }
            System.out.println("The ISBN-13 number is " + s + checksum );
          }
          else{
              System.out.println("Invalid input");
          }
    }
}