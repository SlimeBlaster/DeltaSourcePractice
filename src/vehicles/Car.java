package vehicles;

public class Car extends Vehicle{
    double defaultFuelConsumption = 3;

    public Car(double fuel, int horseP){
        super(fuel, horseP);

        setFuelConsumption(defaultFuelConsumption);
    }

}
