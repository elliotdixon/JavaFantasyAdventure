import Players.Attributes;
import Players.Orc;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;


public class OrcTest {

    Orc orc;

    @Before
    public void before(){
        orc = new Orc("PDA Monster", 20, Attributes.CLUB);
    }

    @Test
    public void hasName(){
        assertEquals("PDA Monster", orc.getName());
    }

    @Test
    public  void hasHealth(){
        assertEquals(20, orc.getHealthPoints());
    }

    @Test
    public void hasAttribute(){
        assertEquals(Attributes.AXE, orc.getAttribute());
    }
}