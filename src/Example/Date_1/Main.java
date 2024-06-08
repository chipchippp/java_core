package Example.Date_1;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class Main {
    public static void main(String[] args) {
        LocalDateTime mObj = LocalDateTime.now();
        System.out.println("Before formatting: " + mObj);
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss");

        String formattedDateTime = mObj.format(formatter);
        System.out.println("After formatting: " + formattedDateTime);
    }
}
