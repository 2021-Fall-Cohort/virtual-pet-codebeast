package virtual_pet;

public class Lion extends VirtualPet{

    private String maneColor;

    public Lion(String name, int age, int hungerLevel, int thirstLevel) {
        super(name,age, hungerLevel,thirstLevel);

    }

    @Override
    protected void feed() {
        hungerLevel -= 10;
        System.out.println("You feed lion a bleeding rib-eye.");

    }

    @Override
    protected void giveWater() {
        thirstLevel -= 10;
        System.out.println("You give the lion water");

    }

    @Override
    protected void play() {
        boredomLevel -= 10;
        System.out.println("Lion plays with beach-ball sized yarnball.");

    }

    public String getManeColor() {
        return maneColor;
    }
}
