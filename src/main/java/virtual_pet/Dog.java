package virtual_pet;

public class Dog extends VirtualPet{

    private boolean isTrainable;

    public Dog(String name, int age, int hungerLevel, int thirstLevel) {
        super(name, age, hungerLevel, thirstLevel);
    }

    @Override
    protected void feed() {
        hungerLevel -= 10;
        System.out.println(" ");
    }

    @Override
    protected void giveWater() {
        thirstLevel -= 10;
        System.out.println(" ");
    }

    @Override
    protected void play() {
        boredomLevel -= 10;
        System.out.println(" ");
    }
}
