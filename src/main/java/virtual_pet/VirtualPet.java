package virtual_pet;

public class VirtualPet {
    private String name;
    private String maneColor;

    private int age = 10;
    private int hungerLevel = 10;
    private int thirstLevel = 20;
    private int boredom;
    private int timeTick = 0;


    //This is our constructor
    public VirtualPet(String name, String maneColor) {
        this.name = name;
        this.maneColor = maneColor;
    }

    // General Methods for Pet
    public void greeting() {
        System.out.println("Hey my name is " + name
                + " I am a lion who's age is " + age
                + " my mane color is " + maneColor);
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
        System.out.println("Pet boredom level is " + boredom +"\n");
    }

    public void feed() {
        hungerLevel -= 10;
        boredom += 10;
        timeTick++;
        System.out.println("Lion devours a bleeding rib-eye.");
    }

    public void giveWater() {
        thirstLevel -= 10;
        hungerLevel -= 5;
        boredom += 10;
        timeTick++;
        System.out.println("Lion is");
    }

    public void play() {
        hungerLevel += 5;
        boredom -= 10;
        thirstLevel += 5;
        timeTick++;
        System.out.println("Pet lion performs tricks!");
    }

    //for every 2 actions (feed, performTricks) time will increment
    public void timePass() {
        timeTick = 0;
        age += 10;
        hungerLevel += 10;
        thirstLevel += 10;

        if (age > 80) {
            maneColor = "gray";
        }

        checkHungerMinMax(hungerLevel);
        checkThirstMinMax(thirstLevel);
        checkBoredomMinMax(boredom);
    }

    //Setters
    public void setName(String name) {
        this.name = name;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setManeColor(String maneColor) {
        this.maneColor = maneColor;
    }

    private int checkHungerMinMax(int x) {
        hungerLevel = x;

        if (hungerLevel > 100) {
            hungerLevel = 100;
        } else if (hungerLevel < 0) {
            hungerLevel = 0;
        }
        return hungerLevel;
    }

    private int checkThirstMinMax(int x) {
        thirstLevel = x;

        if (thirstLevel > 100) {
            thirstLevel = 100;
        } else if (thirstLevel < 0) {
            thirstLevel = 0;
        }
        return thirstLevel;
    }

    private int checkBoredomMinMax(int x) {
        boredom = x;

        if (boredom > 100) {
            boredom = 100;
        } else if (boredom < 0) {
            boredom = 0;
        }
        return boredom;
    }


    //Getters
    public int getAge() {
        return age;
    }

    public int getHungerLevel() {
        return hungerLevel;
    }

    public int getTime() {
        return timeTick;
    }

    public int getThirstLevel() {
        return thirstLevel;
    }

    public int getBoredom() {
        return boredom;
    }

}