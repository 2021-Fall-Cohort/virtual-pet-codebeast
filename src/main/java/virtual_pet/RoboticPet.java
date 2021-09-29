package virtual_pet;

public abstract class RoboticPet extends VirtualPet{

    protected int oilLevel;
    protected int batteryLevel;

    public RoboticPet(String name, int age, int oilLevel, int batteryLevel) {
        super(name, age);
        this.batteryLevel = batteryLevel;
        this.oilLevel = oilLevel;

    }

    public void tick(){
        oilLevel -=10;
        batteryLevel -=10;
    }
}
