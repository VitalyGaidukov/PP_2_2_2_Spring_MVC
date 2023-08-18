package web.dao;

import org.springframework.stereotype.Repository;
import web.models.Car;


import java.util.List;
@Repository
public class CarDAOImpl implements CarDAO{
    private List<Car> carList;

    @Override
    public List<Car> getCar(int a) {
        if (a<1 || a>=5){
            return carList;
        }
        return carList.stream().limit(a).toList();

    }

}
