package Players;

public class Wizard extends Player {

    private Attributes weapon;
    private Attributes armor;

    public Wizard(String name, int healthPoints, Attributes weapon) {
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