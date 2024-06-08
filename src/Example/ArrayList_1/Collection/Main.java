package Example.ArrayList_1.Collection;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<String> words = new ArrayList<String>();
        ArrayList<String> fruit = new ArrayList<String>();

        fruit.add("orange");
        fruit.add("apple");
        fruit.add("banana");
        fruit.add("grapes");
//        System.out.println("Enter 5 words: ");
//
//        while (true){
//            String word = sc.nextLine();
//            if (word.equalsIgnoreCase("exit")){
//                break;
//            }
//            words.add(word);
//        }
        Collections.sort(fruit);
//        sc.close();
//        for (String word : words){
//            System.out.println(word);
//        }
        for (String i : fruit){
            System.out.println(fruit);
        }
    }
}
