import items.medicines.Potion;
import org.junit.Before;
import org.junit.Test;
import players.Cleric;

import static org.junit.Assert.assertEquals;

public class ClericTest {

    Cleric cleric;
    Potion potion;

    @Before
    public void before(){
        cleric = new Cleric("Mike", 100);
        potion = new Potion("Restoration",30, "purple");
    }

    @Test
    public void exists(){
        assertEquals("Mike", cleric.getName());
    }

    @Test
    public void canAddMedicine(){
        cleric.addMedicine(potion);
        assertEquals(1, cleric.getNumberOfMedicines());
    }

    @Test
    public void canRemoveMedicine(){
        cleric.addMedicine(potion);
        cleric.removeMedicine(potion);
        assertEquals(0, cleric.getNumberOfMedicines());
    }

//    @Test
//    public void canHealPlayer(){
//        cleric.addMedicine(potion);
//        cleric.heal(potion, knight);
//        assertEquals(50, knight.getHealthPoints());
//    }
}
