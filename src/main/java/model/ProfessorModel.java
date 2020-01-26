package model;

public class ProfessorModel {

    private String firstName;
    private String lastname;
    private long numberCodePersonnel;

    public ProfessorModel() {
    }

    public ProfessorModel(String firstName, String lastname, long numberCodePersonnel) {
        this.firstName = firstName;
        this.lastname = lastname;
        this.numberCodePersonnel = numberCodePersonnel;
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

    @Override
    public String toString() {
        return "ProfessorModel \n" +
                "firstName='" + firstName + '\t' +
                ", lastname='" + lastname + '\t' +
                ", numberCodePersonnel=" + numberCodePersonnel +
                '}';
    }
}
