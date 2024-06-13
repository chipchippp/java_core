package StringMethods.copyValueOf_1;

public class Main {
    public static void main(String[] args) {
//        Phương copyValueOf()thức trả về a Stringđại diện cho các ký tự của mảng char.
//
//Phương thức này trả về một Stringmảng mới và sao chép các ký tự vào đó.
        char[] arr = {'H', 'e', 'l', 'l', 'o'};
        String str = String.copyValueOf(arr);
        System.out.println(str); // Hello
    }
}
