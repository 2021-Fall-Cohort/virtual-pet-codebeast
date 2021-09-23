package virtual_pet;

import java.util.ArrayList;

public class VirtualPetShelter {

    private int petsAdopted = 0;
    private int deathToll = 0;

    ArrayList<VirtualPet> petShelter;

    String heading1 = "Name";
    String heading2 = "|Hunger";
    String heading3 = "|Thirst";
    String divider = "---------|-------|-------|-------";

    public VirtualPetShelter() {
        petShelter = new ArrayList<VirtualPet>();
        petShelter.add(new Lion("Simba", 5, 5, 25));
        petShelter.add(new Lion("Mufassa", 3, 13, 50));
        petShelter.add(new Dog("Spot", 4, 55, 60));
    }

    //getters
    public void displayAllPetsDescriptions() {
        for (int i = 0; i < petShelter.size(); i++) {
            System.out.println("[" + petShelter.get(i).getName() + "]" + " " + petShelter.get(i));
            System.out.println("");
        }
    }

    public void displayHealthStatus() {
        System.out.printf("%-8s %-7s %-7s  %n", heading1, heading2, heading3);
        System.out.println(divider);
        for (int i = 0; i < petShelter.size(); i++) {
            System.out.printf("%-10s %-7s %-7s  %n", petShelter.get(i).getName(),
                    petShelter.get(i).getHungerLevel(), petShelter.get(i).getThirstLevel());
        }
    }

        public void addPetToShelter(VirtualPet pet) {
            petShelter.add(pet);
        }
}