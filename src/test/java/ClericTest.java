import Players.Attributes;
import Players.Cleric;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;


public class ClericTest {

    Cleric cleric;

    @Before
    public void before(){
        cleric = new Cleric("Sky", 5, Attributes.BOOK);
    }

    @Test
    public void hasName(){
        assertEquals("Sky", cleric.getName());
    }

    @Test
    public  void hasHealth(){
        assertEquals(5, cleric.getHealthPoints());
    }

    @Test
    public void hasAttribute(){
        assertEquals(Attributes.BOOK, cleric.getAttribute());
    }
}