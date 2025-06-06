import java.io.*;

class Student implements Serializable {  
    int id;  
    String name;  

    public Student(int id, String name) {  
        this.id = id;  
        this.name = name;  
    }  
}

class Persist {
    public static void main(String args[]) {
        try {
            // Creating the object
            Student s1 = new Student(211, "ravi");

            // Creating stream and writing the object
            FileOutputStream fout = new FileOutputStream("f.txt");
            ObjectOutputStream out = new ObjectOutputStream(fout); // Corrected class name

            out.writeObject(s1);
            out.flush();

            // Closing the stream
            out.close();
            fout.close(); // Also good practice to close the file stream

            System.out.println("Success");

        } catch (Exception e) {
            System.out.println(e);
        }
    }
}
