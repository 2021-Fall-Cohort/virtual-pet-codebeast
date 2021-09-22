package virtual_pet;

import java.util.ArrayList;

public class VirtualPetShelter {


    ArrayList<Lion> petShelter;

    public VirtualPetShelter() {

        petShelter = new ArrayList<Lion>();
        petShelter.add(new Lion("Mufasa", "Orange"));
        petShelter.add(new Lion("Simba", "Yellow"));


    }

    //getters
    public Lion getPet(int n) {
        return petShelter.get(n);
    }

    public void removeLionById(int n){
        petShelter.remove(n);
    }

    public ArrayList<Lion> getPets(){
        return petShelter;
    }

    //setters
}
