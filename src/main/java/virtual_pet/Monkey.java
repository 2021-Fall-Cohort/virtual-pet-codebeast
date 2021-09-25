package virtual_pet;

public class Monkey extends VirtualPet{

    public Monkey(String name, int age, int hungerLevel, int thirstLevel) {
        super(name, age, hungerLevel, thirstLevel);
        this.boredomLevel = 50;
        this.canAdopt = false;
    }

    @Override
    protected void feed() {
        hungerLevel -= 20;
        System.out.println(" ");
        setMinMaxHunger(hungerLevel);
    }

    @Override
    protected void giveWater() {
        thirstLevel -= 20;
        System.out.println(" ");
        setMinMaxThirst(thirstLevel);
    }

    @Override
    protected void play() {
        boredomLevel -= 20;
        System.out.println(" ");
        setMinMaxBoredom(boredomLevel);
    }
}
