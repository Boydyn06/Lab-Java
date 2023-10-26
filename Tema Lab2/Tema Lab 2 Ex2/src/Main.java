public class Main {
    public static void main(String[] args) {
        ManagerCursuri courseManager = new ManagerCursuri();

        // Crearea unui nou curs
        Course mathCourse = new Course("Java");
        courseManager.addCourse("Java", mathCourse);

        //Crearea unui nou student
        Student student = new Student("Tanasoiu Bogdan");

        // Înscrierea studentului la curs
        courseManager.enrollStudent("Java", student);
    }
}






