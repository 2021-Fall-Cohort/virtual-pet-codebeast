package virtual_pet;

import java.util.ArrayList;
import java.util.Scanner;

public class VirtualPetShelter {

    private ArrayList<OrganicPet> organicPetShelter;
    private ArrayList<RoboticPet> roboPetShelter;

    String heading1 = "Name";
    String heading2 = "|Hunger";
    String heading3 = "|Thirst";
    String heading4 = "|Boredom|";

    String divider = "---------|-------|-------|-------|";

    String heading6 = "Name";
    String heading7 = "|Oil";
    String heading8 = "|Battery";

    String divider2 = "---------|-------|-------|";

    Scanner mainScanner = new Scanner(System.in);

    //constructor
    public VirtualPetShelter() {
        organicPetShelter = new ArrayList<OrganicPet>();
        organicPetShelter.add(new Lion("Simba", 25, 25, 25));
        organicPetShelter.add(new Dog("Spot", 25, 25, 25));
        organicPetShelter.add(new Monkey("Apu", 50, 50, 50));

        roboPetShelter = new ArrayList<RoboticPet>();
        roboPetShelter.add(new RoboDog("RoboKopi", 7, 100, 100));
        roboPetShelter.add(new RoboLion("RoboSimba", 5, 100, 100));
        roboPetShelter.add(new RoboMonkey("RoboApu", 4, 100, 100));
    }

    //getters
    public void displayAllPetsDescriptions() {
        for (int i = 0; i < organicPetShelter.size(); i++) {
            System.out.println("[" + organicPetShelter.get(i).getName() + "]" + " " + organicPetShelter.get(i));
            System.out.println("");
        }
    }

    public void displayHealthStatusOrganicPets() {
        System.out.printf("%-8s %-7s %-7s %-7s %n", heading1, heading2, heading3, heading4);
        System.out.println(divider);
        for (int i = 0; i < organicPetShelter.size(); i++) {
            System.out.printf("%-10s %-7s %-7s %-7s  %n", organicPetShelter.get(i).getName(),
                    organicPetShelter.get(i).getHungerLevel(), organicPetShelter.get(i).getThirstLevel(), organicPetShelter.get(i).getBoredomLevel());
        }
    }

    public void displayHealthStatusOfRoboPets() {
        System.out.printf("%-8s %-7s %-7s  %n", heading6, heading7, heading8);
        System.out.println(divider2);
        for (int i = 0; i < roboPetShelter.size(); i++) {
            System.out.printf("%-10s %-7s %-7s  %n", roboPetShelter.get(i).getName(),
                    roboPetShelter.get(i).getOilLevel(), roboPetShelter.get(i).getBatteryLevel());
        }
    }

//    public void addPetToShelter(OrganicPet pet) {
//        organicPetShelter.add(pet);
//    }

    public void removePetFromShelter() {
        System.out.println("Which pet did you find a home for?");

        String selectRemoval = mainScanner.nextLine();
        int missCounter = 0;
        for (int i = 0; i < organicPetShelter.size(); i++) {
            if (selectRemoval.equalsIgnoreCase(organicPetShelter.get(i).getName())) {
                System.out.println(organicPetShelter.get(i).getName() + " has been sent to their new home!\n");
                organicPetShelter.remove(i);
            } else {
                missCounter++;
            }
        }
        if (missCounter >= organicPetShelter.size()) {
            System.out.println("Pet not found.\n");
        }
    }

    public ArrayList<OrganicPet> getPets() {
        return organicPetShelter;
    }

    public void tick() {
        for (OrganicPet pet : organicPetShelter) {
            pet.tick();
        }

        for (RoboticPet pet : roboPetShelter) {
            pet.tick();
        }
    }

    public boolean allPetsAlive() {
        for (OrganicPet pet : organicPetShelter) {
            if (!pet.isAlive()) {
                return false;
            }
        }
        return true;
    }

    public void feedAllPets() {
        for (OrganicPet pet : organicPetShelter) {
            pet.feed();
        }
    }

    public void giveWaterToAllPets() {
        for (OrganicPet pet : organicPetShelter) {
            pet.giveWater();
        }
    }

    public void playWithAllPets() {
        for (OrganicPet pet : organicPetShelter) {
            pet.play();
        }
    }

    public void oilRoboPet() {
        for (RoboticPet pet : roboPetShelter) {
            pet.addOil();
        }
    }

    public void chargeBattery() {
        for (RoboticPet pet : roboPetShelter) {
            pet.chargeBattery();
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

        System.out.println("Please enter the type of pet (Lion,Dog, or Monkey\nOr select RoboLion, RoboDog or RoboMonkey)");
        String petType = mainScanner.nextLine();

        if (petType.equalsIgnoreCase("lion")) {
            Lion myLion = new Lion(addName, addAge, addThirst, addHunger);
            organicPetShelter.add(myLion);

        } else if (petType.equalsIgnoreCase("dog")) {
            Dog myDog = new Dog(addName, addAge, addThirst, addHunger);
            organicPetShelter.add(myDog);

        } else if (petType.equalsIgnoreCase("monkey")) {
            Monkey myMonkey = new Monkey(addName, addAge, addThirst, addHunger);
            organicPetShelter.add(myMonkey);

        } else if (petType.equalsIgnoreCase("RoboLion")) {
            RoboLion myRoboLion = new RoboLion(addName, addAge, 100, 100);
            roboPetShelter.add(myRoboLion);

        } else if (petType.equalsIgnoreCase("RoboDog")) {
            RoboDog myRoboDog = new RoboDog(addName, addAge, 100, 100);
            roboPetShelter.add(myRoboDog);

        } else if (petType.equalsIgnoreCase("RoboMonkey")) {
            RoboMonkey myRoboMonkey = new RoboMonkey(addName, addAge, 100, 100);
            roboPetShelter.add(myRoboMonkey);
        } else {
            System.out.println("Invalid Selection.");
        }
    }
}