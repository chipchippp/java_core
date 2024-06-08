package Example.ArrayList_1.HashSet_1;

import java.util.HashSet;

public class Main {
    public static void main(String[] args) {

//        HashSet là một lớp trong Java Collections Framework,
//        được sử dụng để lưu trữ một tập hợp các phần tử duy nhất (không trùng lặp).
//        HashSet triển khai giao diện Set và được xây dựng trên nền tảng của bảng băm (hash table),
//        do đó nó cung cấp hiệu suất cao cho các thao tác cơ bản như thêm, xoá và kiểm tra sự tồn tại của phần tử.
//
//Đặc điểm chính của HashSet:
//Không cho phép các phần tử trùng lặp:
//
//HashSet không cho phép các phần tử trùng lặp. Nếu bạn cố gắng thêm một phần tử đã tồn tại, nó sẽ không được thêm vào.
//Không duy trì thứ tự:
//
//HashSet không duy trì thứ tự của các phần tử. Thứ tự có thể thay đổi sau mỗi lần thêm hoặc xóa phần tử.
//Cho phép null:
//
//HashSet cho phép một phần tử null.
//Hiệu suất cao:
//
//HashSet cung cấp thời gian truy cập trung bình là O(1) cho các thao tác thêm, xóa và kiểm tra sự tồn tại.
        HashSet <String> myObj = new HashSet<String>();
        myObj.add("John");
        myObj.add("Steve");
        myObj.add("Angie");
        System.out.println(myObj);
//        Để kiểm tra xem một mục có tồn tại trong HashSet hay không, hãy sử dụng contains()phương thức:
        System.out.println(myObj.contains("Steve"));

        for (String i : myObj){
            System.out.println(i);
        }

//        Example 2:
        HashSet <Integer> numbers = new HashSet<Integer>();
        numbers.add(4);
        numbers.add(7);
        numbers.add(8);
        numbers.add(2);

        for (int i = 0; i < 10; i++){
            if (numbers.contains(i)){
                System.out.println(i + " found in the set.");
            } else {
                System.out.println(i + " not found in the set.");
            }
        }
    }
}
