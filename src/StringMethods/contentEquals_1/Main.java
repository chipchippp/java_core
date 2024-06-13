package StringMethods.contentEquals_1;

public class Main {
    public static void main(String[] args) {
//        Phương thức này contentEquals()tìm kiếm một chuỗi để tìm hiểu xem nó có
//        chứa cùng một chuỗi ký tự trong chuỗi hoặc StringBuffer đã chỉ định hay không.
        String str1 = "Hello";
        String str2 = "Hello";
        String str3 = "hello";
        String str4 = "Hello World";

        boolean result1 = str1.contentEquals(str2);
        System.out.println(result1); // true

        boolean result2 = str1.contentEquals(str3);
        System.out.println(result2); // false

        boolean result3 = str1.contentEquals(str4);
        System.out.println(result3); // false
    }
}
