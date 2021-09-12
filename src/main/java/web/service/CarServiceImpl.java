package web.service;

import org.springframework.stereotype.Service;
import web.dao.CarDao;
import web.model.Car;

import java.util.List;

@Service
public class CarServiceImpl implements CarService {
    private final int CAR_COUNT = 5;
    private CarDao carDao;

    public CarServiceImpl(CarDao carDao) {
        this.carDao = carDao;
    }

    @Override
    public List<Car> getCars(int count) {
        return (count >= CAR_COUNT) ? carDao.getCars(carDao.size()) : carDao.getCars(count);
    }
}
