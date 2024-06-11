package JavaKeyWords.Assert_1;

public class Main {
    public static void main(String[] args) {
        double area = Rectangle.caculateArea(5, 10);
        System.out.println("Diện tích hình chữ nhật là: " + area);

        area = Rectangle.caculateArea(-5, 10);
        System.out.println("Diện tích hình chữ nhật là: " + area);
    }
}
