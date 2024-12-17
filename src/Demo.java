import java.io.BufferedReader;
import java.io.InputStreamReader;

// Main class to demonstrate Abstract Factory and Observer patterns
public class Demo {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        // Abstract Factory Demo
        System.out.println("Abstract Factory Demo:");
        System.out.println("Choose Exam Controller type:");
        System.out.println("1 - Standard Exam Controller");
        System.out.println("2 - Advanced Exam Controller");

        AbstractFactory factory;
        String choice = reader.readLine();

        // Factory selection based on user input
        switch (choice) {
            case "1":
                factory = new StandardControlFactory();
                System.out.println("You selected Standard Exam Controller.");
                break;
            case "2":
                factory = new AdvancedControlFactory();
                System.out.println("You selected Advanced Exam Controller.");
                break;
            default:
                System.out.println("Invalid choice. Defaulting to Standard Exam Controller.");
                factory = new StandardControlFactory();
                break;
        }

        LabControl labControl = factory.createLabControl();
        ExamControl examControl = factory.createExamControl();


        // Setting grades
        examControl.setGrade();

        // Managing lab groups
        labControl.manageLabGroups();
        
        // Observer Pattern Demo
        System.out.println("\nNotifier Demo:");
        Notifier notifier = new Notifier();
        Subscriber student = new StudentSubscriber("Arian");
        Subscriber lecturer = new LecturerSubscriber("Dr. Gustavo");

        notifier.attach(student);
        notifier.attach(lecturer);

        System.out.println("Sending reminder...");
        notifier.notifySubscribers("New lab assignment is available!");
    }
}
