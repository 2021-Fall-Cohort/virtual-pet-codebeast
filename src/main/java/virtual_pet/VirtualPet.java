package virtual_pet;

public abstract class VirtualPet {
    protected String name;
    protected int age;
    protected String description;
    protected int hungerLevel;
    protected int thirstLevel;
    protected int boredomLevel;

    //This is our constructor
    public VirtualPet(String name, int age, int hungerLevel, int thirstLevel) {
        this.name = name;
        this.age = age;
        this.hungerLevel = hungerLevel;
        this.thirstLevel = thirstLevel;
        this.boredomLevel = 50;
    }

    public void petStatus() {
        if (hungerLevel <= 35) {
            System.out.println("=^._.^=");
        } else if (hungerLevel > 35 && hungerLevel <= 65) {
            System.out.println(" (⋟_⋞) ");
        } else if (hungerLevel > 65) {
            System.out.println(" X‿X ");
        }
        System.out.println("Pet age is " + age);
        System.out.println("Pet hunger is " + hungerLevel);
        System.out.println("Pet thirst is " + thirstLevel);
    }

    protected abstract void feed();

    protected abstract void giveWater();

    protected abstract void play();

    //getters
    public int getAge() {
        return age;
    }
    public int getHungerLevel() {
        return hungerLevel;
    }
    public int getThirstLevel() {
        return thirstLevel;
    }
    public String getName() {
        return name;
    }
}
