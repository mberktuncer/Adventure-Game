package player;

import inventory.Inventory;
import inventory.equipments.Equipment;

public abstract class Player {
    protected Inventory inventory;
    protected int damage;
    protected int health;
    protected int money;
    protected String name;
    protected Equipment weapon;
    protected Equipment armor;

    public Inventory getInventory() {
        return inventory;
    }

    public void setInventory(Inventory inventory) {
        this.inventory = inventory;
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

    public Player() {
        selectChar();
    }

    protected abstract void selectChar();

    public int getDamage() {
        return damage;
    }

    public void setDamage(int damage) {
        this.damage = damage;
    }

    public int getHealth() {
        return health;
    }

    public void setHealth(int health) {
        this.health = health;
    }

    public int getMoney() {
        return money;
    }

    public void setMoney(int money) {
        this.money = money;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
