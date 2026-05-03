class Calculator<T extends Number> {

    private T num1;
    private T num2;

    Calculator(T num1, T num2) {
        this.num1 = num1;
        this.num2 = num2;
    }

    double add() {
        return num1.doubleValue() + num2.doubleValue();
    }
}


public class Generics3 {
    public static void main(String[] args) {
        Calculator<Integer> obj = new Calculator<>(10, 20);
        System.out.println(obj.add());

        Calculator<Double> obj2 = new Calculator<>(5.5, 2.5);
        System.out.println(obj2.add());
    }
}
