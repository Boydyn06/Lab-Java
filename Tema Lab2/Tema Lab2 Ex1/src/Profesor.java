public class Profesor {
    private String firstName;
    private String lastName;

    public Profesor(String firstName, String lastName) {
        this.firstName = firstName;
        this.lastName = lastName;
    }

    public String getFullName() {
        return firstName + " " + lastName;
    }
}





