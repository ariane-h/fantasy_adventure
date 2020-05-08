import items.weapons.Sword;
import org.junit.Before;
import org.junit.Test;
import players.Knight;

import static org.junit.Assert.assertEquals;

public class KnightTest {

    Knight knight;
    Sword sword;

    @Before
    public void before(){
        knight = new Knight("Barry",10);

    }

    @Test
    public void hasName(){
        assertEquals("Barry", knight.getName());
    }

//    @Test
//    public void canAddWeapon(){
//        knight.addWeapon(sword);
//        assertEquals(1, knight.getNumberOfWeapons());
//    }
}
