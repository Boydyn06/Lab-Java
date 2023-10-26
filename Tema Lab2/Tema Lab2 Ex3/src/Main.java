import java.util.List;
public class Main {
    public static void main(String[] args) {
        ManagerCursuri courseManager = new ManagerCursuri();

        // Crearea unui nou curs
        Course mathCourse = new Course("Java");
        courseManager.addCourse("Java", mathCourse);

        // Creare Student
        Student student1 = new Student("Tanasoiu Bogdan");
        Student student2 = new Student("Rosu Alexnadru");

        // Inscrierea studentilor la curs
        courseManager.enrollStudent("Java", student1);
        courseManager.enrollStudent("Java", student2);

        // Listați studenții din curs și tipăriți-le numele
        List<Student> studentsInMath = courseManager.listStudentsInCourse("Java");
        System.out.println("Students in Java course:");
        for (Student student : studentsInMath) {
            System.out.println(student.getStudentName());
        }
    }
}