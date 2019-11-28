import Players.Orc;

import java.util.ArrayList;

public class Room {

    private String name;
    private int goldCoins;
    private ArrayList<Orc> enemies;

    public Room(String name, int goldCoins){
        this.name = name;
        this.goldCoins = goldCoins;
        this.enemies = new ArrayList<Orc>();
    }


    public String getName() {
        return name;
    }

    public int getGoldCoins() {
        return goldCoins;
    }

    public ArrayList<Orc> getEnemies() {
        return enemies;
    }

    public void addEnemies(Orc orc){
        enemies.add(orc);
    }


}
