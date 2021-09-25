package virtual_pet;

public class Dog extends VirtualPet{

    public Dog(String name, int age, int hungerLevel, int thirstLevel) {
        super(name, age, hungerLevel, thirstLevel);
        this.boredomLevel = 50;
        this.canAdopt = false;
    }

    @Override
    protected void feed() {
        hungerLevel -= 20;
        System.out.println(" ");
        setMinMaxHunger(hungerLevel);
        System.out.println("I love Dog Treats!");
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
