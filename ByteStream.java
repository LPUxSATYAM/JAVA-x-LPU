/*
Byte Stream:-
Used for: Images Videos Audio Binary files

Charcater Streams:-
Used For - Text files(.txt)
*/

/*
Byte Stream Classes:-
(FOR READING):- 
FileInputStream - 1 byte at a time(disk access every time)
BufferedInputStream - multiple bytes at a time(chunks of bytes) - store in buffer

Character Stream Classes:-
(FOR READING)
FileReader - read() -  reads 1 character at a time - NOreadLine()
BufferedReader - readLine() - can read Line by line
*/




import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

class ByteStream {
    public static void main(String[] args) throws IOException{

        try (FileInputStream fis = new FileInputStream("input.txt");
             FileOutputStream fos = new FileOutputStream("output.txt")) 
        {
            int d;
            while ((d = fis.read()) != -1) {
                fos.write(d);
            }

            System.out.println("File copied successfully!");
        }
    }
}





// import java.io.FileInputStream;
// import java.io.FileWriter;
// import java.io.IOException;

// class ByteToBits {
//     public static void main(String[] args) throws IOException {

//         try (FileInputStream fis = new FileInputStream("input.txt");
//              FileWriter fw = new FileWriter("output.txt")) {

//             int data;

//             while ((data = fis.read()) != -1) {
//                 String bits = String.format("%8s", Integer.toBinaryString(data)).replace(' ', '0');

//                 fw.write(bits);
//                 fw.write("\n");
//             }

//             System.out.println("Converted to bits (text form)!");
//         }
//     }
// }