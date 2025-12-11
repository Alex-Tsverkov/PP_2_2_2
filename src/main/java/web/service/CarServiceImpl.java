package web.service;

import org.springframework.stereotype.Service;
import web.models.Car;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

@Service
public class CarServiceImpl implements CarService {
    private final List<Car> cars = Arrays.asList(
            new Car("Toyota", "GT", 2025),
            new Car("Nissan", "GTR", 2022),
            new Car("Subaru", "WRX", 2023),
            new Car("BMW", "X5 M", 2024),
            new Car("Mercedes", "S-Class", 2025)
    );

    public List<Car> getCars(Integer count) {
        if (count == null || count >= cars.size()) {
            return cars;
        }
        return cars.stream().limit(count).collect(Collectors.toList());
    }
    public List<Car> getCars() {
        return this.cars;
    }

}
