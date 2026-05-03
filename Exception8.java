import java.io.*;

public class Exception8 {
    public static void main(String[] args) {
        try {
            FileReader file = new FileReader("test.txt");
            int data = file.read();
        } catch (IOException | FileNotFoundException  e) {
            System.out.println("File error: " + e.getMessage());
        }
    }
}