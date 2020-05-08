package items.medicines;

public abstract class Medicine {
    private String name;
    private int healingValue;
    private String colour;

    public Medicine(String name, int healingValue, String colour) {
        this.name = name;
        this.healingValue = healingValue;
        this.colour = colour;
    }



    public String getName() {
        return name;
    }

    public int getHealingValue() {
        return healingValue;
    }

    public String getColour() {
        return colour;
    }
}
