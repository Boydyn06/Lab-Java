import java.util.List;
import java.util.ArrayList;
public class Course {
    private String courseName;
    private List<Student> enrolledStudents;

    public Course(String courseName) {
        this.courseName = courseName;
        this.enrolledStudents = new ArrayList<>();
    }

    public void enrollStudent(Student student) {
        enrolledStudents.add(student);
        System.out.println("Student " + student.getStudentName() + " enrolled in course " + courseName);
    }

    public List<Student> getEnrolledStudents() {
        return enrolledStudents;
    }
}
