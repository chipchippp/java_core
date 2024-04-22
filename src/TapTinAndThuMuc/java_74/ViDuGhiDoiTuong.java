package TapTinAndThuMuc.java_74;

import java.io.*;
public class ViDuGhiDoiTuong {
    public static void main(String[] args) {
        try {
            File file = new File("C:\\APTECH2210A\\SEM2\\Java_Titv_Swing\\src\\TapTinAndThuMuc\\java_74\\luu.txt");
            InputStream is = new FileInputStream(file);
            ObjectInputStream ois =new ObjectInputStream(is);

            Student st = (Student) ois.readObject();
            System.out.println(st.getGpa());
            System.out.println(st);
            ois.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
