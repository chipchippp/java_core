package StringMethods.contains_1;

public class Main {
    public static void main(String[] args) {
        String str = "Hello World";
        boolean result1 = str.contains("Hello");
        System.out.println(result1); // true

        boolean result2 = str.contains("hello");
        System.out.println(result2); // false

        boolean result3 = str.contains("Hi");
        System.out.println(result3); // false

        System.out.println(str.contains("World")); // true
    }
}
