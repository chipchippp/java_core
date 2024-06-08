package Example.ArrayList_1.LinkedList;

import java.util.LinkedList;

public class Main {
    public static void main(String[] args) {

//        ArrayList so với LinkedList
//Lớp này LinkedListlà một tập hợp có thể chứa nhiều đối tượng cùng loại, giống như tệp ArrayList.
//
//Lớp này LinkedListcó tất cả các phương thức giống như ArrayListlớp đó vì cả hai đều triển khai Listgiao diện.
// Điều này có nghĩa là bạn có thể thêm mục, thay đổi mục, xóa mục và xóa danh sách theo cách tương tự.
//
//Tuy nhiên, mặc dù ArrayListlớp và LinkedListlớp có thể được sử dụng theo cùng một cách nhưng chúng được xây dựng rất khác nhau.
//
//Cách hoạt động của ArrayList
//Lớp này ArrayListcó một mảng thông thường bên trong nó. Khi một phần tử được thêm vào, nó sẽ được đặt vào mảng.
// Nếu mảng không đủ lớn, một mảng mới lớn hơn sẽ được tạo để thay thế mảng cũ và mảng cũ sẽ bị loại bỏ.
//
//Cách hoạt động của LinkedList
//Cửa LinkedListhàng lưu trữ các mặt hàng của mình trong "thùng chứa". Danh sách có liên kết đến vùng chứa đầu tiên và mỗi vùng chứa có một liên kết
// đến vùng chứa tiếp theo trong danh sách. Để thêm một phần tử vào danh sách, phần tử đó được đặt vào một vùng chứa mới và vùng chứa đó được liên kết
// với một trong các vùng chứa khác trong danh sách.

        LinkedList<String> myObj = new LinkedList<String>();
        myObj.add("John");
        myObj.add("Steve");
        myObj.add("Angie");

        System.out.println(myObj);
        System.out.println(myObj.size());
        myObj.remove("Steve");
        myObj.clear();
        System.out.println(myObj);

    }
}
