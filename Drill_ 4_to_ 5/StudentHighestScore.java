import java.util.Scanner;

public class StudentHighestScore{
    public static void main(String[] agrs){
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the Number of students: ");
        int numOfStudents = input.nextInt();
        System.out.print("Enter the Name of student: ");
        String aStudent = input.next();
        System.out.print("Enter the score of the student: ");
        double aScore = input.nextDouble();
        
        double secondScore = 0.0;
        String secondStudent = "";
        
        for(int i = 0; i < numOfStudents - 1; i++){
            System.out.print("Enter the Name of student: ");
            String student = input.next();
            System.out.print("Enter the score of the student: ");
            double score = input.nextDouble();
            
            if(score > aScore){
                aStudent = student;
                aScore = score;
            }
        }
        System.out.println("The top student is: " + aStudent + " and " + "the score"
                + " is :" +aScore);
    }
}