import java.util.Scanner;

public class SubtractionQuizLoop{
    public static void main(String[] agrs){
        final int NUMBER_OF_QUESTIONS = 5;
        String output = "";
        int correctAnswer = 0;
        int count = 0;
        long startTime = System.currentTimeMillis();
        Scanner input = new Scanner(System.in);
        
        while(count < NUMBER_OF_QUESTIONS){
            int n1 = (int) (Math.random()*10);
            int n2 = (int) (Math.random()*10);
            System.out.print("What is " + n1 + " - " + n2 + "? ");
            int answer = input.nextInt();
            /*
            if ( n1 < n2){
                int temp = n1;
                n1 = n2;
                n2 = temp;
            }
            */
            if( n1 - n2 == answer){
                System.out.println("Correct Answer boss");
                correctAnswer++;
            }
            else{
                System.out.println("Wrong ans " + n1 + " - " + n2 + " should be+"
                        + " " + (n1 - n2));
            }
            count++;
            output += "\n" + n1 + "-" + n2 + "=" + answer +
            ((n1 - n2 == answer) ? " correct" : " wrong");
        }
        long endTime = System.currentTimeMillis();
        long testTime = endTime - startTime;
        System.out.println("\n\nNo of correct answers: " + correctAnswer +
                " \nTotal test time: " + testTime/1000 + " seconds\n" + output);
    }
}