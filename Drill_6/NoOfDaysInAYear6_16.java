import java.util.Scanner;

public class NoOfDaysInAYear6_16{
   
    public static void main(String[] agrs){
       Scanner input = new Scanner(System.in);
       
       long totalNumberOfDays = 0;
       for ( int year = 2000; year <= 2020; year++){
           totalNumberOfDays += numberOfDaysInAYear(year);
       }
       
       System.out.println("Total Number of days from 2000 to 2020: "+ totalNumberOfDays);
       
    }
    public static int numberOfDaysInAYear(int year){
        int daysInAYear = 0;
        if(isLeapYear(year)){
            daysInAYear = 366;
        }
        else
           daysInAYear = 365;
        
        return daysInAYear;
    }
    
    public static boolean isLeapYear (int year){
        if ( year % 400 == 0 || (year % 4 == 0 && year % 100 != 0))
            return false;
        else
            return true;
    }
}