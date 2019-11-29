package Players;

public class Dwarf extends Player {

    private Attributes weapon;
    private Attributes armor;


    public Dwarf(String name, int healthPoints, Attributes weapon) {
        super(name, healthPoints, weapon);
        this.armor = null;

    }

    public Attributes getArmor() {
        return this.armor;
    }

    public void setArmor(Attributes armor) {
        this.armor = armor;
    }


    public void defend(Player opponent) {
        Attributes opponentWeapon = opponent.getAttribute();
        Attributes armor = (Attributes.ANGULARHELMET);
        int defendingPoints = getHealthPoints() + armor.getBaseAffect();
        int result = defendingPoints + opponentWeapon.getBaseAffect();
        setHealthPoints(result);

    }


}

