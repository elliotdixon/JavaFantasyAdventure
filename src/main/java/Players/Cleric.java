package Players;

public class Cleric extends Player {
    private Attributes armor;

    public Cleric(String name, int healthPoints, Attributes weapon) {
        super(name, healthPoints, weapon);
        this.armor = null;

    }

    public Attributes getArmor() {
        return this.armor;
    }

    public void setArmor(Attributes armor) {
        this.armor = armor;
    }

}