import java.util.Scanner;

public class ReverseNumber{
   
    public static void main(String[] args){
       Scanner input = new Scanner(System.in);
       int[] list = {1,2,3,4,5,6,7,8};
       //int[] result = reversal(list);
       for(int i = list.length - 1; i >= 0; i--){
           System.out.print(list[i] + " ");
       }
    }
    /*
    public static int[] reversal(int[] nums){
        int[] result = new int[nums.length];
        for(int i = 0, j = result.length -1;
                i < nums.length; i++, j--)
            result[j] = nums[i];
        return result;
    }
    */
    public static int[] reversal(int[] nums){
        int[] result = new int[nums.length];
        for(int i = nums.length - 1, j = 0; i >= 0; i--, j++)
            result[j] = nums[i];
        return result;
    }
}