import java.util.Scanner;

public class CurrencyConverter{
    public static void main(String[] agrs){
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the exchange rate from dollars to RMB: ");
        double exchangeRate = input.nextDouble();
        System.out.print("Enter 0 to convert dollars to RMB and 1 vice versa: ");
        int number = input.nextInt();
        
        double dollar = 0;
        double rmb = 0;
        
        if (number == 0){
            System.out.print("Enter the dollar amount: ");
            dollar = input.nextDouble();
            rmb = dollar*exchangeRate;
            System.out.println("$" + dollar + " is " + rmb + " yuan");
        }
        else if(number == 1){
            System.out.print("Enter the RMB amount: ");
            rmb = input.nextDouble();
            dollar = rmb/exchangeRate;
            System.out.println(rmb+ " yuan is $" + dollar);
        }
        else{
            System.out.println("Sorry, Incorrent input....");
        }
    }
}