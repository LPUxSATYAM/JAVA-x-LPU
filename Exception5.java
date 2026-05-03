import java.io.*;

public class Exception5 {
    public static void main(String[] args) {
        try { //Outer TRY
            FileReader file = new FileReader("test.txt");   //FileNoTfOUNDeXCEPTION

            try { //inner try
                int data = file.read(); 
                System.out.println(data);
            } catch (IOException e) {
                System.out.println("Error reading file");
            }

        } catch (FileNotFoundException e) {
            System.out.println("File not found");
        }
    }
}