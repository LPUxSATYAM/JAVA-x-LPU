import java.util.ArrayList;

public class Collections1 {
    public static void main(String[] args) {

        // Using Generics -> Only String type values allowed
        ArrayList<String> fruits = new ArrayList<>();

        // 1. add() -> Add elements
        fruits.add("Apple");
        fruits.add("Banana");
        fruits.add("Mango");
        fruits.add("Orange");

        System.out.println("After add(): " + fruits);

        // 2. get() -> Access element using index
        String firstFruit = fruits.get(0);
        System.out.println("Using get(0): " + firstFruit);

        // 3. set() -> Update element at specific index
        fruits.set(1, "Grapes");
        System.out.println("After set(1, \"Grapes\"): " + fruits);

        // 4. contains() -> Check if element exists
        boolean hasMango = fruits.contains("Mango");
        System.out.println("Contains Mango? " + hasMango);

        // 5. size() -> Total number of elements
        int totalFruits = fruits.size();
        System.out.println("Size of ArrayList: " + totalFruits);

        // 6. remove() -> Delete element using index
        fruits.remove(2); // Removes Mango
        System.out.println("After remove(2): " + fruits);

        // 7. clear() -> Remove all elements
        fruits.clear();
        System.out.println("After clear(): " + fruits);
    }
}