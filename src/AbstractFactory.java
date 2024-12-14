// Abstract Factory Interface
interface AbstractFactory {
    LabControl createLabControl(); // Method to create LabControl object
    ExamControl createExamControl(); // Method to create ExamControl object
}