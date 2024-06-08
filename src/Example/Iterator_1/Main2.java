package Example.Iterator_1;

import java.util.ArrayList;
import java.util.Iterator;

public class Main2 {
    public static void main(String[] args) {
        ArrayList<String> names = new ArrayList<>();
        names.add("Alice");
        names.add("Bob");
        names.add("Charlie");
        names.add("David");

        Iterator<String> it = names.iterator();
        while (it.hasNext()) {
            String name = it.next();
            if (name.equals("Bob")) {
                it.remove();
            }
        }
        System.out.println(names);
    }
//    Lợi ích của Iterator
//Trừu tượng hóa:
//
//Iterator cung cấp một giao diện trừu tượng để duyệt qua các phần tử của tập hợp mà không cần biết chi
// tiết về cấu trúc bên trong của tập hợp đó.
//An toàn trong quá trình duyệt:
//
//Iterator đảm bảo rằng tập hợp không bị thay đổi cấu trúc trong quá trình duyệt,
// giúp tránh các lỗi không mong muốn.
//Loại bỏ phần tử an toàn:
//
//Iterator cung cấp phương thức remove để loại bỏ phần tử
// một cách an toàn trong quá trình duyệt mà không gây ra lỗi đồng bộ.
//Kết luận
//Iterator là một công cụ mạnh mẽ và linh hoạt trong Java, giúp duyệt qua và thao tác với các phần tử trong tập hợp một
// cách an toàn và hiệu quả. Nó là một phần quan trọng của Java Collections Framework và được sử dụng rộng rãi trong
// lập trình Java để làm việc với các tập hợp dữ liệu.
}
