package Example.OverrideAndOverload;

public class Overload_1 {
    public static void main(String[] args) {

//        Overload (nạp chồng) xảy ra khi có nhiều phương thức trong cùng một lớp có cùng tên nhưng khác nhau về danh sách tham số
//        (số lượng hoặc kiểu tham số). Mục đích của việc nạp chồng là để cho phép các phương thức thực hiện các hành động tương tự
//        nhưng với các loại dữ liệu hoặc số lượng tham số khác nhau.

//        Đặc điểm của Overload:
//Các phương thức nạp chồng phải có cùng tên nhưng khác nhau về số lượng hoặc kiểu tham số.
//Kiểu trả về có thể giống hoặc khác nhau.
//Overload không bị ảnh hưởng bởi mức truy cập của phương thức.
        MathUtil mathUtil = new MathUtil();
        System.out.println(mathUtil.sum(1, 2));
        System.out.println(mathUtil.sum(1, 2, 3));
        System.out.println(mathUtil.sum(1.5, 2.5));
    }
}
