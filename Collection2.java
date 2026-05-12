import java.util.TreeSet;

/*
Comparable is used to define natural sorting
inside the class using compareTo() method but with OBJECTS.
TreeSet automatically calls compareTo()
to sort custom objects.
*/

class Person implements Comparable<Person> {
    String name;

    public Person(String name) {
        this.name = name;
    }

    @Override // annotation for the compiler
    public int compareTo(Person other) {
        return name.compareTo(other.name);
    }

    @Override
    public String toString() {
        return name;
    }
}

public class Collection2 {
    public static void main(String[] args) {
        TreeSet<Person> set = new TreeSet<>();

        Person p1 = new Person("Bob");
        set.add(p1);

        // set.add(new Person("Bob"));

        Person p2 = new Person("Alice");
        set.add(p2);


        set.add(new Person("Charlie"));

        System.out.println(set);
    }
}