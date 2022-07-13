package vehicles;

public class Vehicle {
    final static double DEFAULT_FUEL_CONSUMPTION = 1.25;
    private double fuelConsumption;
    private double fuel;
    private int horsePower;

    public void drive(double kilometers){
        System.out.println(kilometers + "km left");
        System.out.println(fuel + " fuel left");
        System.out.println(""); // empty line
    }

    public Vehicle(double fuel, int horsePow){
        setFuel(fuel);
        setHorsePower(horsePow);
        setFuelConsumption(DEFAULT_FUEL_CONSUMPTION);
    }

    public void setFuelConsumption(double fuelCons){
        this.fuelConsumption = fuelCons;
    }

    public void setFuel(double fuel){
        this.fuel = fuel;
    }

    public void setHorsePower(int horseP){
        this.horsePower = horseP;
    }

    public double getFuelConsumption(){
        return fuelConsumption  ;
    }

    public double getFuel(){
        return fuel;
    }

    public int getHorsePower(){
        return horsePower;
    }

    public static double getDefFuelCons(){
        return DEFAULT_FUEL_CONSUMPTION;
    }

    @Override
    public String toString() {
        return "Vehicle{" +
                "fuelConsumption=" + fuelConsumption +
                ", fuel=" + fuel +
                ", horsePower=" + horsePower +
                '}';
    }
}
