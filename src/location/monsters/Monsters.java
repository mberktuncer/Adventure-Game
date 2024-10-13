package location.monsters;

import java.util.Random;

public abstract class Monsters {

    protected int damageValue;
    protected int healthValue;
    protected int prizeMoney;

    public Monsters() {
        selectMonster();
    }

    protected abstract void selectMonster();

    public static int generateRandomMonster(){
        Random rnd = new Random();
        return rnd.nextInt(3) + 1;
    }

    public int getDamageValue() {
        return damageValue;
    }

    public void setDamageValue(int damageValue) {
        this.damageValue = damageValue;
    }

    public int getHealthValue() {
        return healthValue;
    }

    public void setHealthValue(int healthValue) {
        this.healthValue = healthValue;
    }

    public int getPrizeMoney() {
        return prizeMoney;
    }

    public void setPrizeMoney(int prizeMoney) {
        this.prizeMoney = prizeMoney;
    }
}
