import java.util.Scanner;

public class SrpGame{
    public static void main(String[] agrs){
        
        int number = (int)(Math.random()*3);
        
        String s = "Scissor";
        String r = "Rock";
        String p = "Paper";
        
        Scanner input = new Scanner(System.in);
        
        System.out.print("scissor (0), rock (1), paper (2): ");
        int guess = input.nextInt();
        
        if (number == 0 && guess == number){
            System.out.println("The computer number is "+s+" and your number"+
                    " is "+s+". So the result is draw.");
        }
        else if(number == 1 && guess == 2){
            System.out.println("The computer number is "+r+" and your number"+
                    " is "+p+". So You won.");   
        }
        else if(number == 2 && guess == 1){
            System.out.println("The computer number is "+p+" and your number"+
                    " is "+s+". So You won.");
        }
    }
}