import Players.Attributes;
import Players.Knight;
import Players.Orc;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNull;


public class KnightTest {

    Knight knight;
    Orc orc;

    @Before
    public void before(){
        knight = new Knight("Sir Keith", 20, Attributes.CLAYMORE);
        orc = new Orc("PDA Monster", 20, Attributes.CLUB);    }

    @Test
    public void hasName(){
        assertEquals("Sir Keith", knight.getName());
    }

    @Test
    public  void hasHealth(){
        assertEquals(20, knight.getHealthPoints());
    }

    @Test
    public void hasAttribute(){
        assertEquals(Attributes.CLAYMORE, knight.getAttribute());
    }
    @Test
    public void canAttack() {
        knight.attack(orc);
        assertEquals(10, orc.getHealthPoints());
    }

    @Test
    public void canDefendWithArmor() {
        knight.defend(orc);
        assertEquals(20, orc.getHealthPoints());
    }

    @Test
    public void hasNoArmorAtStart() {
        assertNull(knight.getArmor());
    }

    @Test
    public void canSetArmor(){
        knight.setArmor(Attributes.SHEILD);
        assertEquals(Attributes.SHEILD, knight.getArmor());
    }

}
