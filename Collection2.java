import java.util.TreeSet;

class Person implements Comparable<Person> {
    String name;

    public Person(String name) {
        this.name = name;
    }

    @Override
    public int compareTo(Person other) {
        return this.name.compareTo(other.name);
    }

    @Override
    public String toString() {
        return name;
    }
}

public class Collection2 {
    public static void main(String[] args) {
        TreeSet<Person> set = new TreeSet<>();

        set.add(new Person("Alice"));
        set.add(new Person("Bob"));
        set.add(new Person("Charlie"));

        System.out.println(set);
    }
}