import java.util.Scanner;

public class SelectionSort{
   
    public static void main(String[] agrs){
       Scanner input = new Scanner(System.in);
       int[] list = {52,5,6,2,6,5,5,8,5,
           4,3,9,2,5,2,46,36,34,4,54};
       for(int i = 0; i < list.length - 1; i++){
           int currentMin = list[i];
           int currentMinIndex = list[i];
           for(int j = i+1; j < list.length; j++){
              if (currentMin > list[j]){
                  currentMin = list[j];
                  currentMinIndex = j;
              }
           }
           
           if(currentMinIndex != i){
               list[currentMinIndex] = list[i];
               list[i] = currentMin;
           }
       }
    }
}