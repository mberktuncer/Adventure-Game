package player.characters;

import player.Player;

public class Samurai extends Player {

    private static final int samuraiDamageValue = 5;
    private static final int samuraiMaxHealthValue = 21;
    private static final int samuraiMoneyValue = 15;
    private static final String samuraiName = "SAMURAI";

    public Samurai() {
        super();
    }

    @Override
    protected void selectChar() {
        this.damage = samuraiDamageValue;
        this.health = samuraiMaxHealthValue;
        this.maxHealth = samuraiMaxHealthValue;
        this.money = samuraiMoneyValue;
        this.name = samuraiName;
    }

}