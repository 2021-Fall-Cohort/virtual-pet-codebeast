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

    //getters
    public int getOilLevel() {
        return oilLevel;
    }

    public int getBatteryLevel() {
        return batteryLevel;
    }

    //setters
    protected void setOilLimit(int x) {
        if (oilLevel > 100 ) {
            oilLevel = 100;
        }
        else if (oilLevel < 0) {
            oilLevel = 0;
        }
    }

    protected void setBatteryLimit(int x) {
        if (batteryLevel > 100) {
            batteryLevel = 100;
        }
        else if (batteryLevel < 0) {
            batteryLevel = 0;
        }
    }

    public void tick() {
        oilLevel -= 5;
        batteryLevel -= 5;
        setOilLimit(oilLevel);
        setBatteryLimit(batteryLevel);
    }
}
