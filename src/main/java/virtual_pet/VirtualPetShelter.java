package virtual_pet;

import java.util.ArrayList;
import java.util.Scanner;

public class VirtualPetShelter {


    ArrayList<VirtualPet> petShelter;

    String heading1 = "Name";
    String heading2 = "|Hunger";
    String heading3 = "|Thirst";
    String divider = "---------|-------|-------|-------";

    public VirtualPetShelter() {

        petShelter = new ArrayList<VirtualPet>();
        petShelter.add(new Lion("Simba", "Gold", 5, 25, 25));
        petShelter.add(new Lion("Mufassa", "Brown", 13, 50, 50));


    }

    //getters
    public void displayAllPetsDescriptions() {
        for (int i = 0; i < petShelter.size(); i++) {
            System.out.println("[" + petShelter.get(i).getName() + "]" + " " + petShelter.get(i).getManeColor());
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
//            System.out.println("Please enter the pet's name");
//            Scanner addName = new Scanner(System.in);
//            String name = (addName.nextLine());
//
//            System.out.println("Please enter the pet's age");
//            Scanner addAge = new Scanner(System.in);
//            String age = (addName.nextLine());
//
//
//            System.out.println("Please enter the pet's Hunger.");
//            Scanner addHunger = new Scanner(System.in);
//            int hunger = (addHunger.nextInt());
//
//            System.out.println("Please enter the pet's Thirst.");
//            Scanner addThirst = new Scanner(System.in);
//            int thirst = (addThirst.nextInt());




            petShelter.add(pet);
        }

//    public void removeLionById(int n){
//        petShelter.remove(n);
//    }
//
//    public ArrayList<Lion> getPets(){
//        return petShelter;
//    }
//
//
//}
    }
}