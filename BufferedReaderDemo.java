import java.io.*;

class BufferedReaderDemo {
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader( new InputStreamReader(System.in));

        System.out.println("Enter your name:");
        String name = br.readLine();

        System.out.println("Enter your age:");
        int age = Integer.parseInt(br.readLine());

        System.out.println("Enter a sentence:");
        String sentence = br.readLine();

        



        System.out.println(" \n Mark & Reset Demo");

        BufferedReader br2 = new BufferedReader(new StringReader("JavaIO"));

        br2.mark(4);

        System.out.print("Read chars: ");
        System.out.print((char) br2.read());
        System.out.print((char) br2.read());

        br2.reset();

        System.out.println("\n After reset: " + (char) br2.read());







        System.out.println("Skip Demo");

        BufferedReader br3 = new BufferedReader(new StringReader("Programming"));

        br3.skip(3);
        System.out.println("After skip(3): " + (char) br3.read());




        

        System.out.println("readLine() Demo");

        BufferedReader br4 = new BufferedReader(new StringReader("Hello\nWorld"));

        System.out.println("Line 1: " + br4.readLine()); 
        System.out.println("Line 2: " + br4.readLine());



        br.close();
        br2.close();
        br3.close();
        br4.close();



        System.out.println("Final Output \n");
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
        System.out.println("Sentence: " + sentence);
    }
}
