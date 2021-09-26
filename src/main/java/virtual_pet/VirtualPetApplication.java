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
        boolean petsAlive = true;
        do {

            adoptionCenter.displayHealthStatus();

            System.out.println("\nPress 1 to feed the pets.");
            System.out.println("Press 2 to give the pets water");
            System.out.println("Press 3 to entertain/play with pets.");
            System.out.println("Press 4 to admit a pet into shelter!");
            System.out.println("Press 5 to find pet a good home (must be healthy and happy)");
            System.out.println("Press 9 to exit.\n");
            selection = mainScanner.nextInt();
            mainScanner.nextLine();

            if (selection == 1) {
                adoptionCenter.feedAllPets();

            } else if (selection == 2) {
                adoptionCenter.giveWaterToAllPets();

            } else if (selection == 3) {
                adoptionCenter.playWithAllPets();

            } else if (selection == 4) {
                adoptionCenter.admitPet();

            } else if (selection == 5) {
                adoptionCenter.removePetFromShelter();
            }

            if (!adoptionCenter.allPetsAlive()) {
                petsAlive = false;
                System.out.println("Pet has died!");
            }

            //empty shelter = game over
            if (adoptionCenter.getPets().size() == 0){
                System.out.println("All pets have found a home! You win!");
                petsAlive = false;
            }

        }
        while (selection != 9 && petsAlive);
        System.out.println("Game Over!");
    }
}

//left to implement
// all pets gone - game over
//