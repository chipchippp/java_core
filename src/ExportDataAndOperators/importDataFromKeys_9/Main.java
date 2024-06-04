package ExportDataAndOperators.importDataFromKeys_9;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhập họ tên: ");
        String name = sc.nextLine();

        System.out.println("Nhập tuổi: ");
        int age = sc.nextInt();

        System.out.println("Nhập điểm trung bình: ");
        double gpa = sc.nextDouble();

        System.out.println("Họ tên: " + name);
        System.out.println("Tuổi: " + age);
        System.out.println("Điểm trung bình: " + gpa);
    }
}
