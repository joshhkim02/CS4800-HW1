package Aggregation;

public class Course {
    private String name;
    // Initialize classes to use within print function
    private Instructor instructor;
    private Textbook textbook;

    // Course Constructor
    public Course(String name, Instructor instructor, Textbook textbook) {
        this.name = name;
        this.instructor = instructor;
        this.textbook = textbook;
    }

    // Print function
    public void printDetails() {
        System.out.println("\nCourse name: " + name);
        System.out.println("Instructor: " + instructor.getFirstName() + " " + instructor.getLastName() + " " + instructor.getOfficeNumber());
        System.out.println("Textbook: " + textbook.getTitle() + " " + textbook.getAuthor() + " " + textbook.getPublisher() + "\n");
    }
}

class Instructor {
    private String firstName;
    private String lastName;
    private String officeNumber;

    // Instructor Constructor
    public Instructor(String firstName, String lastName, String officeNumber) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.officeNumber = officeNumber;
    }

    // Getters
    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public String getOfficeNumber() {
        return officeNumber;
    }

    // Setters
    public void setFirstName(String newFirstName) {
        this.firstName = newFirstName;
    }

    public void setLastName(String newLastName) {
        this.lastName = newLastName;
    }

    public void setOfficeNumber (String newOfficeNumber) {
        this.officeNumber = newOfficeNumber;
    }
}

class Textbook {
    private String title;
    private String author;
    private String publisher;

    // Textbook Constructor
    public Textbook(String title, String author, String publisher) {
        this.title = title;
        this.author = author;
        this.publisher = publisher;
    }

    // Getters
    public String getTitle() {
        return title;
    }

    public String getAuthor() {
        return author;
    }

    public String getPublisher() {
        return publisher;
    }

    // Setters
    public void setTitle(String newTitle) {
        this.title = newTitle;
    } 

    public void setAuthor(String newAuthor) {
        this.author = newAuthor;
    }

    public void setPublisher(String newPublisher) {
        this.publisher = newPublisher;
    }
}