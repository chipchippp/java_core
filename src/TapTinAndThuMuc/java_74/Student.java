package TapTinAndThuMuc.java_74;

import java.io.Serializable;
import java.util.Objects;

public class Student implements Comparable<Student>, Serializable {
    private String id;
    private String name;
    private int yearBirth;
    private double gpa;

    public Student(String id) {
        this.id = id;
    }

    public Student(String id, String name, int yearBirth, double gpa) {
        this.id = id;
        this.name = name;
        this.yearBirth = yearBirth;
        this.gpa = gpa;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getYearBirth() {
        return yearBirth;
    }

    public void setYearBirth(int yearBirth) {
        this.yearBirth = yearBirth;
    }

    public double getGpa() {
        return gpa;
    }

    public void setGpa(double gpa) {
        this.gpa = gpa;
    }

    @Override
    public String toString() {
        return "Student { " +
                "id = " + id +
                ", name = " + name +
                ", yearBirth = " + yearBirth +
                ", gpa = " + gpa + " }";
    }

    @Override
    public int compareTo(Student o) {
        return this.id.compareTo(o.id);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Student student = (Student) o;
        return Objects.equals(id, student.id);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, name, yearBirth, gpa);
    }
}
