import Players.Attributes;
import Players.Knight;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;


public class KnightTest {

    Knight knight;

    @Before
    public void before(){
        knight = new Knight("Sir Keith", 20, Attributes.CLAYMORE);
    }

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
}