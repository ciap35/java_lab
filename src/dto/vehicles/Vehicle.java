package dto.vehicles;

public abstract class Vehicle implements Engine,Cloneable{
    private EngineType engineType;


    public Vehicle(EngineType engineType, int cylinders, int wheels) {
        this.engineType = engineType;
        this.cylinders = cylinders;
        this.wheels = wheels;
    }

    private int cylinders;

    public EngineType getEngineType() {
        return engineType;
    }

    public void setEngineType(EngineType engineType) {
        this.engineType = engineType;
    }

    public int getCylinders() {
        return cylinders;
    }

    public void setCylinders(int cylinders) {
        this.cylinders = cylinders;
    }

    public int getWheels() {
        return wheels;
    }

    public void setWheels(int wheels) {
        this.wheels = wheels;
    }

    private int wheels;

    public boolean isTurnedOn() {
        return turnedOn;
    }

    public void setTurnedOn(boolean turnedOn) {
        this.turnedOn = turnedOn;
    }

    private boolean turnedOn;


}
