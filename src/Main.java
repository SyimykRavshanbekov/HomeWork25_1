import com.sun.source.tree.Tree;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        Car car1 = new Car(1, 123);
        Car car2 = new Car(2, 1234);
        Car car3 = new Car(3, 12345);

        Information information1 = new Information(2020,
                "Camry", 30000, "Black");

        Information information2 = new Information(2013,
                "Tesla model S", 60000, "White");

        Information information3 = new Information(2017,
                "BMW M5", 30000, "Gray");

        HashMap<Car, Information> cars = new HashMap<>();
        cars.put(car1, information1);
        cars.put(car2, information2);
        cars.put(car3, information3);

        for (Map.Entry entry: cars.entrySet()){
            System.out.println(entry.getKey() + "" + entry.getValue());
            System.out.println("-------------------");
        }
    }
}