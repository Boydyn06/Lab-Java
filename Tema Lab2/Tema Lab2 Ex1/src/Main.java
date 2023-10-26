
public class Main {
    public static void main(String[] args) {
        Student student = new Student("Tanasoiu", "Bogdan");
        Profesor profesor = new Profesor("Pascu", "Alexandru");

        System.out.println("Nume Student Full: " + student.getFullName());
        System.out.println("Nume Profesor Full: " + profesor.getFullName());
    }
}




