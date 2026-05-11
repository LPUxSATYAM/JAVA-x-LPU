// COLLECTIONS ---> HashMap

/*
HashMap is used to store data in key-value pairs 
provides fast insertion, deletion, and retrieval 
using hashing mechanism.

Instead of searching every element one by one, 
Java uses a hash function to decide exactly where the data should be stored.
*/


import java.util.HashMap;

public class Collections4 {
    public static void main(String[] args) {

        // Creating a HashMap
        HashMap<Integer, String> employees = new HashMap<>();


        // put() -> Adding key-value pairs
        employees.put(101, "Alice");
        employees.put(102, "Bob");
        employees.put(103, "Charlie");



        employees.put(102, "David");



        employees.put(104, "David");


        // One null key is allowed
        employees.put(null, "No ID Employee");



        // Multiple null values are allowed
        employees.put(105, null);
        employees.put(106, null);

        

        // get() -> Fetch value using key
        System.out.println("Employee with ID 103: " + employees.get(103));

        // remove() -> Remove key-value pair
        employees.remove(101);

        // containsKey() -> Check if key exists
        System.out.println("Is ID 102 present? " + employees.containsKey(102));

        // containsValue() -> Check if value exists
        System.out.println("Is value Bob present? " + employees.containsValue("Bob"));

        // size() -> Total number of entries
        System.out.println("Total Employees: " + employees.size());

        // Print complete HashMap
        System.out.println("All Employees: " + employees);



        for (Integer id : employees.keySet()) {
            System.out.println("Employee ID: " + id);
        }



        for (String name : employees.values()) {
            System.out.println("Employee Name: " + name);
        }


        for (var entry : employees.entrySet()) {
            System.out.println(
                    "ID: " + entry.getKey() +
                    ", Name: " + entry.getValue()
            );
        }
    }
}