package Example.Iterator_1;

import java.util.ArrayList;
import java.util.Iterator;

public class Main {
    public static void main(String[] args) {
//        Iterator là một giao diện trong Java Collections Framework, được sử dụng để duyệt qua các phần tử trong một tập hợp (collection).
//        Nó cung cấp các phương thức để duyệt qua các phần tử của tập hợp một cách tuần tự và an toàn.
//        Iterator giúp cho việc truy cập các phần tử của một tập hợp mà không cần biết chi tiết về cấu trúc bên trong của tập hợp đó.
//
//Đặc điểm của Iterator
//Duyệt qua các phần tử:
//
//Iterator cho phép duyệt qua các phần tử của một tập hợp một cách tuần tự, từ phần tử đầu tiên đến phần tử cuối cùng.
//Loại bỏ phần tử:
//
//Iterator cung cấp phương thức để loại bỏ các phần tử khỏi tập hợp trong quá trình duyệt.
//Tính nhất quán:
//
//Iterator đảm bảo rằng tập hợp không bị thay đổi cấu trúc trong quá trình duyệt (ngoại trừ việc sử dụng phương thức remove của chính Iterator).
//Các phương thức của Iterator
//boolean hasNext(): Kiểm tra xem tập hợp còn phần tử nào để duyệt không. Trả về true nếu còn phần tử, ngược lại trả về false.
//E next(): Trả về phần tử tiếp theo trong tập hợp. Nếu không còn phần tử nào, phương thức này sẽ ném ra ngoại lệ NoSuchElementException.
//void remove(): Loại bỏ phần tử cuối cùng được trả về bởi next(). Phương thức này có thể được gọi một lần cho mỗi lần gọi next().
// Nếu tập hợp không hỗ trợ thao tác này, phương thức này sẽ ném ra ngoại lệ UnsupportedOperationException.

        ArrayList <String> cars = new ArrayList<String>();
        cars.add("Volvo");
        cars.add("BMW");
        cars.add("Ford");

        Iterator<String> it = cars.iterator();
        while (it.hasNext()) {
            String name = it.next();
            System.out.println(name);
        }
    }
}
