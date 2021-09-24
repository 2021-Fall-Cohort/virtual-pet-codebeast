package virtual_pet;

public class Lion extends VirtualPet{

    private String maneColor;

    public Lion(String name, int age, int hungerLevel, int thirstLevel) {
        super(name,age, hungerLevel,thirstLevel);
        this.boredomLevel = 50;
        this.canAdopt = false;

    }
    @Override
    protected void feed() {
        hungerLevel -= 10;
        System.out.println("You feed a lion a bleeding rib-eye.");
        setMinMaxHunger(hungerLevel);

    }
    @Override
    protected void giveWater() {
        thirstLevel -= 10;
        System.out.println("You give the lion water");
        setMinMaxThirst(thirstLevel);

    }
    @Override
    protected void play() {
        boredomLevel -= 10;
        System.out.println("Lion plays with beach-ball sized yarnball.");
        setMinMaxBoredom(boredomLevel);

    }
    public String getManeColor() {
        return maneColor;
    }
}
