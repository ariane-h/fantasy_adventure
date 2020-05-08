package players;

import items.weapons.Weapon;

import java.util.ArrayList;

public class Barbarian extends Fighter {

    private ArrayList<Weapon> weapons;

    public Barbarian(String name, int healthPoints) {
        super(name, healthPoints);
        this.weapons = new ArrayList<Weapon>();
    }

    public ArrayList<Weapon> getWeapons() {
        return weapons;
    }
}
