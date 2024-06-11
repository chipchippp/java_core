package JavaKeyWords.Interface_1;

public class Pig implements Animal{
    @Override
    public void eat() {
        System.out.println("Pig is eating");
    }

    @Override
    public void sleep() {
        System.out.println("Pig is sleeping");
    }
}
