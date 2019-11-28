import Players.Attributes;
import Players.Dwarf;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;


public class DwarfTest {

    Dwarf dwarf;

    @Before
    public void before(){
        dwarf = new Dwarf("Harrison", 15, Attributes.THEAXEOFJAVASCRIPTEVANGELISM);
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
}
