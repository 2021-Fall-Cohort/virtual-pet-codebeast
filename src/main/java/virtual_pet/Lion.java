package virtual_pet;

public class Lion extends VirtualPet{

    private String maneColor;

    public Lion(String name, int age, int hungerLevel, int thirstLevel) {
        super(name,age, hungerLevel,thirstLevel);

    }

    public String getManeColor() {
        return maneColor;
    }
}
