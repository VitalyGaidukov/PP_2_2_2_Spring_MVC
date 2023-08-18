package web.dao;

import org.springframework.stereotype.Repository;
import web.models.Car;

import java.util.List;

public interface CarDAO {
    List<Car> getCar(int a);
}
