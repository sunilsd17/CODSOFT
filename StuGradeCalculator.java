import java.util.Scanner;

public class StuGradeCalculator {
    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
            while (true) {
                System.out.println("Enter marks obtained (out of 100) in each subject:");
                int totalMarks = 0;
                int totalSubjects;
                System.out.print("Enter the total number of subjects: ");
                totalSubjects = scanner.nextInt();
                for (int i = 1; i <= totalSubjects; i++) {
                    System.out.print("Enter marks for subject " + i + ": ");
                    int marks = scanner.nextInt();
                    totalMarks += marks;
                }
                double averagePercentage = (double) totalMarks / totalSubjects;
                char grade;
                if (averagePercentage >= 90) {
                    grade = 'A';
                } else if (averagePercentage >= 80) {
                    grade = 'B';
                } else if (averagePercentage >= 70) {
                    grade = 'C';
                } else if (averagePercentage >= 60) {
                    grade = 'D';
                } else {
                    grade = 'F';
                }
                System.out.println("\nResults:");
                System.out.println("Total Marks: " + totalMarks);
                System.out.println("Average Percentage: " + averagePercentage + "%");
                System.out.println("Grade: " + grade);
                System.out.print("\nDo you want to calculate grades again? (yes/no): ");
                String continueInput = scanner.next().toLowerCase();
                if (!continueInput.equals("yes")) {
                    break;
                }
            }
        }
    }
}
