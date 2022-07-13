package modifiers;

import abstractions.Car;

public class StoredCar extends Car{

    public StoredCar(String model, Integer year) {
        super(model, year);
        
    }

    public static void main(String[] args) {
        
        StoredCar sCar = new StoredCar("Marea Bomba", 2000);

        System.out.println(sCar.year);

    }
    
}
