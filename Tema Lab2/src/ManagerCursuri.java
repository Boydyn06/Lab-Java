import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
public class ManagerCursuri {
    private Map<String, Course> courses;

    public ManagerCursuri() {
        this.courses = new HashMap<>();
    }

    public void addCourse(String courseName, Course course) {
        courses.put(courseName, course);
    }

    public void enrollStudent(String courseName, Student student) {
        Course course = courses.get(courseName);
        if (course != null) {
            course.enrollStudent(student);
        } else {
            System.out.println("Course " + courseName + " does not exist.");
        }
    }

    public List<Student> listStudentsInCourse(String courseName) {
        Course course = courses.get(courseName);
        if (course != null) {
            return course.getEnrolledStudents();
        } else {
            System.out.println("Course " + courseName + " does not exist.");
            return new ArrayList<>();
        }
    }
}
