import Players.Attributes;
import Players.Warlock;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;


public class WarlockTest {

    Warlock warlock;

    @Before
    public void before(){
        warlock = new Warlock("John", 10, Attributes.AXE);
    }

    @Test
    public void hasName(){
        assertEquals("John", warlock.getName());
    }

    @Test
    public  void hasHealth(){
        assertEquals(10, warlock.getHealthPoints());
    }

    @Test
    public void hasAttribute(){
        assertEquals(Attributes.AXE, warlock.getAttribute());
    }
}