package player.characters;

import player.Player;

public class Knight extends Player {

    private static final int knightDamageValue = 8;
    private static int knightHealthValue = 24;
    private static int knightMoneyValue = 5;
    private static final String knightName = "KNIGHT";

    public Knight(){
        super();
    }

    @Override
    protected void selectChar() {
        this.damage = knightDamageValue;
        this.health = knightHealthValue;
        this.money = knightMoneyValue;
        this.name = knightName;
    }

}
