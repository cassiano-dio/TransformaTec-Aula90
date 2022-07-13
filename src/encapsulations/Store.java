package encapsulations;

import java.util.ArrayList;
import java.util.List;

import abstractions.Car;

public class Store {
    public static void main(String[] args) {
        List<Car> cars = new ArrayList<Car>();

        cars.add(new Car("Celtinha", 1999));
        cars.add(new Car("Golzera", 1994));
        cars.add(new Car("Uno da Escada", 2000));

        Car unoEscada = cars.get(2);

        System.out.println(unoEscada.getModel());
        System.out.println(unoEscada.getYear());
        //unoEscada.year = 1990;
        unoEscada.setYear(1992);
        System.out.println(unoEscada.getYear());
    }
}
