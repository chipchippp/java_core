package TapTinAndThuMuc.java_74;

import java.io.File;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        try {
            StudentList studentList = new StudentList();
            int luaChon = 0;
            do {
                System.out.println("---------Menu-----------");
                System.out.println("Vui lòng chọn chức năng: ");
                System.out.println(
                        "1.	Thêm sinh viên vào danh sách.\n"
                                + "2.	In danh sách sinh viên ra màn hình.\n"
                                + "3.	Kiểm tra danh sách có rỗng hay không.\n"
                                + "4.	Lấy ra số lượng sinh viên trong danh sách.\n"
                                + "5.	Làm rỗng danh sách sinh viên.\n"
                                + "6.	Kiểm tra sinh viên có tồn tại trong danh sách hay không, dựa trên mã sinh viên.\n"
                                + "7.	Xóa một sinh viên ra khỏi danh sách dựa trên mã sinh viên.\n"
                                + "8.	Tìm kiếm tất cả sinh viên dựa trên Tên được nhập từ bàn phím.\n"
                                + "9.	Xuất ra danh sách sinh viên có điểm từ cao đến thấp.\n"
                                + "10.	Lưu danh sách sinh viên xuống tập tin.\n"
                                + "11.	Đọc sách sinh viên từ tập tin.\n"
                                + "0.   Thoát khỏi chương trình");
                luaChon = sc.nextInt();
                sc.nextLine();

                if (luaChon==1){
                    System.out.println("Nhập mã student: ");
                    String id = sc.nextLine();
                    System.out.println("Nhập name student: ");
                    String name = sc.nextLine();
                    System.out.println("Nhập year of birth student: ");
                    int yearBirth = sc.nextInt();
                    System.out.println("Nhập gpa student: ");
                    double gpa = sc.nextDouble();
                    Student st = new Student(id, name, yearBirth, gpa);
                    studentList.addStudent(st);
                } else if (luaChon==2) {
                    studentList.inStudentList();
                } else if (luaChon==3) {
                    System.out.println("Kiểm tra danh sách rỗng: " +studentList.checkListRong());
                } else if (luaChon==4) {
                    System.out.println("Kiểm tra số lượng danh sách : " +studentList.layQuantityStudent());
                } else if (luaChon==5) {
                    studentList.lamRongDanhSach();
                    System.out.println("đã xóa studentList!!!");
                } else if (luaChon==6) {
                    System.out.println("Nhập mã student: ");
                    String id = sc.nextLine();
                    Student st = new Student(id);
                    System.out.println("Kiếm tra sinh viên có trong danh sách: "+studentList.checkStudentCoTonTai(st));
                } else if (luaChon==7) {
                    System.out.println("Nhập mã student: ");
                    String id = sc.nextLine();
                    Student st = new Student(id);
                    System.out.println("Remove id student list: "+studentList.removeStudent(st));
                } else if (luaChon==8) {
                    System.out.println("Nhập name student: ");
                    String name = sc.nextLine();
                    System.out.println("Result search: ");
                    studentList.searchStudent(name);
                } else if (luaChon==9) {
                    studentList.sortStudentGiamDanGpa();
                    studentList.inStudentList();
                }else if (luaChon==10) {
                    System.out.println("Nhap ten file: ");
                    String tenFile = sc.nextLine();
                    File f = new File(tenFile);
                    studentList.ghiDataXuongFile(f);
                } else if(luaChon==11) {
                    System.out.println("Nhap ten file: ");
                    String tenFile = sc.nextLine();
                    File f = new File(tenFile);
                    studentList.docDuLieuTuFile(f);
                }
            }while (luaChon!=0);
        }catch (Exception e){
            System.out.println(e);
        }


    }
}
