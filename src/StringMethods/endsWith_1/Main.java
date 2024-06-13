package StringMethods.endsWith_1;

public class Main {
    public static void main(String[] args) {
//        Phương thức này endsWith()kiểm tra xem một chuỗi có kết thúc bằng (các) ký tự được chỉ định hay không.
//
//Mẹo: Sử dụng phương thức startedWith() để kiểm tra xem một chuỗi có bắt đầu bằng (các) ký tự được chỉ định hay không.
        String str = "Hello World";
        boolean result1 = str.endsWith("World");
        System.out.println(result1); // true

        boolean result2 = str.endsWith("world");
        System.out.println(result2); // false

        boolean result3 = str.endsWith("Hello");
        System.out.println(result3); // false

        System.out.println(str.endsWith("d")); // true
    }
}
