package JavaKeyWords.Synchronized_1;

public class Main {
    public static void main(String[] args) {
//        Trong Java, từ khóa synchronized được sử dụng để đảm bảo rằng một phương thức hoặc
//        một khối mã chỉ được truy cập bởi một luồng tại một thời điểm, nhằm ngăn chặn các vấn đề
//        liên quan đến đồng bộ hóa trong lập trình đa luồng (multithreading).
//        Điều này giúp tránh tình trạng race condition, nơi nhiều luồng có thể cùng truy cập và
//        thay đổi dữ liệu đồng thời, dẫn đến kết quả không nhất quán.

//        Tóm lại
//Sử dụng synchronized trong Java giúp đảm bảo an toàn trong lập trình đa luồng
// bằng cách kiểm soát quyền truy cập vào các phần quan trọng của mã.
// Điều này ngăn chặn các vấn đề liên quan đến đồng bộ hóa và đảm bảo rằng dữ liệu được cập nhật một cách nhất quán.
        Counter ct = new Counter();
        // Tạo hai luồng để tăng biến đếm
        Thread t1 = new Thread(new Runnable() {
            public void run() {
                for (int i = 0; i < 1000; i++) {
                    ct.increment();
                }
            }
        });
        Thread t2 = new Thread(new Runnable() {
            public void run() {
                for (int i = 0; i < 1000; i++) {
                    ct.increment();
                }
            }
        });
        // Chạy hai luồng
        t1.start();
        t2.start();

        try {
            // Chờ hai luồng kết thúc
            t1.join();
            t2.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        System.out.println("Count = " + ct.getCount());


        Thread t3 = new Thread(() -> {
            for (int i = 0; i < 1000; i++) {
                ct.increment();
            }
        });

        Thread t4 = new Thread(() -> {
            for (int i = 0; i < 1000; i++) {
                ct.increment();
            }
        });

        // Chạy hai luồng
        t3.start();
        t4.start();

        try {
            // Chờ hai luồng kết thúc
            t3.join();
            t4.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("Count = " + ct.getCount());
    }
}
