import java.io.Serializable;

public class authors implements Serializable {
    private int id;
    private String firstName;
    private String lastName;

    public authors(int id, String firstName, String lastName){
        this.firstName=firstName;
        this.lastName=lastName;
        this.id=id;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    @Override
    public String toString() {
        return "Quotes{" +
                "id='" + id + '\'' +
                ", first_Name='" + firstName + '\'' +
                ", last_Name='" + lastName + '\'' +
                '}';


    };
}
