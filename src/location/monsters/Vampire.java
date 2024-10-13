package location.monsters;

public class Vampire extends Monsters{

    private static final int vampireDamageValue = 4;
    private static final int vampireHealthValue = 14;
    private static final int vampirePrizeMoneyValue = 12;
    private static final String vampireName = "VAMPIRE";

    public Vampire(){
        super();
    }

    @Override
    protected void selectMonster() {
        this.damageValue = vampireDamageValue;
        this.healthValue = vampireHealthValue;
        this.prizeMoney = vampirePrizeMoneyValue;
        this.monsterName = vampireName;
    }
}
