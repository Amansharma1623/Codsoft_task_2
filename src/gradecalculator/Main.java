package gradecalculator;
import java.util.Scanner;
public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter student name: ");
        String name = scanner.nextLine();

        int numSubjects = 5; // Assuming there are 5 subjects
        int[] marks = new int[numSubjects];

        for (int i = 0; i < numSubjects; i++) {
            System.out.print("Enter marks for subject " + (i + 1) + ": ");
            marks[i] = scanner.nextInt();
        }

        Student student = new Student(name, marks);

        double averagePercentage = GradeCalculator.calculateAveragePercentage(marks);
        String grade = GradeCalculator.calculateGrade(averagePercentage);

        System.out.println("Student: " + student.getName());
        System.out.println("Total Marks: " + GradeCalculator.calculateTotalMarks(marks));
        System.out.println("Average Percentage: " + averagePercentage + "%");
        System.out.println("Grade: " + grade);
    }
}
