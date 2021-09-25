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
    public void testIfPetCanBeFed(){
        Dog puppy = new Dog("Yuppie",19,100,100);
        puppy.feed();
        assertEquals(80,puppy.getThirstLevel());
    }
}
