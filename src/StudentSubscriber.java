// Concrete Observer: Student
class StudentSubscriber implements Subscriber {
    private String name; // Name of the student

    public StudentSubscriber(String name) {
        this.name = name;
    }

    public void update(String message) {
        System.out.println("Student " + name + " received notification: " + message);
    }
}