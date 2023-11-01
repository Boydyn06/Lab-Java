// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        Student[] students = new Student[]{new Student("Tanasoiu","Bogdan",
                621), new Student("Tache","Andrei",622)};

        Professor prof = new Professor("Manole", "Robert");

        Course course = new Course("Java","Este o serie de lecții sau activități de învățare care se concentrează pe învățarea limbajului de programare Java , \n"
                + "Java este un limbaj de programare versatil și puternic utilizat în dezvoltarea de software pentru diverse aplicații \n" ,prof,students);

        CourseManager courseManager = new CourseManager();
        courseManager.AddCourse(course);

        courseManager.DisplayCoursesToConsole();
        courseManager.listStudentsInCourse("Java");
    }
}
