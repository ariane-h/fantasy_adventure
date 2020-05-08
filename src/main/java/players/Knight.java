package players;


import items.weapons.Weapon;

import java.util.ArrayList;

public class Knight extends Fighter {

    private ArrayList<Weapon> weapons;

    public Knight(String name, int healthPoints) {
        super(name, healthPoints);
        this.weapons = new ArrayList<Weapon>();
    }

    public ArrayList<Weapon> getWeapons() {
        return weapons;
    }
}
