package Players;

public class Warlock extends Player {

    private Attributes weapon;
    private Attributes armor;

    public Warlock(String name, int healthPoints, Attributes weapon) {
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