package entity;

import javax.persistence.*;

@Entity
@Table(name = "professor")
public class Professor {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private long id;
    @Column(name = "first_name")
    private String firstName;
    @Column(name = "last_name")
    private String lastname;
    @Column(name = "number_code_personnel")
    private long numberCodePersonnel;

    public Professor() {
    }

    public Professor(String firstName, String lastname, long numberCodePersonnel) {
        this.firstName = firstName;
        this.lastname = lastname;
        this.numberCodePersonnel = numberCodePersonnel;
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

    public String getLastname() {
        return lastname;
    }

    public void setLastname(String lastname) {
        this.lastname = lastname;
    }

    public long getNumberCodePersonnel() {
        return numberCodePersonnel;
    }

    public void setNumberCodePersonnel(long numberCodePersonnel) {
        this.numberCodePersonnel = numberCodePersonnel;
    }
}
