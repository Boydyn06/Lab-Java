import java.util.HashMap;
import java.util.Map;

class Course {
    private String courseName;
    private Map<String, Student> enrolledStudents;

    public Course(String courseName) {
        this.courseName = courseName;
        this.enrolledStudents = new HashMap<>();
    }

    public void enrollStudent(Student student) {
        enrolledStudents.put(student.getStudentName(), student);
        System.out.println("Student " + student.getStudentName() + " enrolled in course " + courseName);
    }
}