// Required imports
import java.io.BufferedReader; // For reading input
import java.io.InputStreamReader; // For input stream reader


// Main class to demonstrate both Abstract Factory and Observer patterns

public class Demo {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        // Abstract Factory Demo
        System.out.println("Abstract Factory Demo:");
        AbstractFactory factory = new StandardControlFactory(); // Change to AdvancedControlFactory to test advanced controls
        LabControl labControl = factory.createLabControl();
        ExamControl examControl = factory.createExamControl();

        labControl.manageLabGroups(); // Demonstrates managing lab groups
        examControl.setGrade(); // Demonstrates setting grades

        // Observer Pattern Demo
        System.out.println("\nNotifier Demo:");
        Notifier notifier = new Notifier(); // Creating a Notifier object
        Subscriber student = new StudentSubscriber("Arian"); // Creating a student subscriber
        Subscriber lecturer = new LecturerSubscriber("Dr. Gustavo"); // Creating a lecturer subscriber

        notifier.attach(student); // Attaching the student to the notifier
        notifier.attach(lecturer); // Attaching the lecturer to the notifier

        System.out.println("Sending reminder...");
        notifier.notifySubscribers("New lab assignment is available!"); // Sending a notification
    }
}