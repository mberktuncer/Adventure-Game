package player;

public class Knight extends Player{

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

    public static int getKnightDamageValue() {
        return knightDamageValue;
    }

    public static int getKnightHealthValue() {
        return knightHealthValue;
    }

    public static void setKnightHealthValue(int knightHealthValue) {
        Knight.knightHealthValue = knightHealthValue;
    }

    public static int getKnightMoneyValue() {
        return knightMoneyValue;
    }

    public static void setKnightMoneyValue(int knightMoneyValue) {
        Knight.knightMoneyValue = knightMoneyValue;
    }

    public static String getKnightName() {
        return knightName;
    }

}
