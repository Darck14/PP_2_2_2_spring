package web.service;


import org.springframework.stereotype.Component;
import web.model.Car;

import java.util.ArrayList;
import java.util.List;

@Component
public class CarServiceImp implements CarService {

    private List<Car> cars;

    {
        cars = new ArrayList<Car>();
        cars.add(new Car("Lada", "12", 1999));
        cars.add(new Car("BMW", "5", 2000));
        cars.add(new Car("Audi", "7", 2001));
        cars.add(new Car("Mercedes", "3", 2005));
        cars.add(new Car("Ford", "1", 1999));
    }

    @Override
    public List<Car> show(Integer num) {

        List<Car> result = new ArrayList<>();

        if (num >= 5 | num == 0) {
            return cars;
        }
        else {
            for (int i = 0; i < num; i++) {
                result.add(cars.get(i));
            }
        }

        return result;
    }
}