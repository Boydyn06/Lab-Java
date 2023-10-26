import java.util.List;
public class Main {
    public static void main(String[] args) {
        Student1 student = new Student1("Tanasoiu", "Bogdan");
        Profesor profesor = new Profesor("Pascu", "Alexandru");

        System.out.println("Nume Student Full: " + student.getFullName());
        System.out.println("Nume Profesor Full: " + profesor.getFullName());
        ManagerCursuri courseManager = new ManagerCursuri();

        // Crearea unui nou curs
        Course mathCourse = new Course("Java");
        courseManager.addCourse("Java", mathCourse);

        // Creare Student
        Student student1 = new Student("Tanasoiu Bogdan");
        Student student2 = new Student("Rosu Alexandru");

        // Inscrierea studentilor la curs
        courseManager.enrollStudent("Java", student1);
        courseManager.enrollStudent("Java", student2);

        // Listați studenții din curs și tipăriți-le numele
        List<Student> studentsInMath = courseManager.listStudentsInCourse("Java");
        System.out.println("Students in Java course:");
        for (Student studentName : studentsInMath) {
            System.out.println(studentName.getStudentName());
        }
    }
}