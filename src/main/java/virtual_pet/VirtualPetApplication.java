package virtual_pet;

import java.util.Scanner;

public class VirtualPetApplication {
    Scanner mainScanner = new Scanner(System.in);

    public static void main(String[] args) {
        VirtualPetApplication myApp = new VirtualPetApplication();
        myApp.game();
    }

    public void game() {

        VirtualPetShelter adoptionCenter = new VirtualPetShelter();


        System.out.println("\nWelcome to Virtual Pet Shelter App!\n" +
                "The goal is to care for pets and get them to adoptable status.\n" +
                "Try not to kill any thing.\n");
        int selection = 0;
        do {

            //adoptionCenter.displayAllPetsDescriptions();
            adoptionCenter.displayHealthStatus();

            System.out.println("\nPress 1 to feed the pets.");
            System.out.println("Press 2 to give the pets water");
            System.out.println("Press 3 to entertain/play with pets.");
            System.out.println("Press 4 to admit a pet into shelter!");
            System.out.println("Press 5 to find pet a good home (must be healthy and happy)");
            System.out.println("Press 6 to slaughter pet.\n");
            selection = mainScanner.nextInt();
            mainScanner.nextLine();

            if (selection == 1) {
                for (int i = 0; i < adoptionCenter.petShelter.size() - 1; i++) {
                    adoptionCenter.petShelter.get(i).feed();
                }
            } else if (selection == 2) {
                for (int i = 0; i < adoptionCenter.petShelter.size() - 1; i++) {
                    adoptionCenter.petShelter.get(i).giveWater();
                }
            } else if (selection == 3) {
                for (int i = 0; i < adoptionCenter.petShelter.size() - 1; i++) {
                    adoptionCenter.petShelter.get(i).play();
                }
            } else if (selection == 4) {
                adoptionCenter.petShelter.add(admitPet());
            } else if (selection == 5) {
                System.out.println("Which pet did you find a home for?");
                int petSelect = mainScanner.nextInt();
                if (adoptionCenter.petShelter.get(petSelect).canAdopt) {
                    adoptionCenter.petShelter.remove(petSelect);
                } else {
                    System.out.println("Pet is in not ready to leave shelter.");
                }

            } else if (selection == 6) {

            }
        }
        while (selection != 9);
    }

    public VirtualPet admitPet() {

        System.out.println("Please enter the pet's name");
        String addName = mainScanner.nextLine();

        System.out.println("Please enter the pet's age");
        int addAge = mainScanner.nextInt();

        System.out.println("Please enter the pet's Hunger.");
        int addHunger = mainScanner.nextInt();

        System.out.println("Please enter the pet's Thirst.");
        int addThirst = mainScanner.nextInt();
        mainScanner.nextLine();

        System.out.println("Please enter the type of pet (Lion or Dog)");
        String petType = mainScanner.nextLine();

        if (petType.equalsIgnoreCase("lion")) {
            Lion myLion = new Lion(addName, addAge, addThirst, addHunger);
            return myLion;
        } else if (petType.equalsIgnoreCase("dog")) {
            Dog myDog = new Dog(addName, addAge, addThirst, addHunger);
            return myDog;
        } else if (petType.equalsIgnoreCase("monkey")) {
            Monkey myMonkey = new Monkey(addName, addAge, addThirst, addHunger);
            return myMonkey;
        }

        //temp
        Dog myDog = new Dog(addName, addAge, addThirst, addHunger);
        return myDog;
    }

//adopting a pet = removing from shelter

//you can only remove pets with all stats > 90

//goal to get rid of all pets
// if pet dies, auto-admit another one, deathcounter++
// game over is deathcounter > 2;

}