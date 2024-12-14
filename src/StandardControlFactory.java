// Concrete Factory: Standard Controls
class StandardControlFactory implements AbstractFactory {
    public LabControl createLabControl() {
        return new StandardLabControl(); // Creates a standard LabControl
    }
    public ExamControl createExamControl() {
        return new StandardExamControl(); // Creates a standard ExamControl
    }
}