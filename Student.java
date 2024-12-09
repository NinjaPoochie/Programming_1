public class Student {
    private String firstName;
    private String lastName;
    private String pantherID;
    private double gpa;

    //Constructor
    public Student(String firstName, String lastName, String pantherID, double gpa) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.pantherID = pantherID;
        this.gpa = gpa;
    }

    //Getters
    public String getFirstName() {
        return firstName;
    }
    public String getLastName() {
        return lastName;
    }
    public String getPantherID() {
        return pantherID;
    }
    public double getGpa() {
        return gpa;
    }
    //Setters
    public void setFirstName(String firstName) {this.firstName = firstName;}
    public void setLastName(String lastName) {this.lastName = lastName;}
    public void setPantherID(String pantherID) {this.pantherID = pantherID;}
    public void setGpa(double gpa) {this.gpa = gpa;}

    public String toString() {
        return firstName + " " + lastName + "\nPanther ID: " + pantherID + "\nGPA: " + gpa;
    }

}