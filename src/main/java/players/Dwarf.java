package players;

import items.weapons.Weapon;

import java.util.ArrayList;

public class Dwarf extends Fighter {

    private ArrayList<Weapon> weapons;

    public Dwarf(String name, int healthPoints) {
        super(name, healthPoints);
        this.weapons = new ArrayList<Weapon>();
    }

    public ArrayList<Weapon> getWeapons() {
        return weapons;
    }
}
