package StringMethods.equals_1;

public class Main {
    public static void main(String[] args) {
//        Phương thức này equals() so sánh hai chuỗi ký tự.
        String str1 = "Hello";
        String str2 = "Hello";
        String str3 = "World";
        System.out.println(str1.equals(str2)); // true
        System.out.println(str1.equals(str3)); // false

//        Phương thức này equalsIgnoreCase() so sánh hai chuỗi ký tự, không phân biệt chữ hoa và chữ thường.
        String str4 = "Hello";
        String str5 = "hello";
        System.out.println(str4.equalsIgnoreCase(str5)); // true
    }
}
