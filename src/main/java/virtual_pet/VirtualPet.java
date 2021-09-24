package virtual_pet;

public abstract class VirtualPet {
    protected String name;
    protected int age;
    protected String description;
    protected int hungerLevel;
    protected int thirstLevel;

    protected int boredomLevel;
    protected boolean canAdopt;

    public VirtualPet(String name, int age, int hungerLevel, int thirstLevel) {
        this.name = name;
        this.age = age;
        this.hungerLevel = hungerLevel;
        this.thirstLevel = thirstLevel;
        this.boredomLevel = 50;
        this.canAdopt = false;
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

    //setters

    protected int setMinMaxHunger(int hungerLevel) {
        if (hungerLevel > 100) {
            hungerLevel = 100;
        } else if (hungerLevel < 0) {
            hungerLevel = 0;
        }
        return hungerLevel;
    }

    protected int setMinMaxThirst(int thirstLevel) {
        if (thirstLevel > 100) {
            thirstLevel = 100;
        } else if (thirstLevel < 0) {
            thirstLevel = 0;
        }
        return thirstLevel;
    }

    protected int setMinMaxBoredom(int boredomLevel) {
        if (boredomLevel > 100) {
            boredomLevel = 100;
        } else if (boredomLevel < 0) {
            boredomLevel = 0;
        }
        return boredomLevel;
    }
}

//    public void petStatus() {
//        if (hungerLevel <= 35) {
//            System.out.println("=^._.^=");
//        } else if (hungerLevel > 35 && hungerLevel <= 65) {
//            System.out.println(" (⋟_⋞) ");
//        } else if (hungerLevel > 65) {
//            System.out.println(" X‿X ");
//        }
//        System.out.println("Pet age is " + age);
//        System.out.println("Pet hunger is " + hungerLevel);
//        System.out.println("Pet thirst is " + thirstLevel);
//    }