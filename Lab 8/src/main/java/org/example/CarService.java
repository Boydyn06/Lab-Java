import org.springframework.stereotype.Service;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

@Service
public class CarService {
    private List<UserCars> carList = new ArrayList<>();

    public List<UserCars> getAllCars() {
        return carList;
    }

    public Car getCarByMake(String make) {
        return carList.stream()
                .filter(car -> car.getMake().equalsIgnoreCase(make))
                .findFirst()
                .orElse(null);
    }

    public void addCars(List<Car> newCars) {
        carList.addAll(newCars);
    }

    public void deleteCarByMake(String make) {
        carList.removeIf(car -> car.getMake().equalsIgnoreCase(make));
    }

    public void updateCar(String make, Car updatedCar) {
        carList.stream()
                .filter(car -> car.getMake().equalsIgnoreCase(make))
                .findFirst()
                .ifPresent(car -> {
                    car.setmodel(updatedCar.getmodel());
                    car.setYear(updatedCar.getYear());
                });
    }
}


