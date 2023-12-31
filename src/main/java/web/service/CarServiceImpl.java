package web.service;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import web.dao.CarDAO;
import web.models.Car;


import java.util.ArrayList;
import java.util.List;

@Service
public class CarServiceImpl implements CarService {

    private CarDAO carDAO;

    public CarServiceImpl(CarDAO carDAO) {
        this.carDAO = carDAO;
    }

    @Override
    public List<Car> getCar(int a) {

        return carDAO.getCar(a);
    }

}

