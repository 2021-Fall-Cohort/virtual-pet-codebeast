package virtual_pet;

public class Lion extends VirtualPet{

    private String maneColor;

    public Lion(String name, String maneColor) {
        super(name);
        this.maneColor = maneColor;
    }

    public String getManeColor() {
        return maneColor;
    }
}
