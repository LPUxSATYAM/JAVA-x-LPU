import java.io.*;

public class BufferedWriterDemo {
    public static void main(String[] args) throws IOException {

        BufferedWriter bw = new BufferedWriter(
                new OutputStreamWriter(System.out)
        );

        bw.write("Hello Satyam");


        bw.newLine();


        char[] arr = {'J', 'A', 'V', 'A'};
        bw.write(arr);

        bw.newLine();

        bw.write("BufferedWriterExample", 0, 15); // substring

        bw.newLine();

        bw.write(65);

        bw.newLine();

        bw.flush();

        bw.close();
    }
}