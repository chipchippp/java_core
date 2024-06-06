package Example.Protected_1;

public class OutsidePackageClass extends ParentClass{
    public void testAccess() {
        System.out.println(protectedField);
        protectedMethod();
    }
    public static void main(String[] args) {
        OutsidePackageClass outsidePackageClass = new OutsidePackageClass();
        outsidePackageClass.testAccess();

        ParentClass parent = new ParentClass();
        // Cannot access protected members directly
        // System.out.println(parent.protectedField); // Error
        // parent.protectedMethod(); // Error
    }
}
