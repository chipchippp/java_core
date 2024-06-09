package ObjectOriented.Java_42;

public class Animal {
    protected String name;

    public Animal(String name) {
        this.name = name;
    }

    public void eat() {
        System.out.println("i is eating");
    }
    public void makeSound() {
        System.out.println("i is making sound");
    }

    public void sleep() {
        System.out.println("i is sleeping");
    }
}
