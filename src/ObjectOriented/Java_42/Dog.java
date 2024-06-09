package ObjectOriented.Java_42;

public class Dog extends Animal{
    public Dog(String name) {
        super("Dog");
    }
    @Override
    public void makeSound() {
        System.out.println("Gau Gau");
    }

    @Override
    public void eat() {
        System.out.println("Dog is eating xương");
    }
}
