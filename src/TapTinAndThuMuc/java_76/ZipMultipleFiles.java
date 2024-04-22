package TapTinAndThuMuc.java_76;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Arrays;
import java.util.List;
import java.io.FileOutputStream;
import java.util.zip.ZipEntry;
import java.util.zip.ZipOutputStream;

public class ZipMultipleFiles {
    public static void main(String[] args) throws IOException {
        List<String> srcFiles = Arrays.asList("C:\\APTECH2210A\\SEM2\\Java_Titv_Swing\\src\\TapTinAndThuMuc\\java_76\\test1.txt", "C:\\APTECH2210A\\SEM2\\Java_Titv_Swing\\src\\TapTinAndThuMuc\\java_76\\test2.txt");
        FileOutputStream fos = new FileOutputStream("C:\\APTECH2210A\\SEM2\\Java_Titv_Swing\\src\\TapTinAndThuMuc\\java_76\\multipleCompressed.zip");
        ZipOutputStream zipOutputStream = new ZipOutputStream(fos);

        for ( String srcFile : srcFiles
             ) {
            File fileToZip = new File(srcFile);
            FileInputStream fis = new FileInputStream(fileToZip);
            ZipEntry zipEntry = new ZipEntry(fileToZip.getName());
            zipOutputStream.putNextEntry(zipEntry);
            byte[] bytes = new byte[1024];
            int length;
            while ((length = fis.read(bytes)) >= 0){
                zipOutputStream.write(bytes, 0 , length);
            }
            fis.close();
        }
        zipOutputStream.close();
        fos.close();
    }
}
