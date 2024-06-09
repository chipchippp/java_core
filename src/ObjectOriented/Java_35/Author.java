package ObjectOriented.Java_35;

public class Author {
    private String name;
    private Date dateOfBirth;

    public Author(String name, Date dateOfBirth) {
        this.name = name;
        this.dateOfBirth = dateOfBirth;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Date getDateOfBirth() {
        return dateOfBirth;
    }

    public void setDateOfBirth(Date dateOfBirth) {
        this.dateOfBirth = dateOfBirth;
    }

    @Override
    public String toString() {
        return
                "Name = " + name + '\n' +
                "DateOfBirth = " + dateOfBirth;
    }
}
