package JavaKeyWords.Abstract_1;

public class Main {
    public static void main(String[] args) {
        Student student = new Student();
        System.out.println("Student name: " + student.name);
        System.out.println("Student age: " + student.age);
        System.out.println("Student graduation year: " + student.graduationYear);
        student.study();
    }
}
