class Student extends Person {
    int studentId;

    Student(String name, int age, int studentId) {
        super(name, age);
        this.studentId = studentId;
    }

    void displayInfo() {
        super.displayInfo();
        System.out.println("Student ID: " + this.studentId);
    }
}