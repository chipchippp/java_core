package DataType.Constant_6;

public class Main {
    public static void main(String[] args) {
        final int x = 10;
//        final là một keyword trong Java, nó được sử dụng để khai báo một hằng số.
//        Một hằng số là một biến mà giá trị của nó không thể thay đổi sau khi đã được gán giá trị.
        final double y = 10.5;
        System.out.printf("x: %d\n", x);
        System.out.printf("y: %.1f\n", y);
//        x = 100; // Error: cannot assign a value to final variable x
//        y = 100.5;
//        System.out.printf("x: %d\n", x);

//        static là gì trong Java?
//        static là một keyword trong Java, nó được sử dụng để khai báo một biến hoặc phương thức là static.
//        Biến static là biến mà giá trị của nó được chia sẻ giữa tất cả các đối tượng của lớp.
//        Phương thức static là phương thức mà có thể được gọi mà không cần tạo một đối tượng của lớp.
//       Ví dụ:
        System.out.println("PI: " + Math.PI);
//        Math.PI là một hằng số static, nó chứa giá trị của số PI (3.141592653589793).
//        Bạn có thể truy cập nó mà không cần tạo một đối tượng của lớp Math.

//        So sánh chuỗi trong Java
        String str = "Hello";
        String str2 = "Hello";
        String str3 = new String("Hello");

        String result = str == str2 ? "Equal" : "Not Equal";
        System.out.println(result); // Equal

        result = str == str3 ? "Equal" : "Not Equal";
        System.out.println(result); // Not Equal

        result = str.equals(str3) ? "Equal" : "Not Equal";
        System.out.println(result); // Equal

    }
}
