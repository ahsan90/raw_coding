import java.util.Scanner;

public class LeapYear{
    public static void main(String[] agrs){
        //Scanner input = new Scanner(System.in);
        System.out.println();
        System.out.println("---------Leap YEar between 101 and 2100----------\n");
        int count = 0;
        for(int i = 101; i <= 2100; i++){
            boolean isLeapYear = true;
            if(i % 4 != 0){
                isLeapYear = false;
            }
            if(isLeapYear){
                count++;
                System.out.print(count % 10 == 0 ? i + "\n" : i + " ");
            }
        }
        System.out.println("\n\nTotal number of leap Years between 101 and 21000"
                + " are :" +count);
    }
}