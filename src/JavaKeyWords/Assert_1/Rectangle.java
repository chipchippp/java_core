package JavaKeyWords.Assert_1;

public class Rectangle {
//    Rectangle là hình chữ nhật, có 2 thuộc tính là chiều dài và chiều rộng
   public static double caculateArea(double width, double height) {
        assert width > 0 : "Chiều rộng phải lớn hơn 0";
        assert height > 0 : "Chiều dài phải lớn hơn 0";
        return width * height;
   }
}
