// Concrete Product: Advanced LabControl
// This class is used to manage sizes and open/close lab groups.
class AdvancedLabControl extends Notifier implements LabControl{
    @Override
    public void openLabGroups() {
        System.out.println("Opening lab groups with advanced control.");
    }

    @Override
    public void closeLabGroups() {
        System.out.println("Closing lab groups with advanced control.");
    }

    // Additional functionality specific to AdvancedLabControl
    public void changeLabGroupSize(int size) {
        System.out.println("Changing lab group size to " + size + " with advanced control.");
        System.out.println("Sending reminder...");

        Notifier.notifySubscribers("New lab size is " + size);
    }





}
