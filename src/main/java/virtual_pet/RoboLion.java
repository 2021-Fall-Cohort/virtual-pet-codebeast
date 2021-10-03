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
    public void oilLevel(){
        oilLevel +=20;

    }

    @Override
    public void batteryLevel(){
        batteryLevel +=20;
    }
}