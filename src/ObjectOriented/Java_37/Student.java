package ObjectOriented.Java_37;

public class Student {
    private String id;
    private String name;
    private Room room;
    private double gpa;
    private Date date;

    public boolean checkDate(Student student) {
        return this.date.equals(student.date);
    }
    public String nameOfRoom() {
        return room.getName();
    }
    public boolean isPassed() {
        return gpa >= 3.5;
    }

    public Student(String id, String name, Room room, double gpa, Date date) {
        this.id = id;
        this.name = name;
        this.room = room;
        this.gpa = gpa;
        this.date = date;
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

    public Room getRoom() {
        return room;
    }

    public void setRoom(Room room) {
        this.room = room;
    }

    public double getGpa() {
        return gpa;
    }

    public void setGpa(double gpa) {
        this.gpa = gpa;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    @Override
    public String toString() {
        return
                "id = " + id + '\n' +
                "name = " + name + '\n' +
                "room = " + room + '\n' +
                "gpa = " + gpa + '\n' +
                "date = " + date;
    }
}
