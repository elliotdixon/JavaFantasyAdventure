import Players.Attributes;
import Players.Wizard;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;


public class WizardTest {

    Wizard wizard;

    @Before
    public void before(){
        wizard = new Wizard("Louise", 10, Attributes.WAND);
    }

    @Test
    public void hasName(){
        assertEquals("Louise", wizard.getName());
    }

    @Test
    public  void hasHealth(){
        assertEquals(10, wizard.getHealthPoints());
    }

    @Test
    public void hasAttribute(){
        assertEquals(Attributes.WAND, wizard.getAttribute());
    }
}