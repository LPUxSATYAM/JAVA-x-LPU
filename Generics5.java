import java.util.*;

public class Generics5 {
    
    public static void printList(List<?> list) {
        for (Object obj : list) {
            System.out.println(obj);
        }
    }

    public static void main(String[] args) {
        printList(Arrays.asList(1, 2, "A"));
        printList(Arrays.asList("A", "B", "C"));

        
    }
}




