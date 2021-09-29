package virtual_pet;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;

import static org.junit.jupiter.api.Assertions.*;


public class VirtualPetTest {


    @Test
    public void testIfPetHasAName() {
        Lion Simba = new Lion("Simba", 9, 15, 30);
        String name = Simba.getName();
        assertEquals("Simba", name);
    }

   @Test
  public void testIfCanCreateAPet(){
ArrayList<Monkey> testArray = new ArrayList<Monkey>();
      Monkey myMonkey =  new Monkey("Simba",19,20,50);
      assertTrue(myMonkey != null);

}
    @Test
    public void testIfPetCanDrink(){
        Dog puppy = new Dog("Yuppie",19,25,100);
        puppy.giveWater();
        assertEquals(80, puppy.getThirstLevel());
    }
    @Test
    public void testIfPetCanPlay(){
        Monkey myMonkey =  new Monkey("Simba",19,20,50);
        myMonkey.play();
        assertEquals(30,myMonkey.getBoredomLevel());
    }

    @Test
    public void testIfPetCanBeAdopted(){

        ArrayList<OrganicPet> petShelter = new ArrayList<OrganicPet>();
        petShelter.add(new Lion("Simba", 25, 25, 25));
        petShelter.remove(0);
        assertTrue(petShelter.isEmpty());


    }

    @Test
    public void testIfPetCanBeFed() {
        Dog puppy = new Dog("Yuppie", 19, 100, 100);
        puppy.feed();
        assertEquals(100, puppy.getThirstLevel());
    }
}
