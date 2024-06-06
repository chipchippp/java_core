package Example.Interface_1;

public class Main {
    public static void main(String[] args) {
//        Interface trong Java là một cách để định nghĩa một nhóm các phương thức mà các lớp có thể triển khai.
//        Nó cung cấp một cách để đảm bảo rằng các lớp khác nhau có thể thực hiện các hành vi giống nhau,
//        ngay cả khi chúng không liên quan với nhau trong cây kế thừa.

        // Tạo đối tượng thanh toán bằng thẻ tín dụng
        Payment creditCardPayment = new CreditCardPayment("1234-5678-9012-3456", "John Doe");
        creditCardPayment.pay(100.0);

        // Tạo đối tượng thanh toán bằng PayPal
        Payment payPalPayment = new PayPalPayment("john.doe@example.com");
        payPalPayment.pay(150.0);


//        Định nghĩa Interface:
//
//Interface Payment định nghĩa một phương thức pay mà tất cả các lớp triển khai cần phải có. Phương thức này không có thân hàm, chỉ có khai báo.
//Triển khai Interface:
//
//Lớp CreditCardPayment triển khai interface Payment và cung cấp thân hàm cho phương thức pay. Nó bao gồm các chi tiết cụ thể để xử lý thanh toán bằng thẻ tín dụng.
//Lớp PayPalPayment cũng triển khai interface Payment và cung cấp thân hàm cho phương thức pay. Nó bao gồm các chi tiết cụ thể để xử lý thanh toán bằng PayPal.
//Sử dụng Interface:
//
//Trong lớp Main, chúng ta tạo các đối tượng của CreditCardPayment và PayPalPayment và gọi phương thức pay trên chúng. Bởi vì cả hai lớp này đều triển khai interface Payment, chúng ta có thể xử lý các đối tượng này một cách thống nhất.
//Lợi ích của Interface
//Tính đa hình (Polymorphism): Interface cho phép các lớp khác nhau được xử lý theo cùng một cách thông qua interface chung.
//Tính linh hoạt (Flexibility): Interface tách biệt các định nghĩa hành vi với các triển khai cụ thể, cho phép thay đổi triển khai mà không ảnh hưởng đến mã nguồn khác.
//Tái sử dụng mã nguồn (Code Reusability): Các phương thức sử dụng interface có thể được sử dụng lại với bất kỳ lớp nào triển khai interface đó, giảm thiểu sự trùng lặp mã nguồn.
//Interface là một công cụ mạnh mẽ trong Java để thiết kế các hệ thống linh hoạt và dễ bảo trì, đảm bảo rằng các lớp triển khai những hành vi cần thiết một cách nhất quán.
    }
}
