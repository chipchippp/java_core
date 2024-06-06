package Example.Protected_1;

public class Main {
    public static void main(String[] args) {
        ChildClass childClass = new ChildClass();
        childClass.display();

        ParentClass parentClass = new ParentClass();
        System.out.println(parentClass.protectedField);
        parentClass.protectedMethod();
    }
}
