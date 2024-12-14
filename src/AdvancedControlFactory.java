// Concrete Factory: Advanced Controls
class AdvancedControlFactory implements AbstractFactory {
    public LabControl createLabControl() {
        return new AdvancedLabControl(); // Creates an advanced LabControl
    }
    public ExamControl createExamControl() {
        return new AdvancedExamControl(); // Creates an advanced ExamControl
    }
}