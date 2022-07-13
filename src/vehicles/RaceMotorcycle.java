package vehicles;

public class RaceMotorcycle extends Vehicle{
    double defaultFuelConsumption = 8;

    public RaceMotorcycle(double fuel, int horseP){
        super(fuel, horseP);

        setFuelConsumption(defaultFuelConsumption);
    }
}
