package Example.Abstract_1;

abstract  class Animal {
    public String fname = "John";
    public int age = 10;

    public abstract void makeSound();
    public void sleep() {
        System.out.println("The animal is sleeping");
    }

    static class DogBunny extends Animal {
        public int dateOfBirth = 2010;
        public void makeSound() {
            System.out.println("The dog says: bow wow");
        }
    }
}
