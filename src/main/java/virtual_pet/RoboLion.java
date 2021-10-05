package virtual_pet;

public class RoboLion extends RoboticPet implements PowerSwitch {

    public RoboLion(String name, int age, int oilLevel, int batteryLevel) {
        super(name, age, oilLevel, batteryLevel);
        this.oilLevel = oilLevel;
        this.batteryLevel = batteryLevel;
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

    @Override
    protected void play() {
        batteryLevel -=10;
        setBatteryLimit(batteryLevel);
        System.out.println(name + " does robo tricks");
    }

    @Override
    public void powerSwitch() {
        if(batteryLevel <=0){
            System.out.println("Robotic Lion has been switched off ");
        }
    }
}