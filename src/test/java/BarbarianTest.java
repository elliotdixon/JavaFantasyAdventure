import Players.Attributes;
import Players.Barbarian;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;


public class BarbarianTest {

    Barbarian barbarian;

    @Before
    public void before(){
        barbarian = new Barbarian("Zsolt", 30, Attributes.HUNGARIANBOW);
    }

    @Test
    public void hasName(){
        assertEquals("Zsolt", barbarian.getName());
    }

    @Test
    public  void hasHealth(){
        assertEquals(30, barbarian.getHealthPoints());
    }

    @Test
    public void hasAttribute(){
        assertEquals(Attributes.HUNGARIANBOW, barbarian.getAttribute());
    }
}