package virtual_pet;

public class Monkey extends OrganicPet {

    public Monkey(String name, int age, int hungerLevel, int thirstLevel) {
        super(name, age, hungerLevel, thirstLevel);
        this.boredomLevel = 50;
        this.canAdopt = false;
    }

    @Override
    protected void feed() {
        hungerLevel -= 20;
        System.out.println(name + " eats a banana.");
        setMinMaxHunger(hungerLevel);
    }

    @Override
    protected void giveWater() {
        thirstLevel -= 20;
        System.out.println(name + " drinks water");
        setMinMaxThirst(thirstLevel);
    }

    @Override
    protected void play() {
        boredomLevel -= 20;
        System.out.println(name + " swings from rafters");
        setMinMaxBoredom(boredomLevel);
    }
}
