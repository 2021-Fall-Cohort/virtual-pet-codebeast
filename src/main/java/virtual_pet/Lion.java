package virtual_pet;

public class Lion extends OrganicPet implements Walking {

    public Lion(String name, int age, int hungerLevel, int thirstLevel, int cleanliness) {
        super(name, age, hungerLevel, thirstLevel, cleanliness);
        this.boredomLevel = 50;
        this.canAdopt = false;
    }

    @Override
    protected void feed() {
        hungerLevel -= 20;
        System.out.println("You feed a lion a bleeding rib-eye.");
        setMinMaxHunger(hungerLevel);
    }

    @Override
    protected void giveWater() {
        thirstLevel -= 20;
        System.out.println("You give the lion water");
        setMinMaxThirst(thirstLevel);
    }

    @Override
    protected void play() {
        boredomLevel -= 20;
        System.out.println("Lion plays with beach-ball sized yarnball.");
        setMinMaxBoredom(boredomLevel);
    }

    @Override
    public void goesForAWalk() {
        System.out.println(name + " goes for walk");
        boredomLevel -=5;
        cleanliness -=5;
    }
}