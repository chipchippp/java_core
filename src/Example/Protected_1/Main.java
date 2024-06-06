package Example.Protected_1;

public class Main {
    public static void main(String[] args) {
//        Từ khóa protected trong Java được sử dụng để chỉ định mức độ truy cập của một thành viên (biến hoặc phương thức) trong lớp.
//        Các thành viên được khai báo với từ khóa protected có thể được truy cập bởi:
        ChildClass childClass = new ChildClass();
        childClass.display();

        ParentClass parentClass = new ParentClass();
        System.out.println(parentClass.protectedField);
        parentClass.protectedMethod();
    }
}
