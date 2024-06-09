package ObjectOriented.Java_37;

public class Main {
    public static void main(String[] args) {
        Date date = new Date(1, 1, 2000);
        Date date1 = new Date(1, 1, 2000);
        Date date2 = new Date(1, 1, 2000);

        Room room = new Room("A1", "IT");
        Room room1 = new Room("A2", "BitCoin");
        Room room2 = new Room("A3", "Blockchain");

        Student student = new Student("1", "A", room, 3.5, date);
        Student student1 = new Student("2", "B", room1, 3.4, date1);
        Student student2 = new Student("3", "C", room2, 3.7, date2);

        System.out.println("Name of room: ");
        System.out.println("Student 1: " + student.nameOfRoom());
        System.out.println("Student 2: " + student1.nameOfRoom());
        System.out.println("Student 3: " + student2.nameOfRoom());

        System.out.println("Is passed: ");
        System.out.println("Student 1: " + student.isPassed());
        System.out.println("Student 2: " + student1.isPassed());
        System.out.println("Student 3: " + student2.isPassed());

        System.out.println("Check Date: ");
        System.out.println("Student 1: " + student.checkDate(student1));
        System.out.println("Student 2: " + student1.checkDate(student2));
        System.out.println("Student 3: " + student2.checkDate(student));

    }
}
