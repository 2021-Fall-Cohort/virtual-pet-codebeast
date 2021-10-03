package virtual_pet;

public class RoboLion extends RoboticPet implements SharpenClaws{


    public RoboLion(String name, int age, int oilLevel, int batteryLevel) {
        super(name, age, oilLevel, batteryLevel);
    }


    @Override
    public void sharpenClaws() {
        System.out.println(name + " sharpens robo claws on floor.");
    }

    @Override
    protected void addOil(){
        oilLevel +=20;
        System.out.println(name + " ");
        setOilLimit(oilLevel);
    }

    @Override
    protected void chargeBattery(){
        batteryLevel +=20;
        System.out.println(name + " ");
        setBatteryLimit(batteryLevel);
    }

}