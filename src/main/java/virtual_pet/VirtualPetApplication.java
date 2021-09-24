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
                adoptionCenter.feedAllPets();
            } else if (selection == 2) {
                adoptionCenter.giveWaterToAllPets();
            } else if (selection == 3) {
                adoptionCenter.playWithAllPets();
            } else if (selection == 4) {
                adoptionCenter.admitPet();
            } else if (selection == 5) {
                adoptionCenter.removePetFromShelter();
            } else if (selection == 6) {
            }
            if (!adoptionCenter.allPetsAlive()) {
                petsAlive = false;
                System.out.println("Pet has died!");
            }

        }
        while (selection != 9 && petsAlive);
        System.out.println("Game Over!");
    }
}
//            } else if (selection == 5) {
//                System.out.println("Which pet did you find a home for?");
//                int petSelect = mainScanner.nextInt();
//                if (adoptionCenter.petShelter.get(petSelect).canAdopt) {
//                    adoptionCenter.petShelter.remove(petSelect);
//                } else {
//                    System.out.println("Pet is in not ready to leave shelter.");
//                }
//
//            } else if (selection == 6) {
//
//            }
//            if (!adoptionCenter.allPetsAlive()){
//                petsAlive = false;
//                System.out.println("Pet has died!");
//            }
//            adoptionCenter.tick();
//        }
//        while (selection != 9 && petsAlive);
//        System.out.println("Game Over!");
//    }






