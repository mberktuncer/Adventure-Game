package inventory;

import inventory.equipments.Equipment;

public class Inventory {

    public boolean water;
    public boolean food;
    public boolean wood;
    public Equipment weapon;
    public Equipment armor;

    public Inventory(boolean water, boolean food, boolean wood, Equipment weapon, Equipment armor) {
        this.water = water;
        this.food = food;
        this.wood = wood;
        this.weapon = weapon;
        this.armor = armor;
    }

    public Equipment getWeapon() {
        return weapon;
    }

    public void setWeapon(Equipment weapon) {
        this.weapon = weapon;
    }

    public Equipment getArmor() {
        return armor;
    }

    public void setArmor(Equipment armor) {
        this.armor = armor;
    }
}