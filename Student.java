// Define a class
public class Student {
    // Fields
    String name;
    int rollNo;

    // Method to set data
    public void setStudentInfo(String n, int r) {
        name = n;
        rollNo = r;
    }

    // Method to display data
    public void displayInfo() {
        System.out.println("Name: " + name + ", Roll No: " + rollNo);
    }

    // Main method
    public static void main(String[] args) {
        // Creating multiple objects
        Student s1 = new Student();
        Student s2 = new Student();
        Student s3 = new Student();

        // Setting data for each object
        s1.setStudentInfo("John", 101);
        s2.setStudentInfo("Emma", 102);
        s3.setStudentInfo("Liam", 103);

        // Displaying information
        s1.displayInfo();
        s2.displayInfo();
        s3.displayInfo();
    }
}
