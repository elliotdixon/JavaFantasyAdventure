package Players;


public class Orc extends Player {

    private Attributes armor;

    public Orc(String name, int healthPoints, Attributes weapon) {
        super(name, healthPoints, weapon);
        this.armor = armor;


    }

    public Attributes getArmor() {
        return this.armor;
    }

    public void setArmor(Attributes armor) {
        this.armor = armor;
    }

}