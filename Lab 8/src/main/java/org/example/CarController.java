import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import java.util.List;

@RestController
@RequestMapping("/cars")
public class CarController {
    private final CarService carService;

    @Autowired
    public CarController(CarService carService) {
        this.carService = carService;
    }

    @GetMapping
    public List<Car> getAllCars() {
        return carService.getAllCars();
    }

    @GetMapping("/{make}")
    public Car getCarByMake(@PathVariable String make) {
        return carService.getCarByMake(make);
    }

    @PostMapping("/add")
    public void addCars(@RequestBody List<Car> newCars) {
        carService.addCars(newCars);
    }

    @DeleteMapping("/{make}")
    public void deleteCarByMake(@PathVariable String make) {
        carService.deleteCarByMake(make);
    }

    @PutMapping("/{make}")
    public void updateCar(@PathVariable String make, @RequestBody Car updatedCar) {
        carService.updateCar(make, updatedCar);
    }
}
