package homeTaskTen;

import java.util.HashMap;
import java.util.Map;

public class Garage {

    Map<Car, Integer> cars = new HashMap<>();

    public void parkCar(Car car) {
        if (cars.containsKey(car)) {
            cars.put(car, 1 + cars.get(car));
        } else {
            cars.put(car, 0);
            cars.put(car, 1 + cars.get(car));
        }
        System.out.println("Car " + car.toString() + " was parked.");
    }

    public void withdrawCar(Car car) {
        if (cars.containsKey(car) && cars.get(car) > 0) {
            cars.put(car, cars.get(car) - 1);
            System.out.println("Car " + car.toString() + " was withdrawn.");
        } else
            System.out.println("No available cars");
    }

    public void showAmountOfCarsThisType(Car car) {
        if (cars.containsKey(car)) {
            System.out.println(cars.get(car) + " cars of this type are available");
        } else {
            System.out.println("No available cars");
        }
    }

    @Override
    public String toString() {
        return "Garage{" +
                "cars=" + cars +
                '}';
    }
}