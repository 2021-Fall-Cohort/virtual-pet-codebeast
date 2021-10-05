package virtual_pet;

public abstract class OrganicPet extends VirtualPet{

    protected int hungerLevel;
    protected int thirstLevel;
    protected int boredomLevel;

    protected boolean canAdopt;
    protected int cleanliness;


    public OrganicPet(String name, int age, int hungerLevel, int thirstLevel, int cleanliness) {
        super(name, age);
        this.hungerLevel = hungerLevel;
        this.thirstLevel = thirstLevel;
        this.boredomLevel = boredomLevel;
        this.canAdopt = false;
        this.cleanliness = cleanliness;

    }

    protected abstract void feed();
    protected abstract void giveWater();
    protected abstract void play();


    //getters
    public int getHungerLevel() {
        return hungerLevel;
    }

    public int getThirstLevel() {
        return thirstLevel;
    }

    public int getBoredomLevel() {
        return boredomLevel;
    }

    public boolean isCanAdopt() {
        return canAdopt;
    }

    public int getCleanliness() {
        return cleanliness;
    }

    public boolean isAlive(){
        if(hungerLevel == 100 || thirstLevel == 100 || boredomLevel == 100){
            return false;
        }
        return true;
    }

    //setters
    protected void setMinMaxHunger(int n) {
        if (hungerLevel > 100 ) {
            hungerLevel = 100;
        } else if (hungerLevel < 0) {
            hungerLevel = 0;
        }
    }

    protected void setMinMaxThirst(int n) {
        if (thirstLevel > 100 ) {
            thirstLevel = 100;
        } else if (thirstLevel < 0) {
            thirstLevel = 0;
        }
    }

    protected void setMinMaxBoredom(int n) {
        if (boredomLevel > 100) {
            boredomLevel = 100;
        } else if (boredomLevel < 0) {
            boredomLevel = 0;
        }
    }

    public void tick(){
        hungerLevel += 5;
        thirstLevel += 5;
        boredomLevel += 5;
        cleanliness +=5;

        setMinMaxHunger(hungerLevel);
        setMinMaxThirst(thirstLevel);
        setMinMaxBoredom(boredomLevel);

    }
}