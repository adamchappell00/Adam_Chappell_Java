import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class RPGInheritanceTest {

        private Warrior warrior1;
        private Constable constable1;
        private Farmer farmer1;

        @Before
        public void setUp(){
                warrior1 = new Warrior("Conan");
                constable1 = new Constable("Sheriff Joe");
                farmer1 = new Farmer("Buck");
        }
        // Sanity
        @Test
        public void creationShouldHaveHappened(){
                assertNotNull(warrior1);
                assertNotNull(constable1);
                assertNotNull(farmer1);
        }

        @Test
        public void createdCharactersShouldHaveAppropriateFieldValues(){
                assertFalse(constable1.getClass().equals(warrior1.getClass()));
                assertEquals(100, warrior1.getShieldStrength());
                assertEquals(1, farmer1.getAttackPower());
                assertEquals(10, warrior1.getAttackPower());
        }

        @Test
        public void attackCharacterShouldReduceHealth(){
                assertEquals(100, farmer1.getHealth());
                assertEquals(100, warrior1.getHealth());
                warrior1.attackCharacter(farmer1);
                farmer1.attackCharacter(warrior1);
                assertEquals(90, farmer1.getHealth());
                assertEquals(99, warrior1.getHealth());
        }

        @Test
        public void arrestCharacterShouldMakeCharacterArrested(){
                // Establish that the characters are not yet under arrest
                assertFalse(warrior1.isArrested());
                assertTrue(!farmer1.isArrested());
                // Arrest them!
                constable1.arrestCharacter(warrior1);
                constable1.arrestCharacter(farmer1);
                // Check that they are now arrested
                assertTrue(warrior1.isArrested());
                assertTrue(farmer1.isArrested());
        }

}