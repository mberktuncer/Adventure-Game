package player;

import inventory.Inventory;
import inventory.equipments.Equipment;

public abstract class Player {
    protected Inventory inventory;
    protected int damage;
    protected int health;
    protected int maxHealth;
    protected int money;
    protected String name;
    public Player() {
        selectChar();
    }

    protected abstract void selectChar();

    public Inventory getInventory() {
        return inventory;
    }

    public void setInventory(Inventory inventory) {
        this.inventory = inventory;
    }

    public int getMaxHealth() {
        return maxHealth;
    }

    public int getDamage() {
        return damage;
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

}
