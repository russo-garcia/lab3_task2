// Concrete Product: Advanced LabControl
class AdvancedLabControl implements LabControl {
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
    }
}
