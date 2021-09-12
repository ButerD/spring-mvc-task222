package web.dao;

import org.springframework.stereotype.Repository;
import web.model.Car;

import java.util.ArrayList;
import java.util.List;

@Repository
public class CarDaoImpl implements CarDao {

    private List<Car> carList = new ArrayList<>();
    {
        carList.add(new Car("Lada", "Baklazhan", 300));
        carList.add(new Car("BMV", "Black", 800));
        carList.add(new Car("Opel", "White", 500));
        carList.add(new Car("Mercedes", "Grey", 600));
        carList.add(new Car("Reno", "Blue", 400));
    }

    @Override
    public int size() {
        return carList.size();
    }

    @Override

    public List<Car> getCars(int count) {
        return carList.subList(0, Math.max(count, 0));
    }
}
