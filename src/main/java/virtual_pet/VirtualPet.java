package virtual_pet;

public class VirtualPet {
    private String name;
    private String maneColor;

    private int age = 10;
    private int hungerLevel = 50;
    private int thirstLevel = 50;




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

        System.out.println("Pet lion performs tricks!");
    }

    //for every 2 actions (feed, performTricks) time will increment
    public void timePass() {
        age += 10;
        hungerLevel += 10;
        thirstLevel += 10;

        if (age > 80) {
            maneColor = "gray";
        }



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

//    private int checkHungerMinMax(int x) {
//        hungerLevel = x;
//
//        if (hungerLevel > 100) {
//            hungerLevel = 100;
//        } else if (hungerLevel < 0) {
//            hungerLevel = 0;
//        }
//        return hungerLevel;
//    }
//
//    private int checkThirstMinMax(int x) {
//        thirstLevel = x;
//
//        if (thirstLevel > 100) {
//            thirstLevel = 100;
//        } else if (thirstLevel < 0) {
//            thirstLevel = 0;
//        }
//        return thirstLevel;
//    }




    //Getters
    public int getAge() {
        return age;
    }

    public int getHungerLevel() {
        return hungerLevel;
    }



    public int getThirstLevel() {
        return thirstLevel;
    }



}