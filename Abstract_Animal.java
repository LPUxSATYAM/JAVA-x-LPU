abstract class Animal
{
    void eat()
    {
        System.out.println("Animal eat");
    }
    abstract void sound();
}

class Dog extends Animal{
    void sound(){
        System.out.println("Dog barks");
    }
}

class Cat extends Animal{
    void sound(){
        System.out.println("Cat meows");
    }
}

class Abstract_Animal{
    public static void main(String[] args)
    {
        Animal a = new Dog();
        a.eat();
        a.sound();
    }
}
