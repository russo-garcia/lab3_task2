// Concrete Product: Standard LabControl
class StandardLabControl implements LabControl {
    @Override
    public void openLabGroups() {
        System.out.println("Opening lab groups with standard control.");
    }

    @Override
    public void closeLabGroups() {
        System.out.println("Closing lab groups with standard control.");
    }
}
