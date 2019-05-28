package com.example.RentACar;

import com.sun.org.apache.bcel.internal.generic.GETFIELD;
import org.apache.tomcat.util.http.fileupload.util.LimitedInputStream;
import org.springframework.web.bind.annotation.*;

import java.util.List;

import static org.springframework.web.bind.annotation.RequestMethod.GET;
import static org.springframework.web.bind.annotation.RequestMethod.POST;

@RestController
public class CarPoolController {

    private CarPool carPool = new CarPool();

    @RequestMapping(value = "/carpool", method = GET)
    public List<Car> getCarPool(@RequestParam(value="searchCarString", defaultValue = "") String searchCarString) {
        return carPool.getCarPool(searchCarString);
    }

    @RequestMapping(value = "/carpool", method = POST)
    public Car postCar(@RequestBody Car car) {
        carPool.addCar(car);

        return car;
    }

    @RequestMapping(value = "/carpool/{registerNumber}", method = GET)
    public Car getCarByRegisterNumber(@PathVariable("registerNumber") String carRegisterNumber) {
        Car car = carPool.getCar(carRegisterNumber);
        return car;
    }



}
