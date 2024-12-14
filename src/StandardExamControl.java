// Concrete Product: Standard ExamControl
class StandardExamControl implements ExamControl {
    public void setGrade() {
    	//It will accept a boolean for passed or failed
    	//it is used for presentation exams where numerical grades are not relevant
        System.out.println("Setting grades with standard control.");
    }
}