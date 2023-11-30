package dto.Vehicles;

public class Scooter extends Vehicle{
    public Scooter(EngineType engineType, int cylinders, int wheels) {
        super(engineType, cylinders, wheels);
    }

    @Override
    public String toString() {
        return "EngineType: "+getEngineType()+ "- Cylinders: "+getCylinders()+ "- Wheels: "+getWheels();
    }

    /*@Override
    public boolean ComparisonExamples(Object obj) {
        if(obj instanceof Motorcycle){
            Motorcycle motorcycle = (Motorcycle) obj;
            return this.getEngineType().ComparisonExamples(motorcycle.getEngineType()) &&
                    this.getCylinders() == motorcycle.getCylinders() &&
                    this.getWheels() == motorcycle.getWheels();
        }
        return super.ComparisonExamples(obj);
    }*/


    @Override
    public void start() {
        super.setTurnedOn(true);
    }

    @Override
    public void stop() {
        super.setTurnedOn(false);
    }

}
