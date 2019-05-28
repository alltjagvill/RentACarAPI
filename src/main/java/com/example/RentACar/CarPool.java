package com.example.RentACar;

import java.util.ArrayList;
import java.util.List;

public class CarPool {
    private List<Car> carPool;

    public CarPool() {

        this.carPool = new ArrayList<>();
        addMockData();
    }

    public List<Car> getCarPool(String searchCarString) {

        if(searchCarString.equals("")) {
            return carPool;
        }
        ArrayList<Car> cars = new ArrayList<>();
        for (Car car : carPool) {


            if(car.getModel().toLowerCase().contains(searchCarString.toLowerCase())) {
                cars.add(car);
            }



        }
        return cars;
    }

    public void addCar(Car car) {
        carPool.add(car);
    }

    public Car getCar(String registerNumber) {
        return findCarByRegisterNumber(registerNumber);
    }


    private Car findCarByRegisterNumber(String registerNumber) {
        for(Car car : carPool) {
            if (car.getRegisterNumber().equals(registerNumber)) {
                return car;
            }


        }
        return null;
    }
    private void addMockData() {
        Manufacturer manufacturer1 = new Manufacturer("Volvo", "1927", "Geely Holding Group");
        Manufacturer manufacturer2 = new Manufacturer("Ferrari", "1947", "Exor");
        Manufacturer manufacturer3 = new Manufacturer("Subaru", "1953", "Subaru Corporation");

        Car car1 = new Car("S60", "ABC123", "Avaible", "600", "2019", manufacturer1);
        Car car2 = new Car("488 GTB", "DEF456", "Avaible", "2000", "2019",manufacturer2);
        Car car3 = new Car("Impreza", "GHI789", "Avaible", "1500", "2019", manufacturer3);
        carPool.add(car1);
        carPool.add(car2);
        carPool.add(car3);
    }
}
