import Players.Attributes;
import Players.Dwarf;
import Players.Orc;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNull;


public class DwarfTest {

    Dwarf dwarf;
    Orc orc;

    @Before
    public void before(){
        dwarf = new Dwarf("Harrison", 15, Attributes.THEAXEOFJAVASCRIPTEVANGELISM);
        orc = new Orc("PDA Monster", 20, Attributes.CLUB);
    }

    @Test
    public void hasName(){
        assertEquals("Harrison", dwarf.getName());
    }

    @Test
    public  void hasHealth(){
        assertEquals(15, dwarf.getHealthPoints());
    }

    @Test
    public void hasAttribute(){
        assertEquals(Attributes.THEAXEOFJAVASCRIPTEVANGELISM, dwarf.getAttribute());
    }

    @Test
    public void canAttack() {
        dwarf.attack(orc);
        assertEquals(15, dwarf.getHealthPoints());
    }

    @Test
    public void canDefendWithArmor() {
        dwarf.defend(orc);
        assertEquals(20, orc.getHealthPoints());
    }

    @Test
    public void hasNoArmorAtStart() {
        assertNull(dwarf.getArmor());
    }

    @Test
    public void canSetArmor(){
        dwarf.setArmor(Attributes.SHEILD);
        assertEquals(Attributes.SHEILD, dwarf.getArmor());
    }

}
