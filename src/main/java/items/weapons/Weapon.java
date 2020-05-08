package items.weapons;

public abstract class Weapon {

    private String name;
    private int damageValue;

    public Weapon(String name, int damageValue) {
        this.name = name;
        this.damageValue = damageValue;
    }

    public String getName() {
        return name;
    }

    public int getDamageValue() {
        return damageValue;
    }
}
