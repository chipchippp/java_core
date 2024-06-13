package StringMethods.compareTo_1;

public class Main {
    public static void main(String[] args) {
//        Phương thức này compareTo()so sánh hai chuỗi theo từ điển.
//
//Việc so sánh dựa trên giá trị Unicode của từng ký tự trong chuỗi.
//
//Phương thức trả về 0 nếu chuỗi này bằng chuỗi kia.
// Giá trị nhỏ hơn 0 được trả về nếu chuỗi nhỏ hơn chuỗi khác (ít ký tự hơn) và
// giá trị lớn hơn 0 nếu chuỗi lớn hơn chuỗi kia (nhiều ký tự hơn).

// Mẹo: Sử dụng so sánhToIgnoreCase() để so sánh hai chuỗi theo từ điển, bỏ qua sự khác biệt giữa chữ thường và chữ hoa.
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
