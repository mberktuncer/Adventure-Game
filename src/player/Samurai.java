package player;

public class Samurai extends Player{

    private static final int samuraiDamageValue = 5;
    private static int samuraiHealthValue = 21;
    private static int samuraiMoneyValue = 15;
    private static final String samuraiName = "SAMURAI";

    public Samurai() {
        super();
    }

    @Override
    protected void selectChar() {
        this.damage = samuraiDamageValue;
        this.health = samuraiHealthValue;
        this.money = samuraiMoneyValue;
        this.name = samuraiName;
    }
    public static int getSamuraiDamageValue(){
        return samuraiDamageValue;
    }

    public static String getSamuraiName(){
        return samuraiName;
    }

    public static int getSamuraiHealthValue() {
        return samuraiHealthValue;
    }

    public static void setSamuraiHealthValue(int samuraiHealthValue) {
        Samurai.samuraiHealthValue = samuraiHealthValue;
    }

    public static int getSamuraiMoneyValue() {
        return samuraiMoneyValue;
    }

    public static void setSamuraiMoneyValue(int samuraiMoneyValue) {
        Samurai.samuraiMoneyValue = samuraiMoneyValue;
    }
}