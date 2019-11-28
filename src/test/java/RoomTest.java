import Players.Attributes;
import Players.Orc;
import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;

import static junit.framework.TestCase.assertEquals;

public class RoomTest {

    Room room;
    Orc orc;
    ArrayList<Orc> enemies;

    @Before
    public void before() {

        orc = new Orc("PDA Monster", 20, Attributes.CLUB);
        room = new Room("PDA Dungeon", 500);

        enemies = new ArrayList<Orc>();
        enemies.add(orc);

    }

        @Test
        public void roomHasName(){
            assertEquals("PDA Dungeon", room.getName());
        }

        @Test
        public void roomHasCoins(){
            assertEquals(500, room.getGoldCoins());
        }

         @Test
         public void roomEnemiesStartsEmpty(){
        assertEquals(0, room.getEnemies().size());
    }

        @Test
        public void roomHasEnemy(){
            room.addEnemies(orc);
            assertEquals(enemies, room.getEnemies());
        }



    }


