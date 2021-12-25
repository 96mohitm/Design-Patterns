package factory;

import entities.PetrolCar;
import entities.Car;
import entities.DieselCar;


public class CarFactory {

    

    private static final String DIESEL_KEY = "Diesel";
    private static final String PETROL_KEY = "Petrol";

    public CarFactory() { }

    public Car getCar(final String carType, final String modelName) {
        if(carType.equals(DIESEL_KEY)) {
            return new DieselCar(modelName);
        } else if(carType.equals(PETROL_KEY)) {
            return new PetrolCar(modelName);
        }
        throw new UnsupportedOperationException();
    }
}
