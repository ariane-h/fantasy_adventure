package players;

import items.medicines.Medicine;

import java.util.ArrayList;

public class Cleric extends Player {

    private ArrayList<Medicine> medicines;

    public Cleric(String name, int healthPoints) {
        super(name, healthPoints);
        this.medicines = new ArrayList<Medicine>();
    }

    public ArrayList<Medicine> getMedicines() {
        return medicines;
    }

    public int getNumberOfMedicines(){
        return this.medicines.size();
    }

    public void addMedicine(Medicine medicine){
        this.medicines.add(medicine);
    }

    public void removeMedicine(Medicine medicine){
        this.medicines.remove(medicine);
    }
}
