package StringMethods.charAt_1;

public class Main {
    public static void main(String[] args) {
        String str = "Hello  \uD83C\uDF0D";
        char ch = str.charAt(0);
        System.out.println(ch); // H

//        Phương thức codePointAt() trong Java được sử dụng để lấy mã Unicode của ký tự tại một vị trí xác định trong chuỗi.
//        Phương thức này có thể hữu ích khi làm việc với các ký tự Unicode mà có thể
//        không được biểu diễn dưới dạng một ký tự đơn lẻ (như các ký tự ngoài Basic Multilingual Plane của Unicode).
        int result = str.codePointAt(0);
        System.out.println(result);

        //        Phương thức codePointBefore()
        int before = str.codePointBefore(1);
        System.out.println(before);
    }
}
