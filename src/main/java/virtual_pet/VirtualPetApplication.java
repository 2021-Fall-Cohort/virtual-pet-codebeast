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
        String selection = "";
        do {
            System.out.println("Press q to quit");
            selection = mainScanner.nextLine().toLowerCase();

            adoptionCenter.displayAllPetsDescriptions();
            adoptionCenter.displayHealthStatus();

            //study this
            adoptionCenter.addPetToShelter(admitPet());
        }
        while (selection != "q");
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