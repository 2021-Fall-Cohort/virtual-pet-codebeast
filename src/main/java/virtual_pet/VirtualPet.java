package virtual_pet;

public abstract class VirtualPet {
    protected String name;
    protected int age;

    protected int hungerLevel;
    protected int thirstLevel;

    protected int boredomLevel;
    protected boolean canAdopt;


    public VirtualPet(String name, int age, int hungerLevel, int thirstLevel) {
        this.name = name;
        this.age = age;
        this.hungerLevel = hungerLevel;
        this.thirstLevel = thirstLevel;
        this.boredomLevel = boredomLevel;
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

    public int getBoredomLevel() {
        return boredomLevel;
    }

    public boolean isCanAdopt() {
        return canAdopt;
    }
    public boolean isAlive(){
        if(hungerLevel == 100 || thirstLevel == 100 || boredomLevel == 100){
            return false;
        }
        return true;
    }

    //setters

//    protected int setMinMaxHunger(int hungerLevel) {
//        if (hungerLevel > 100) {
//            hungerLevel = 100;
//        } else if (hungerLevel < 0) {
//            hungerLevel = 0;
//        }
//        return hungerLevel;
//    }

    public int setMinMaxHunger(int n) {
        if (hungerLevel > 100 ) {
            hungerLevel = 100;
        } else if (hungerLevel < 0) {
            hungerLevel = 0;
        }
        return hungerLevel;
    }

    public int setMinMaxThirst(int n) {
        if (thirstLevel > 100 ) {
            thirstLevel = 100;
        } else if (thirstLevel < 0) {
            thirstLevel = 0;
        }
        return thirstLevel;
    }

    public int setMinMaxBoredom(int n) {
        if (boredomLevel > 100) {
            boredomLevel = 100;
        } else if (boredomLevel < 0) {
            boredomLevel = 0;
        }
        return boredomLevel;
    }

    public void tick(){
        hungerLevel +=10;
        thirstLevel +=10;
        boredomLevel+=10;

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
