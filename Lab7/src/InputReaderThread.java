import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

class InputReaderThread extends Thread {
    private List<UsedCar> cars;
    private String filePath;

    public InputReaderThread(String filePath) {
        this.filePath = filePath;
        this.cars = new ArrayList<>();
    }

    @Override
    public void run() {
        cars = readCarsFromCSV(filePath);
    }

    public List<UsedCar> getCars() {
        return cars;
    }

    private List<UsedCar> readCarsFromCSV(String filePath) {
        List<UsedCar> cars = new ArrayList<>();

        try (BufferedReader reader = new BufferedReader(new FileReader(filePath))) {
            String line;
            while ((line = reader.readLine()) != null) {
                String[] data = line.split(",");
                String make = data[0].trim();
                String model = data[1].trim();
                int year = Integer.parseInt(data[2].trim());
                double price = Double.parseDouble(data[3].trim());

                UsedCar car = new UsedCar(make, model, year, price);
                cars.add(car);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }

        return cars;
    }
}