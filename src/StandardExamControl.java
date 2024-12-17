import java.io.BufferedReader;
import java.io.InputStreamReader;

// Concrete Product: Standard ExamControl
class StandardExamControl implements ExamControl {
    public void setGrade() {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int grade = -1;

        // Keep prompting until a valid grade is provided
        while (true) {
            try {
                System.out.println("Enter a grade (1 for PASSED, 0 for FAILED) for Standard Exam Control:");
                grade = Integer.parseInt(reader.readLine());

                if (grade == 0) {
                    System.out.println("Setting grades with standard control.");
                    System.out.println("Grade set: FAILED.");
                    break;
                } else if (grade == 1) {
                    System.out.println("Setting grades with standard control.");
                    System.out.println("Grade set: PASSED.");
                    break;
                } else {
                    System.out.println("Invalid grade. Please provide 1 for PASSED or 0 for FAILED.");
                }
            } catch (Exception e) {
                System.out.println("Invalid input. Please enter a valid integer (1 or 0).");
            }
        }
    }
}
