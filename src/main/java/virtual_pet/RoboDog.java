package virtual_pet;

public class RoboDog extends RoboticPet implements PowerSwitch {

    public RoboDog(String name, int age, int oilLevel, int batteryLevel) {
        super(name, age, oilLevel, batteryLevel);
        this.oilLevel = oilLevel;
        this.batteryLevel = batteryLevel;
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

    @Override
    protected void play() {
        batteryLevel -=10;
        setBatteryLimit(batteryLevel);
        System.out.println(name + " does robo tricks");
    }

    @Override
    public void powerSwitch() {
        if(batteryLevel <=0){
            System.out.println("Robotic Dog has been switched off ");
        }
    }
}