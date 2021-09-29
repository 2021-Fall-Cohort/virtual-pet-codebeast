package virtual_pet;

public class Dog extends OrganicPet implements Walking{

    public Dog(String name, int age, int hungerLevel, int thirstLevel) {
        super(name, age, hungerLevel, thirstLevel);
        this.boredomLevel = 50;
        this.canAdopt = false;
    }

    @Override
    protected void feed() {
        hungerLevel -= 20;
        System.out.println(name + " loves dog Treats!");
        setMinMaxHunger(hungerLevel);
    }

    @Override
    protected void giveWater() {
        thirstLevel -= 20;
        System.out.println(name + " drinks water ");
        setMinMaxThirst(thirstLevel);
    }

    @Override
    protected void play() {
        boredomLevel -= 20;
        System.out.println(name + " plays fetch.");
      setMinMaxBoredom(boredomLevel);
    }

    @Override
    public void goesForAWalk(){
        System.out.println(name + " goes for a walk.");
    }
}
