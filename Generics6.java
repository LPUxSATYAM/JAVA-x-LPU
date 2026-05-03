import java.util.*;

public class Generics6 {
    public static double sum(List<? extends Number> list) {
        double sum = 0;
        for (Number num : list) {
            sum += num.doubleValue();
        }
        return sum;
    }
    
    public static void main(String[] args) {
        System.out.println(sum(Arrays.asList(1, 2, 3)));
        System.out.println(sum(Arrays.asList(2.5, 3.5)));
    }
}