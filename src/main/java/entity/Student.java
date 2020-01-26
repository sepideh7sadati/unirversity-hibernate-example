package entity;

import javax.persistence.*;

@Entity
@Table(name = "student")
public class Student {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private long id;
    @Column(name = "first_name")
    private String firstName;
    @Column(name = "last_name")
    private String lastName;
    @Column(name = "number_code")
    private long numberCode;
    @Column(name = "address")
    private String address;

    public Student() {
    }

    public Student(String firstName, String lastName, long numberCode, String address) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.numberCode = numberCode;
        this.address = address;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
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

    public long getNumberCode() {
        return numberCode;
    }

    public void setNumberCode(long numberCode) {
        this.numberCode = numberCode;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }
}
