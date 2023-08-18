package web.dao;

import org.springframework.stereotype.Repository;
import web.models.Car;


import java.util.ArrayList;
import java.util.List;
@Repository
public class CarDAOImpl implements CarDAO{
    private List<Car> carList;
    {
        carList = new ArrayList<>();
        carList.add(new Car("Fiat", 114, 2020));
        carList.add(new Car("Mersedes-Benz", 200, 2010));
        carList.add(new Car("LADA", 2101, 1979));
        carList.add(new Car("Volvo", 768, 2003));
        carList.add(new Car("Opel", 222, 2014));
    }

    @Override
    public List<Car> getCar(int a) {
        if (a<1 || a>=5){
            return carList;
        }
        return carList.stream().limit(a).toList();

    }

}
