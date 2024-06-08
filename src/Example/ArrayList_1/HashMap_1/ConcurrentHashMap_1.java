package Example.ArrayList_1.HashMap_1;

import java.util.concurrent.ConcurrentHashMap;

public class ConcurrentHashMap_1 {
    public static void main(String[] args) {
        ConcurrentHashMap<Integer, String> map = new ConcurrentHashMap<>();

        // Thêm các cặp khóa-giá trị vào ConcurrentHashMap
        map.put(1, "Alice");
        map.put(2, "Bob");
        map.put(3, "Charlie");

        Thread thread1 = new Thread(() -> {
            // Lặp qua các cặp khóa-giá trị trong ConcurrentHashMap
            for (var entry : map.entrySet()) {
                System.out.println(entry.getKey() + " " + entry.getValue());
                try {
                    Thread.sleep(1000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        });
        Thread thread2 = new Thread(() -> {
            // Kiểm tra xem ConcurrentHashMap có chứa giá trị cụ thể hay không
            if (map.containsValue("Charlie")) {
                System.out.println("Thread 2: ConcurrentHashMap contains value 'Charlie'");
            } else {
                System.out.println("Thread 2: ConcurrentHashMap does not contain value 'Charlie'");
            }
        });

        // Khởi động các luồng
        thread1.start();
        thread2.start();

        // Đợi các luồng hoàn thành
        try {
            thread1.join();
            thread2.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
