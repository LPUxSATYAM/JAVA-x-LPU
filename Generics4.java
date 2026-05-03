class Processor<T extends CharSequence> {

    private T data;

    Processor(T data) {
        this.data = data;
    }

    int length() {
        return data.length();
    }
}

public class Generics4 {
    public static void main(String[] args) {
        Processor<String> obj = new Processor<>("Hello");
        System.out.println(obj.length());

        Processor<StringBuilder> obj2 = new Processor<>(new StringBuilder("Java"));
        System.out.println(obj2.length());
    }
}
