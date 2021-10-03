package virtual_pet;

public abstract class RoboticPet extends VirtualPet {

    protected int oilLevel;
    protected int batteryLevel;

    public RoboticPet(String name, int age, int oilLevel, int batteryLevel) {
        super(name, age);
        this.batteryLevel = batteryLevel;
        this.oilLevel = oilLevel;
    }

    protected abstract void addOil();

    protected abstract void chargeBattery();


    public int getOilLevel() {
        return oilLevel;
    }

    public int getBatteryLevel() {
        return batteryLevel;
    }

    protected int setOilLimit(int n) {
        if (oilLevel > 100 ) {
            oilLevel = 100;
        } else if (oilLevel < 0) {
            oilLevel = 0;
        }
        return oilLevel;
    }

    protected int setBatteryLimit(int s) {
        if (batteryLevel > 100) {
            batteryLevel = 100;
        } else if (batteryLevel < 0) {
            batteryLevel = 0;
        }
        return batteryLevel;
    }


    public void tick() {
        oilLevel -= 5;
        batteryLevel -= 5;
    }
}
