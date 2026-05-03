import java.util.*;
class Freq_of_chars{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int[] freq = new int[256];

        while(sc.hasNextLine()) {

            String line = sc.nextLine();
            for(int i =0; i<line.length(); i++) {
                char ch = line.charAt(i);

                if(Character.isLetter(ch)) {
                    freq[ch]++;
                }
            }
            
            if(line.isEmpty())
                break;
        }

        for(int i = 0; i< 256; i++){
            if(freq[i] > 0)
            {
                System.out.println((char)i + " - " + freq[i]);
            }
        }

        sc.close();

        
    }
}