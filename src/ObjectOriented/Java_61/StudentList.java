package ObjectOriented.Java_61;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

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
            if (student.getName().indexOf(name)>=0) {
                System.out.println(student);
            }
        }
    }
    public void gpaSortStudentList() {
        Collections.sort(this.students, new Comparator<Student>() {
            @Override
            public int compare(Student o1, Student o2) {
                if (o1.getGpa() > o2.getGpa()) {
                    return 1;
                } else if (o1.getGpa() < o2.getGpa()) {
                    return -1;
                } else {
                    return 0;
                    }
            }
        });
    }
    public boolean checkStudentListEmpty(Student student) {
        return this.students.contains(student);
    }
    public int checkStudentListFull() {
        return students.size();
    }
}
