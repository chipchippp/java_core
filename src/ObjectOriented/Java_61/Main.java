package ObjectOriented.Java_61;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        StudentList studentList = new StudentList();
        int choice = 0;
        do {
            System.out.println("Menu");
            System.out.println("1. Add student");
            System.out.println("2. Edit student");
            System.out.println("3. Delete student");
            System.out.println("4. Sort student list");
            System.out.println("5. Show student list");
            System.out.println("6. Search student");
            System.out.println("7. gpa sort student list");
            System.out.println("8. check student list empty");
            System.out.println("9. check student list full");
            System.out.println("0. Exit");
            Student st;
            choice = sc.nextInt();
            sc.nextLine();
            switch(choice) {
                case 1:
                    System.out.println("Enter id: ");
                    String id = sc.nextLine();
                    System.out.println("Enter name: ");
                    String name = sc.nextLine();
                    System.out.println("Enter birth date: ");
                    String birthDate = sc.nextLine();
                    System.out.println("Enter gpa: ");
                    double gpa = sc.nextDouble();
                    st = new Student(id, name, birthDate, gpa);
                    studentList.addStudent(st);
                    break;
                case 2:
                    System.out.println("Enter id: ");
                    id = sc.nextLine();
                    System.out.println("Enter name: ");
                    name = sc.nextLine();
                    System.out.println("Enter birth date: ");
                    birthDate = sc.nextLine();
                    System.out.println("Enter gpa: ");
                    gpa = sc.nextDouble();
                    st = new Student(id, name, birthDate, gpa);
                    studentList.editStudent(st);
                    break;
                    case 3:
                    System.out.println("Enter id: ");
                    id = sc.nextLine();
                    studentList.deleteStudent(id);
                    System.out.println("Deleted student with id: " + id);
                    break;
                    case 4:
                    studentList.sortStudentList();
                    break;
                    case 5:
                    studentList.showStudentList();
                    break;
                    case 6:
                    System.out.println("Enter id: ");
                    name = sc.nextLine();
                    studentList.searchStudent(name);
                    break;
                    case 7:
                    studentList.gpaSortStudentList();
                    break;
                    case 8:
                    System.out.println(studentList.checkStudentListEmpty());
                    break;
                    case 9:
                    System.out.println(studentList.checkStudentListFull());
                    break;
                default:
                    break;

            }

        }while (choice != 0);
    }
}
