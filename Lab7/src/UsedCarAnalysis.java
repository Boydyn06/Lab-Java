import java.util.Collections;
import java.util.List;

public class UsedCarAnalysis {
    public static void main(String[] args) {
        // Runnable version
        InputReaderRunnable inputReaderRunnable = new InputReaderRunnable("path/to/used_cars.csv");
        Thread runnableThread = new Thread(inputReaderRunnable);
        runnableThread.start();

        // Thread version
        InputReaderThread inputReaderThread = new InputReaderThread("path/to/used_cars.csv");
        inputReaderThread.start();

        try {
            // Wait for both threads to finish
            runnableThread.join();
            inputReaderThread.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        List<UsedCar> carsRunnable = inputReaderRunnable.getCars();
        List<UsedCar> carsThread = inputReaderThread.getCars();

        System.out.println("Original list of cars (Runnable):");
        displayCars(carsRunnable);

        System.out.println("\nOriginal list of cars (Thread):");
        displayCars(carsThread);

        // Sorting by price using Comparable
        Collections.sort(carsRunnable);
        Collections.sort(carsThread);

        System.out.println("\nSorted list of cars by price (Runnable):");
        displayCars(carsRunnable);

        System.out.println("\nSorted list of cars by price (Thread):");
        displayCars(carsThread);
    }

    private static void displayCars(List<UsedCar> cars) {
        for (UsedCar car : cars) {
            System.out.println(car);
        }
    }
}