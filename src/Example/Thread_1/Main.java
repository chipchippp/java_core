package Example.Thread_1;

public class Main {
    public static void main(String[] args) {
//        Trong Java, Thread được sử dụng để thực hiện lập trình đa luồng,
//        cho phép thực thi đồng thời nhiều đoạn mã. Một Thread là một luồng thực thi độc lập trong một chương trình,
//        và có hai cách chính để tạo một Thread mới:
//
//Kế thừa lớp Thread và ghi đè phương thức run.
//Triển khai giao diện Runnable và truyền một thể hiện của Runnable cho một thể hiện của Thread.
//        MyThread myThread = new MyThread();
//        MyThread myThread2 = new MyThread();
//
//        myThread.start();
//        System.out.println("Main thread");
//        myThread2.start();
//        System.out.println("Main thread 2");


        MyRunnable myRunnable = new MyRunnable();
        Thread thread1 = new Thread(myRunnable);
        Thread thread2 = new Thread(myRunnable);

        // Bắt đầu các luồng
        thread1.start();
        thread2.start();

//        Kế thừa lớp Thread:
//
//Tạo một lớp kế thừa từ lớp Thread.
//Ghi đè phương thức run, chứa mã bạn muốn thực thi trong luồng.
//Tạo các thể hiện của lớp kế thừa và gọi phương thức start để bắt đầu các luồng.
//Triển khai giao diện Runnable:
//
//Tạo một lớp triển khai giao diện Runnable.
//Ghi đè phương thức run, chứa mã bạn muốn thực thi trong luồng.
//Tạo một thể hiện của lớp triển khai Runnable và truyền nó vào thể hiện của lớp Thread.
//Gọi phương thức start của Thread để bắt đầu các luồng.
//So sánh giữa hai cách
//Kế thừa lớp Thread:
//
//Ưu điểm: Đơn giản, dễ hiểu.
//Nhược điểm: Không thể kế thừa từ lớp khác vì Java không hỗ trợ đa kế thừa.
//Triển khai giao diện Runnable:
//
//Ưu điểm: Linh hoạt hơn, có thể kế thừa từ các lớp khác đồng thời triển khai Runnable.
//Nhược điểm: Phức tạp hơn một chút so với cách kế thừa Thread.
//Trong hầu hết các trường hợp, cách triển khai giao diện Runnable được
// khuyến khích vì nó linh hoạt và phù hợp hơn cho các ứng dụng phức tạp.
//
//Kết luận
//Lập trình đa luồng trong Java cung cấp cách thức để thực hiện nhiều công việc đồng thời,
// giúp tăng hiệu suất và khả năng đáp ứng của ứng dụng. Sử dụng Thread và Runnable là hai cách
// phổ biến để tạo và quản lý các luồng trong Java.
    }
}
