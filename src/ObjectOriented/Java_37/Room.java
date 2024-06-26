package ObjectOriented.Java_37;

public class Room {
    private String name;
    private String department;

    public Room(String name, String department) {
        this.name = name;
        this.department = department;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDepartment() {
        return department;
    }

    public void setDepartment(String department) {
        this.department = department;
    }

    @Override
    public String toString() {
        return
                "name = " + name + '\n' +
                "department = " + department;
    }
}
