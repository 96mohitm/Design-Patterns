package entities;

public class DieselCar implements Car {
    final String modelName;

    public DieselCar(final String modelName) {
        this.modelName = modelName;
    }

    @Override
    public String getModelName() {
        return this.modelName;
    }

}
