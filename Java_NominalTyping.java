class Dog {
    void speak() {
        System.out.println("Woof!");
    }
}

class Cat {
    void speak() {
        System.out.println("Meow!");
    }
}

public class Main {
    public static void main(String[] args) {
        Dog dog = new Dog();
        Cat cat = new Cat();

        dog = cat; // Error: incompatible types
    }
}
