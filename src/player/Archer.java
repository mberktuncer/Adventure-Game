package player;

public class Archer extends Player{

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

    public static int getArcherDamageValue() {
        return archerDamageValue;
    }

    public static int getArcherHealthValue() {
        return archerHealthValue;
    }

    public static void setArcherHealthValue(int archerHealthValue) {
        Archer.archerHealthValue = archerHealthValue;
    }

    public static int getArcherMoneyValue() {
        return archerMoneyValue;
    }

    public static void setArcherMoneyValue(int archerMoneyValue) {
        Archer.archerMoneyValue = archerMoneyValue;
    }

    public static String getArcherName() {
        return archerName;
    }
    
}
