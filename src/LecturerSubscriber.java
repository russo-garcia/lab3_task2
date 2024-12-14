// Concrete Observer: Lecturer
class LecturerSubscriber implements Subscriber {
    private String name; // Name of the lecturer

    public LecturerSubscriber(String name) {
        this.name = name;
    }

    public void update(String message) {
        System.out.println("Lecturer " + name + " received notification: " + message);
    }
}