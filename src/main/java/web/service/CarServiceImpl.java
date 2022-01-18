package web.service;

import org.springframework.stereotype.Component;
import web.models.Car;

import java.util.ArrayList;
import java.util.List;
@Component
public class CarServiceImpl implements CarService {
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
        List<Car>list = new ArrayList<>();
        int count = 0;
        while (count<a){
            list.add(carList.get(count)) ;
            count++;
        }
        return list;
    }
}

