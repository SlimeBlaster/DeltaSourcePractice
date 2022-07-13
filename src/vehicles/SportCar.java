package vehicles;

public class SportCar extends Vehicle{
    double defaultFuelConsumption = 10;

    public SportCar(double fuel, int horseP){
        super(fuel, horseP);

        setFuelConsumption(defaultFuelConsumption);
    }
}
