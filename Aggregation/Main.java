package Aggregation;

public class Main {
    public static void main(String[] args) {
        Instructor instructor = new Instructor("Nima", "Davarpanah", "3-2636");
        Textbook textbook = new Textbook("Clean Code", "Robert Cecil Martin", "Pearson");

        Course course = new Course("Software Engineering", instructor, textbook);
        course.printDetails();
    }
}
