package ObjectOriented.Java_61;

import java.util.ArrayList;

public class StudentList {
    private ArrayList<Student> students;

    public StudentList() {
        this.students = new ArrayList();
    }

    public StudentList(ArrayList<Student> students) {
        this.students = students;
    }

    public void addStudent(Student student) {
        this.students.add(student);
    }

    public void editStudent(Student student) {
        for (Student st : students) {
            if (st.getId().equals(student.getId())) {
                st.setName(student.getName());
                st.setBirthDate(student.getBirthDate());
                st.setGpa(student.getGpa());
                break;
            }
        }
    }
    public void deleteStudent(String id) {
        for (Student student : students) {
            if (student.getId().equals(id)) {
                students.remove(student);
                break;
            }
        }
    }
    public void sortStudentList() {
        students.sort((s1, s2) -> s1.getName().compareTo(s2.getName()));
    }

    public void showStudentList() {
        for (Student student : students) {
            System.out.println(student);
        }
    }
    public void searchStudent(String name) {
        for (Student student : students) {
            if (student.getName().equals(name)) {
                System.out.println(student);
                break;
            }
        }
    }
    public void gpaSortStudentList() {
        students.sort((s1, s2) -> Double.compare(s1.getGpa(), s2.getGpa()));
    }
    public boolean checkStudentListEmpty() {
        return students.isEmpty();
    }
    public boolean checkStudentListFull() {
        return students.size() == 2;
    }
}
