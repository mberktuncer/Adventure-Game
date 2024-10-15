package player.characters;

import player.Player;

public class Knight extends Player {

    private static final int knightDamageValue = 8;
    private static final int  knightMaxHealthValue = 24;
    private static final int knightMoneyValue = 5;
    private static final String knightName = "KNIGHT";

    public Knight(){
        super();
    }

    @Override
    protected void selectChar() {
        this.damage = knightDamageValue;
        this.health = knightMaxHealthValue;
        this.maxHealth = knightMaxHealthValue;
        this.money = knightMoneyValue;
        this.name = knightName;
    }

}
