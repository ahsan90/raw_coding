import java.util.Scanner;

public class GradingScale{
    public static void main(String[] agrs){
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the grade: ");
        char grade = input.nextLine().charAt(0);
        
        String result = "";
        
        switch(Character.toUpperCase(grade)){
            case 'A': result = "4"; break;
            case 'B': result = "3"; break;
            case 'C': result = "2"; break;
            case 'D': result = "1"; break;
            case 'F': result = "Fail"; break;
            default : System.out.print(grade + " is invalid input");
            System.exit(1);
        }
        System.out.println("The numeric value for grade " + grade 
      + " is " + result);
    }
}