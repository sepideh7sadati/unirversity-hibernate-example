package model;

public class StudentModel {
    private String firstName;
    private String lastName;
    private long numberCode;

    public StudentModel() {

    }

    public StudentModel(String firstName, String lastName, long numberCode) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.numberCode = numberCode;
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

    @Override
    public String toString() {
        return "StudentModel: \n" +
                "firstName='" + firstName + '\t' +
                ", lastName='" + lastName + '\t' +
                ", numberCode='" + numberCode +
                '}';
    }
}
