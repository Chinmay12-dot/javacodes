import java.io.*;

class Student implements Serializable {
    private static final long serialVersionUID = 1L; // Recommended for version control
    
    int id;
    String name;
    String course;
    double fee;

    // Constructor
    public Student(int id, String name, String course, double fee) {
        this.id = id;
        this.name = name;
        this.course = course;
        this.fee = fee;
    }
}

public class SerializeISA {
    public static void main(String args[]) {
        // Serialization
        try (FileOutputStream fout = new FileOutputStream("f.txt");
             ObjectOutputStream out = new ObjectOutputStream(fout)) {

            Student s1 = new Student(211, "ravi", "Engineering", 50000);
            out.writeObject(s1);
            System.out.println("Success: Object serialized");

        } catch (IOException e) {
            e.printStackTrace(); // Prints full error details
        }

        // Deserialization
        try (ObjectInputStream in = new ObjectInputStream(new FileInputStream("f.txt"))) {

            Student s = (Student) in.readObject();
            System.out.println("Deserialized Object: " + s.id + " " + s.name + " " + s.course + " " + s.fee);

        } catch (IOException | ClassNotFoundException e) {
            e.printStackTrace(); // Prints full error details
        }
    }
}
