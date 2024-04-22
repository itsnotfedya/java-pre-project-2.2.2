package web.dao;

import org.springframework.stereotype.Component;
import web.model.Car;

import java.util.ArrayList;
import java.util.List;

@Component
public class CarDaoImpl implements CarDao {
    private List<Car> cars;

    {
        cars = new ArrayList<>();
        cars.add(new Car("Nissan Skyline GT-R R33", 1996, "grey"));
        cars.add(new Car("Mazda RX-7 Veilside", 1997, "orange"));
        cars.add(new Car("McLaren P1", 2013, "yellow"));
        cars.add(new Car("Chevrolet Monte Carlo", 1971, "white"));
        cars.add(new Car("Plymouth Road Runner", 1970, "brown"));
    }

    @Override
    public List<Car> getCars(int count) {
        if (count < cars.size() && count != 0) {
            return cars.subList(0, count);
        }
        return cars;
    }
}
