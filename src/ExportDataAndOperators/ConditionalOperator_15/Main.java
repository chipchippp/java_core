package ExportDataAndOperators.ConditionalOperator_15;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number: ");
        int number = sc.nextInt();
        String result = (number % 2 == 0) ? "Even" : "Odd";
        System.out.println(number + " là "+result );
        int a = 10;
        int b = 5;
        int max = (a < b) ? a : b;
        System.out.println(max);
    }
}
