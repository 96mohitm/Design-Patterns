import entities.Car;
import factory.CarFactory;

public class App {
    public static void main(String[] args) throws Exception {
        System.out.println("Welcome to Car Factory!");
        CarFactory carFactory = new CarFactory();
        Car audiPetrolCar = carFactory.getCar("Petrol", "Audi");
        System.out.println("Car 1: " + audiPetrolCar.getModelName());
        Car mercedesDieselCar = carFactory.getCar("Diesel", "Mercedes");
        System.out.println("Car 2: " + mercedesDieselCar.getModelName());

    }
}
