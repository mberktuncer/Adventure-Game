package player.characters;

import inventory.Inventory;
import player.Player;

public class Archer extends Player {
    private static final int archerDamageValue = 7;
    private static int archerHealthValue = 18;
    private static int archerMoneyValue = 20;
    private static final String archerName = "ARCHER";

    public Archer() {
        super();
    }

    @Override
    protected void selectChar() {
        this.damage = archerDamageValue;
        this.health = archerHealthValue;
        this.money = archerMoneyValue;
        this.name = archerName;
    }

}
