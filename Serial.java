import java.io.*;

class Student implements Serializable { // All objects of this class are now allowed to be SERIALIZED
    int id;
    String name;

    Student(int id, String name) {
        this.id = id; // 101
        this.name = name; // Satyam
    }
}

public class Serial {
    public static void main(String[] args) throws Exception {

        Student s1 = new Student(101, "Satyam");

        FileOutputStream fos = new FileOutputStream("student.txt"); // creating the file
        ObjectOutputStream oos = new ObjectOutputStream(fos); // for serialiazation

        oos.writeObject(s1); // Serialization happens

        oos.close();
        fos.close();

        System.out.println("Object Serialized");
    }
}

























// import java.io.*;

// public class DeserializeDemo {
//     public static void main(String[] args) throws Exception {

//         FileInputStream fis = new FileInputStream("student.ser");
//         ObjectInputStream ois = new ObjectInputStream(fis);

//         Student s = (Student) ois.readObject();

//         ois.close();
//         fis.close();

//         System.out.println(s.id + " " + s.name);
//     }
// }