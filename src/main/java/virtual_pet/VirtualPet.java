package virtual_pet;

public abstract class VirtualPet {
    private String name;
    private int age;
    private String description;
    private int hungerLevel;
    private int thirstLevel;

    //This is our constructor
    public VirtualPet(String name, int age, int hungerLevel, int thirstLevel) {
        this.name = name;
        this.age = age;
        this.hungerLevel = hungerLevel;
        this.thirstLevel = thirstLevel;
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

    public void feed() {
        hungerLevel -= 10;
        System.out.println("Lion devours a bleeding rib-eye.");
    }

    public void giveWater() {
        thirstLevel -= 10;
        hungerLevel -= 5;
    }

    public void play() {
        hungerLevel += 5;
        thirstLevel += 5;
        System.out.println("Pet performs tricks!");
    }

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
