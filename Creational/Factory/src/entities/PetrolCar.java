package entities;

public class PetrolCar implements Car {
    final String modelName;

    public PetrolCar(final String modelName) {
        this.modelName = modelName;
    }
    
    @Override
    public String getModelName() {
        return this.modelName;
    }
}
