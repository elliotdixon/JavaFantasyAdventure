package Players;

public class Knight extends Player {

    private Attributes weapon;
    private Attributes armor;


    public Knight(String name, int healthPoints, Attributes weapon) {
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