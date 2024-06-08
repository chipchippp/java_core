package Example.ArrayList_1.HashMap_1;

import java.util.HashMap;
import java.util.Map;

public class Main {
    public static void main(String[] args) {
//        HashMap là một lớp trong Java Collections Framework, được sử dụng để lưu trữ và quản lý các cặp khóa-giá trị (key-value pairs).
//        Nó được triển khai dựa trên cấu trúc dữ liệu bảng băm (hash table) và cho phép truy cập dữ liệu một cách nhanh chóng thông qua khóa.
//        Đặc điểm chính của HashMap:
//Không duy trì thứ tự:
//
//HashMap không duy trì thứ tự của các phần tử. Thứ tự của các cặp khóa-giá trị có thể thay đổi sau mỗi lần thêm hoặc xoá phần tử.
//Cho phép null:
//
//HashMap cho phép một khóa null và nhiều giá trị null.
//Không đồng bộ (not synchronized):
//
//HashMap không được thiết kế để sử dụng trong môi trường đa luồng (multi-threaded) mà không có sự đồng bộ hóa bên ngoài.
//Hiệu suất cao:
//
//HashMap cung cấp hiệu suất truy cập tốt với độ phức tạp trung bình là O(1) cho các thao tác cơ bản như thêm, xoá và tìm kiếm phần tử.
        HashMap<String, Integer> myObj = new HashMap<String, Integer>();
        myObj.put("John ", 32);
        myObj.put("Steve ", 30);
        myObj.put("Angie ", 33);

        for (Map.Entry<String, Integer> entry : myObj.entrySet()) {
            System.out.println("Key: " + entry.getKey() + ", Value: " + entry.getValue());
        }

//        System.out.println(myObj.size());
//        myObj.remove("Steve ");
//        myObj.clear();
//        System.out.println(myObj);
//        System.out.println(myObj.get("John "));

//        for (String i : myObj.keySet()){
//            System.out.println("key: " + i);
//        }
//
//        for (Integer i : myObj.values()){
//            System.out.println("value: " + i);
//        }
//
//        for (String i : myObj.keySet()){
//            System.out.println("key: " + i + " value: " + myObj.get(i));
//        }
    }
}
