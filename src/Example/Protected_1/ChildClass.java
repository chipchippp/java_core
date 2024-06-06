package Example.Protected_1;

public class ChildClass extends ParentClass{
    public void display() {
        System.out.println(protectedField);
        protectedMethod();
    }
}
