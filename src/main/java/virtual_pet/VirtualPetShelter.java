package virtual_pet;

import java.util.ArrayList;
import java.util.Scanner;

public class VirtualPetShelter {

    private ArrayList<VirtualPet> petShelter;

    String heading1 = "Name";
    String heading2 = "|Hunger";
    String heading3 = "|Thirst";
    String heading4 = "|Boredom|";
    String heading5 = "|Adoptable|";
    String divider = "---------|-------|-------|-------|-------";

    Scanner mainScanner = new Scanner(System.in);

    public VirtualPetShelter() {
        petShelter = new ArrayList<VirtualPet>();
        petShelter.add(new Lion("Simba", 25, 25, 25));
        petShelter.add(new Dog("Spot", 25, 25, 25));
        petShelter.add(new Monkey("Apu", 50, 50, 50));
    }

    //getters
    public void displayAllPetsDescriptions() {
        for (int i = 0; i < petShelter.size(); i++) {
            System.out.println("[" + petShelter.get(i).getName() + "]" + " " + petShelter.get(i));
            System.out.println("");
        }
    }

    public void displayHealthStatus() {
        System.out.printf("%-8s %-7s %-7s %-7s %-7s %n", heading1, heading2, heading3, heading4, heading5);
        System.out.println(divider);
        for (int i = 0; i < petShelter.size(); i++) {
            System.out.printf("%-10s %-7s %-7s %-7s %-7s  %n", petShelter.get(i).getName(),
                    petShelter.get(i).getHungerLevel(), petShelter.get(i).getThirstLevel(), petShelter.get(i).getBoredomLevel(), petShelter.get(i).isCanAdopt());
        }
    }

    public void addPetToShelter(VirtualPet pet) {
        petShelter.add(pet);
    }

    public void removePetFromShelter() {
        System.out.println("Which pet did you find a home for?");

        String selectRemoval = mainScanner.nextLine();
        int missCounter = 0;
        for (int i = 0; i < petShelter.size(); i++) {
            if (selectRemoval.equalsIgnoreCase(petShelter.get(i).getName())) {
                System.out.println(petShelter.get(i).getName() + " has been sent to their new home!\n");
                petShelter.remove(i);
            } else {
                missCounter++;
            }
        }
        if (missCounter >= petShelter.size()) {
            System.out.println("Pet not found.\n");
        }
    }

    public ArrayList<VirtualPet> getPets() {
        return petShelter;
    }

    public void tick() {
        for (VirtualPet pet : petShelter) {
            pet.tick();
        }
    }

    public boolean allPetsAlive() {
        for (VirtualPet pet : petShelter) {
            if (!pet.isAlive()) {
                return false;
            }
        }
        return true;
    }

    public void feedAllPets() {
        for (VirtualPet pet : petShelter) {
            pet.feed();
        }
    }

    public void giveWaterToAllPets() {
        for (VirtualPet pet : petShelter) {
            pet.giveWater();
        }
    }

    public void playWithAllPets() {
        for (VirtualPet pet : petShelter) {
            pet.play();
        }
    }

    public void admitPet() {

        System.out.println("Please enter the pet's name");
        String addName = mainScanner.nextLine();

        System.out.println("Please enter the pet's age");
        int addAge = mainScanner.nextInt();

        System.out.println("Please enter the pet's Hunger.");
        int addHunger = mainScanner.nextInt();

        System.out.println("Please enter the pet's Thirst.");
        int addThirst = mainScanner.nextInt();
        mainScanner.nextLine();

        System.out.println("Please enter the type of pet (Lion,Dog, or Monkey)");
        String petType = mainScanner.nextLine();

        if (petType.equalsIgnoreCase("lion")) {
            Lion myLion = new Lion(addName, addAge, addThirst, addHunger);
            petShelter.add(myLion);
        } else if (petType.equalsIgnoreCase("dog")) {
            Dog myDog = new Dog(addName, addAge, addThirst, addHunger);
            petShelter.add(myDog);
        } else if (petType.equalsIgnoreCase("monkey")) {
            Monkey myMonkey = new Monkey(addName, addAge, addThirst, addHunger);
            petShelter.add(myMonkey);
        }
    }
}