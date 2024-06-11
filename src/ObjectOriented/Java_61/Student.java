package ObjectOriented.Java_61;

import java.util.Objects;

public class Student implements Comparable {
    private String id, name, birthDate;
    private double gpa;

    public Student(String id, String name, String birthDate, double gpa) {
        this.id = id;
        this.name = name;
        this.birthDate = birthDate;
        this.gpa = gpa;
    }

    public Student(String id) {
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

    public String getBirthDate() {
        return birthDate;
    }

    public void setBirthDate(String birthDate) {
        this.birthDate = birthDate;
    }

    public double getGpa() {
        return gpa;
    }

    public void setGpa(double gpa) {
        this.gpa = gpa;
    }

    @Override
    public String toString() {
        return
                "id = " + id + '\n' +
                        "name = " + name + '\n' +
                        "gpa = " + gpa + '\n';
    }
    @Override
    public int compareTo(Object o) {
        return 0;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Student student = (Student) o;
        return Double.compare(gpa, student.gpa) == 0 && Objects.equals(id, student.id) && Objects.equals(name, student.name) && Objects.equals(birthDate, student.birthDate);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, name, birthDate, gpa);
    }
}
