package question21;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;

public class Person implements Serializable {
    private String name;
    private int age;

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    // getters and setters here

    public static void main(String[] args) {
        try {
            // Create an object to serialize
            Person person = new Person("John Doe", 42);

            // Write the object to a file
            FileOutputStream fileOut = new FileOutputStream("person.ser");
            ObjectOutputStream out = new ObjectOutputStream(fileOut);
            out.writeObject(person);
            out.close();
            fileOut.close();

            // Read the object back from the file
            FileInputStream fileIn = new FileInputStream("person.ser");
            ObjectInputStream in = new ObjectInputStream(fileIn);
            Person person2 = (Person) in.readObject();
            in.close();
            fileIn.close();

            // Check that the two objects are the same
            System.out.println(person.equals(person2)); // true
        } catch (IOException | ClassNotFoundException e) {
            e.printStackTrace();
        }
    }
}
