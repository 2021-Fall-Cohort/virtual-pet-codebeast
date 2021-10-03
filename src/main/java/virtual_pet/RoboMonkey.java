package virtual_pet;

public class RoboMonkey extends RoboticPet implements SharpenClaws {

    public RoboMonkey(String name, int age, int oilLevel, int batteryLevel) {
        super(name, age, oilLevel, batteryLevel);
        this.oilLevel = oilLevel;
        this.batteryLevel = batteryLevel;
    }
    @Override
    public void sharpenClaws() {
        System.out.println(name + " sharpens robo claws on floor.");
    }

    @Override
    protected void addOil(){
        oilLevel +=20;
        setOilLimit(oilLevel);

    }

    @Override
    protected void chargeBattery(){
        batteryLevel +=20;
        setBatteryLimit(batteryLevel);
    }
}

