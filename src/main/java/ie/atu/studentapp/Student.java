package ie.atu.studentapp;

public class Student {
    // Private fields
    private String name;
    private String email;
    private String course;

    // Default constructor (no arguments)
    public Student() {
    }

    // Constructor that accepts only the name parameter
    public Student(String name) {
        this.name = name;
    }

    // Constructor that accepts name, email, and course
    public Student(String name, String email, String course) {
        this.name = name;
        this.email = email;
        this.course = course;
    }

    // Getter and Setter for name
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    // Getter and Setter for email
    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    // Getter and Setter for course
    public String getCourse() {
        return course;
    }

    public void setCourse(String course) {
        this.course = course;
    }
}