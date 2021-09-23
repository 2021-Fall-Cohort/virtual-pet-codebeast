package virtual_pet;

import java.util.Scanner;

public class VirtualPetApplication {

    public static void main(String[] args) {
        VirtualPetApplication myApp = new VirtualPetApplication();
        myApp.game();
    }
    public void game(){
        //Instantiate new scanner object and new lion1 object
        //lion1 starts basically blank, now we can take input to make changes

        Scanner userInput = new Scanner(System.in);
        //VirtualPet lion1 = new VirtualPet(" ", " ");

        VirtualPetShelter something = new VirtualPetShelter();
        something.displayAllPetsDescriptions();
        something.displayHealthStatus();
        createPet(something);

//        VirtualPetShelter something = new VirtualPetShelter();
//        for(Lion currentLion: something.getPets()){
//            System.out.println(currentLion.getName() + " has a mane of color: " + currentLion.getManeColor() + " and is " + currentLion.getAge() + " years old ");
//        }
//        something.getPet(0);
//
//
//
//        //Prompt user for name of pet, and set into Lion class
//        System.out.println("Please name your pet");
//        String nameOfPet = userInput.nextLine();
//        lion1.setName(nameOfPet);
//
//        //Prompt user for color of mane, and set into Lion class
//        System.out.println("Please give your lion a mane color? ");
//        String maneColor = userInput.next();
//        lion1.setManeColor(maneColor);
//
//        lion1.greeting();
//
//        int userChoice = 0;
//        do {
//
//            //Check age, (set higher later) if(true) game over
//            if (lion1.getAge() >= 120 ){
//                System.out.println("Your lion died of old age.");
//                break;
//            }
//            //check hunger, if(true) game over
//            if (lion1.getHungerLevel() >= 110 ) {
//                System.out.println("Your lion died of starvation.");
//                break;
//            }
//            if (lion1.getThirstLevel() >= 110) {
//                System.out.println("Your lion died of thirst");
//                break;
//            }
//            if(lion1.getThirstLevel() <=0){
//                System.out.println("You burst your lions belly with fluid. GAME OVER");
//                break;
//            }
//            if( lion1.getHungerLevel() <= 0){
//                System.out.println(" You overfed your lion. GAME OVER! ");
//                break;
//            }
//
//            //check timeTick, if >= 2, call timePass()
//            //if timePass() is called, it will internally reset timeTick
//            //getTime calls timeTick and evaluates
//
//            System.out.println("What would you like to do?");
//            System.out.println("Press 1 for pet status");
//            System.out.println("Press 2 to feed pet");
//            System.out.println("Press 3 to give water");
//            System.out.println("Press 4 to perform tricks");
//            System.out.println("Press 5 to exit");
//
//            userChoice = userInput.nextInt();
//            if (userChoice == 1) {
//                lion1.petStatus();
//            } else if (userChoice == 2) {
//                lion1.feed();
//            } else if (userChoice == 3) {
//                lion1.giveWater();
//            } else if (userChoice == 4) {
//                lion1.play();
//            } else if (userChoice == 5){
//                break;
//            }
//
//
//            lion1.timePass();
//
//
//        } while (userChoice <= 4);
//
//        System.out.println("Exiting Program");
//        System.exit(0);
    }
    public void createPet(VirtualPetShelter shelter){


        System.out.println("Please enter the pet's name");
            Scanner addName = new Scanner(System.in);
            String name = (addName.nextLine());

            System.out.println("Please enter the pet's age");
            Scanner addAge = new Scanner(System.in);
            int age = (addName.nextInt());
            addName.nextLine();

            System.out.println("Please enter the pet's Hunger.");
            Scanner addHunger = new Scanner(System.in);
            int hunger = (addHunger.nextInt());

            System.out.println("Please enter the pet's Thirst.");
            Scanner addThirst = new Scanner(System.in);
            int thirst = (addThirst.nextInt());

            System.out.println("Please enter the type of pet: ");


            Lion myLion = new Lion(name,age,thirst,hunger);
            shelter.addPetToShelter(myLion);
    }
}
