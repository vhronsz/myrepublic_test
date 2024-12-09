import Model.Car;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        // TODO: Add implementation code here
        ArrayList<Car> cars = new ArrayList<>();

        Car carA = new Car("Toyota", "Merah", 300, "Juta", 120, "km/jam");
        Car carB = new Car("Honda", "Biru", 350, "Juta", 130, "km/jam");
        Car carC = new Car("Suzuki", "Gray", 250, "Juta", 110, "km/jam");

        cars.add(carA);
        cars.add(carB);
        cars.add(carC);
        for (Car car : cars) {
            System.out.println(car.getBrand() + " " + car.getColor() + " " + car.getPrice() + " " + car.getPriceUnit() + " " + car.getSpeed() + " " + car.getSpeedUnit());
        }
    }
}
