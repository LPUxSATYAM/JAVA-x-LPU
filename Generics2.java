// Instance Variables -  Non -static Data members
// Static variables - static data members


class Pair<K, V> { //K , V are type parameters
    public  K key;  // Instance variables
    public  V value;

    public Pair(K key, V value) {
        this.key = key;
        this.value = value;
    }
}
public class Generics2{
    public static void main(String[] args) {

        Pair<Integer, String> p1 = new Pair<>(1, "Java");

        Pair<String, String> p2 = new Pair<>("A", "B");
        
        Pair<Double, Boolean> p3 = new Pair<>(10.5, true);

        System.out.println(p1.key);
        System.out.println(p2.value);
        System.out.println(p3.key);
    }
}