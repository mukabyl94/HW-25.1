import java.util.HashMap;
import java.util.Map;

public class Main {
    public static void main(String[] args) {
        Car car = new Car(1, 458);
        Car car2 = new Car(2, 265);
        Car car3 = new Car(3, 985);
        Car car4 = new Car(4, 3218);
        Car car5 = new Car(5, 7452);
        Car car6 = new Car(6, 3254);

        CarInfo carInfo = new CarInfo(1990, "Honda Accord", "12 500 $", "grey");
        CarInfo carInfo2 = new CarInfo(2014, "Ferrari California", "195 000 $", "dark blue");
        CarInfo carInfo3 = new CarInfo(2003, "Subaru Legacy", "9 000 $", "white");
        CarInfo carInfo4 = new CarInfo(2016, "Toyota Highlander", "95 000 $", "green");
        CarInfo carInfo5 = new CarInfo(1970, "Cadillac Deville", "120 000 $", "red");
        CarInfo carInfo6 = new CarInfo(1994, "Ford Mustang", "8 000 $", "blue");

        Map<Car, CarInfo> cars = new HashMap<>();
        cars.put(car, carInfo);
        cars.put(car2, carInfo2);
        cars.put(car3, carInfo3);
        cars.put(car4, carInfo4);
        cars.put(car5, carInfo5);
        cars.put(car6, carInfo6);
        for (Map.Entry<Car, CarInfo> getCars: cars.entrySet()){
            System.out.println(getCars);
        }

    }
}