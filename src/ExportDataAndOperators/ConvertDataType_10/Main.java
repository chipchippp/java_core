package ExportDataAndOperators.ConvertDataType_10;

public class Main {
    public static void main(String[] args) {
        // Convert data type
        int a = 10;
        double b = a; // Implicit conversion
        System.out.println(b);
//        Implicit casting is done by the compiler
//        Ép kiểu ngầm định được thực hiện bởi trình biên dịch
        double c = 10.5;
        int d = (int) c; // Explicit conversion
        System.out.println(d);

        // Convert operators
//        int e = 10;
//        int f = 3;
//        double g = (double) e / f;
//        System.out.println(g);

        String h = "100000";
        int i = Integer.parseInt(h);
        System.out.println(i);

        // Convert number to string
        int j = 10;
        String k = Integer.toString(j);
        System.out.println(k);

//        Ép kiểu tường minh được thực hiện bởi người lập trình
//        Explicit type pressing is done by the programmer
//      Example: int a = 10; double b = (double) a;
        float l = 3.5F;
        float m = 9.0F;

        int t = (int) (l + m);
        System.out.println(t);
//        Ep kieu giua bien nguyen thuy va doi tuong
//        int x = new Integer(32);
//        System.out.println("x = "+x);
    }
}