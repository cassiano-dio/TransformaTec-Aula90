package abstractions;

import java.util.ArrayList;
import java.util.List;

public class Garage {
    
    public static void main(String[] args) {
        
        List<Car> cars = new ArrayList<Car>();

        cars.add(new Car("Celtinha", 1999));
        cars.add(new Car("Golzera", 1994));
        cars.add(new Car("Uno da Escada", 2000));

        Car unoEscada = cars.get(2);

        System.out.println(unoEscada.getModel());
        System.out.println(unoEscada.getYear());
        //testando a restrição de acesso de um atributo privado
        //unoEscada.model;
        System.out.println(unoEscada.year);


    }

}
