//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        // Exercise 2: Using "this" in Constructors
        Person person = new Person("John", 25);
        System.out.println("Person Info:");
        person.displayInfo();

        // Exercise 4: Using "super" Keyword in Constructors
        Car car = new Car("Toyota", "Camry", 2022, true);
        System.out.println("\nCar Info:");
        System.out.println("Make: " + car.make + ", Model: " + car.model + ", Year: " + car.year + ", Convertible: " + car.isConvertible);

        // Exercise 5: Method Overloading in Inherited Classes
        person.displayInfo();
        car.startEngine();
        car.startEngine("Keyless");

        // Exercise 6: Inheritance and "this" Keyword
        Student student = new Student("Alice", 20, 12345);
        System.out.println("\nStudent Info:");
        student.displayInfo();

        // Exercise 7: Multiple Levels of Inheritance
        Dog dog = new Dog("Labrador", 3);
        System.out.println("\nDog Info:");
        System.out.println("Breed: " + dog.breed + ", Age: " + dog.age);
        dog.sleep();
        dog.bark();
    }
}