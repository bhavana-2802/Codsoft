import java.util.Scanner;
public class GradeCalculator {
    public static void main(String[] args) {
        // Get the marks obtained in each subject from the user
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the marks obtained in each subject (out of 100):");
        int[] marks = new int[5];
        for (int i = 0; i < marks.length; i++) {
            marks[i] = scanner.nextInt();
        }
        // Calculate the total marks
        int totalMarks = 0;
        for (int mark : marks) {
            totalMarks += mark;
        }
        // Calculate the average percentage
        double averagePercentage = (double) totalMarks / marks.length;
        // Assign grades based on the average percentage
        String grade;
        if (averagePercentage >= 90) {
            grade = "A";
        } else if (averagePercentage >= 80) {
            grade = "B";
        } else if (averagePercentage >= 70) {
            grade = "C";
        } else if (averagePercentage >= 60) {
            grade = "D";
        } else {
            grade = "F";
        }
        // Display the results
        System.out.println("Total Marks: " + totalMarks);
        System.out.println("Average Percentage: " + averagePercentage);
        System.out.println("Grade: " + grade);
    }
}