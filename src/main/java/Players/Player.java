package Players;

public abstract class Player {

    private String name;
    private int healthPoints;
    protected Attributes attribute;


    public Player(String name, int healthPoints, Attributes attribute) {
        this.name = name;
        this.healthPoints = healthPoints;
        this.attribute = attribute;

    }

    public String getName() {
        return name;
    }

    public int getHealthPoints() {
        return healthPoints;
    }

    public void setHealthPoints(int healthPoints) {
        this.healthPoints = healthPoints;
    }

    public Attributes getAttribute() {
        return this.attribute;
    }

    public void setAttribute(Attributes attribute) {
        this.attribute = attribute;
    }

}
