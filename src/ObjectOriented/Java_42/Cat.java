package ObjectOriented.Java_42;

public class Cat extends Animal{
    public Cat(String name) {
        super("Meow");
    }
    @Override
    public void makeSound() {
        System.out.println("Meow Meow");
    }

    @Override
    public void eat() {
        System.out.println("Cat is eating Cá");
    }
}
