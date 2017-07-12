import java.util.Scanner;

public class KgToLb{
    public static void main(String[] agrs){
        Scanner input = new Scanner(System.in);
        System.out.println("Kilogram\t\tPound");
        System.out.println("------------------------------");
        for(int i = 1; i <= 50; i++){
            System.out.println(i+"\t\t\t"+(double)(i*2.2));
        }
    }
}