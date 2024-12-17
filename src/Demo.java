import java.io.BufferedReader;
import java.io.InputStreamReader;

// Main class to demonstrate Abstract Factory and Observer patterns
public class Demo {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        // Observer Pattern Demo
        Notifier notifier = new Notifier();
        Subscriber student = new StudentSubscriber("Arian");
        Subscriber lecturer = new LecturerSubscriber("Dr. Gustavo");

        notifier.attach(student);
        notifier.attach(lecturer);

        // Abstract Factory Demo
        System.out.println("Abstract Factory Demo:");
        System.out.println("Choose Controller type:");
        System.out.println("1 - Standard Controller");
        System.out.println("2 - Advanced Controller");

        AbstractFactory factory;
        String choice = reader.readLine();

        // Factory selection based on user input
        switch (choice) {
            case "1":
                factory = new StandardControlFactory();
                System.out.println("You selected Standard Controller.");
                break;
            case "2":
                factory = new AdvancedControlFactory();
                System.out.println("You selected Advanced Controller.");
                break;
            default:
                System.out.println("Invalid choice. Defaulting to Standard Controller.");
                factory = new StandardControlFactory();
                break;
        }

        // Create ExamControl and LabControl objects
        ExamControl examControl = factory.createExamControl();
        LabControl labControl = factory.createLabControl();

        // Setting the1 grade
        System.out.println("\nSetting grades:");
        examControl.setGrade();

        // Lab group management options
        while (true) {
            System.out.println("\nChoose an action for Lab Groups:");
            System.out.println("1 - Open Lab Groups");
            System.out.println("2 - Close Lab Groups");
            if (labControl instanceof AdvancedLabControl) {
                System.out.println("3 - Change Lab Group Size");
            }
            System.out.println("4 - Exit");

            String action = reader.readLine();
            switch (action) {
                case "1":
                    labControl.openLabGroups();
                    break;
                case "2":
                    labControl.closeLabGroups();
                    break;
                case "3":
                    if (labControl instanceof AdvancedLabControl) {
                        System.out.println("Enter new group size:");
                        int size = Integer.parseInt(reader.readLine());
                        ((AdvancedLabControl) labControl).changeLabGroupSize(size);
                    } else {
                        System.out.println("This option is not available in Standard Controller.");
                    }
                    break;
                case "4":
                    System.out.println("Exiting...");
                    break;
                default:
                    System.out.println("Invalid choice. Please try again.");
                    break;
            }
            if (action.equals("4")) break; // Exit the loop
        }
    }
}
