package StringMethods.compareTo_1;

public class Main {
    public static void main(String[] args) {
        String str1 = "Hello";
        String str2 = "hello";
        String str3 = "Hello";
        String str4 = "World";

        // So sánh str1 với str2
        int result1 = str1.compareTo(str2);
        System.out.println(result1); // -32

        // So sánh str1 với str3
        int result2 = str1.compareTo(str3);
        System.out.println(result2); // 0

        // So sánh str1 với str4
        int result3 = str1.compareTo(str4);
        System.out.println(result3); // -15

        int result4 = str1.compareToIgnoreCase(str2);
        System.out.println(result4); // 0
    }
}
