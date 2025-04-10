import java.io.*;

class Student implements Serializable {  
    int id;  
    String name;  

    public Student(int id, String name) {  
        this.id = id;  
        this.name = name;  
    }  
}

class Depersist {
    public static void main(String args[]) {
        try {
            // Creating stream to read the object
            ObjectInputStream in = new ObjectInputStream(new FileInputStream("f.txt"));
            Student s = (Student) in.readObject(); // Read the serialized object

            // Printing the data of the deserialized object
            System.out.println("Deserialization complete!");
            System.out.println("Student ID: " + s.id);
            System.out.println("Student Name: " + s.name);

            // Closing the stream
            in.close();

        } catch (IOException | ClassNotFoundException e) {
            e.printStackTrace();
        }
    }
}
