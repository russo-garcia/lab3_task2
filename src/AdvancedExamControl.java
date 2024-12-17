import java.io.BufferedReader;
import java.io.InputStreamReader;

// Concrete Product: Advanced ExamControl
// This class is used for exams with normal 0 to 15 grades.
class AdvancedExamControl implements ExamControl {
    public void setGrade() {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int grade = -1;

        // Keep prompting until a valid grade is provided
        while (true) {
            try {
                System.out.println("Enter a grade (0 to 15) for Advanced Exam Control:");
                grade = Integer.parseInt(reader.readLine());

                if (grade >= 0 && grade <= 15) {
                    System.out.println("Setting grades with advanced control.");
                    System.out.println("Grade " + grade + " has been set with advanced control.");
                    break;
                } else {
                    System.out.println("Invalid grade. Please provide a grade between 0 and 15.");
                }
            } catch (Exception e) {
                System.out.println("Invalid input. Please enter a valid integer (0 to 15).");
            }
        }
    }
}
