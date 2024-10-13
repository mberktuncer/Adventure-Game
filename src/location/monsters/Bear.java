package location.monsters;

public class Bear extends Monsters{

    private static final int bearDamageValue = 7;
    private static final int bearHealthValue = 20;
    private static final int bearPrizeMoneyValue = 12;

    public Bear(){
        super();
    }

    @Override
    protected void selectMonster() {
        this.damageValue = bearDamageValue;
        this.healthValue = bearHealthValue;
        this.prizeMoney = bearPrizeMoneyValue;
    }
}