import java.util.*;

public class Generics7 {
    public static void addNumbers(List<? super Integer> list) {
        list.add(10);
        list.add(20);
    }

    public static void main(String[] args) {
        List<Number> list = new ArrayList<>();
        addNumbers(list);

        System.out.println(list);
    }
}