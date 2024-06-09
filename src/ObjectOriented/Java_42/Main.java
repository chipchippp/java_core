package ObjectOriented.Java_42;

public class Main {
    public static void main(String[] args) {
        Animal dog = new Dog("Dog");
        dog.makeSound();
        dog.eat();
        dog.sleep();

        Animal cat = new Cat("Cat");
        cat.makeSound();
        cat.eat();
        cat.sleep();
    }
}
