package virtual_pet;

public class RoboDog extends RoboticPet implements Walking {

    public RoboDog(String name, int age, int oilLevel, int batteryLevel) {
        super(name, age, oilLevel, batteryLevel);


    }

    @Override
    public void goesForAWalk() {
        System.out.println(name + " goes for a walk.");
    }


    @Override
    protected void addOil() {
        oilLevel += 20;
        setOilLimit(oilLevel);

    }

    @Override
    protected void chargeBattery() {
        batteryLevel += 20;
        setBatteryLimit(batteryLevel);
    }
}