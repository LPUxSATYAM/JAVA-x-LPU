import java.io.*;

class Student implements Serializable {
    int id;
    String name;
    transient String password; // this will not be serialized

    Student(int id, String name , String password) {
        this.id = id;
        this.name = name;
        this.password = password;
    }
}

public class Serial_Deserial {
    public static void main(String[] args) throws Exception{

        Student s1 = new Student(101, "Satyam" , "secret123");

        FileOutputStream fos = new FileOutputStream("student.bin");//creating
        ObjectOutputStream oos = new ObjectOutputStream(fos);

        oos.writeObject(s1);
        oos.close();
        fos.close();

        System.out.println("Object Serialized\n");

        
        FileInputStream fis = new FileInputStream("student.bin"); // open
        ObjectInputStream ois = new ObjectInputStream(fis);

        Student s2 = (Student) ois.readObject(); // Binary format -> 
        ois.close();
        fis.close();

        
        System.out.println("After Deserialization:");
        System.out.println("ID: " + s2.id);
        System.out.println("Name: " + s2.name);
        System.out.println("Password: " + s2.password);
    }
}
