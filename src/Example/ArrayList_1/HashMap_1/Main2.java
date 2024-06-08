package Example.ArrayList_1.HashMap_1;

import java.util.HashMap;

public class Main2 {
    public static void main(String[] args) {
        HashMap<String, Integer> myObj = new HashMap<String, Integer>();

        myObj.put("John ", 32);
        myObj.put("Steve ", 30);
        myObj.put("Angie ", 33);

// Kiểm tra xem HashMap có chứa khóa cụ thể hay không
        if (myObj.containsKey("John ")) {
            System.out.println("Key: John, Value: " + myObj.get("John "));
        } else {
            System.out.println("Key: John, Value: Not found");
        }

        if(myObj.containsValue(30)){
            System.out.println("HashMap contains value 30");
        } else {
            System.out.println("Key: Steve, Value: Not found");
        }
    }
}
