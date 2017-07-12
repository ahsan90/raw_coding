import java.util.Scanner;

public class Telephone{
    public static void main(String[] agrs){
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the corresponding Letter: ");
        char ch = input.nextLine().charAt(0);
        /*if( ch.length() != 1){
            System.out.println("You must enter only one letter at a time");
            System.exit(1);
        }*/
        //char ch = letter.charAt(0);
        int value = 0;
        if(Character.toUpperCase(ch) <= 'C'){value = 2;}
        else if(Character.toUpperCase(ch) <= 'F') {value = 3;}
        else if(Character.toUpperCase(ch) <= 'I'){value = 4;}
        else if(Character.toUpperCase(ch) <= 'L'){value = 5;}
        else if(Character.toUpperCase(ch) <= 'O'){value = 6;}
        else if(Character.toUpperCase(ch) <= 'S'){value = 7;}
        else if(Character.toUpperCase(ch) <= 'V'){value = 8;}
        else if(Character.toUpperCase(ch) <= 'Z'){value = 9;}
        else{
            System.out.println("Sorry...." + ch + " is Invalid input");
            System.exit(1);
        }
        System.out.println("The numeric value for letter " + ch 
      + " is " + value);
    }
}