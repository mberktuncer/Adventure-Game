package inventory.equipments.weapons;

import inventory.equipments.Equipment;

public class Sword extends Equipment {

    private static final int swordDamageValue = 3;
    private static final int swordPrice = 35;

    public Sword(){
        super();
    }

    @Override
    public void setEquipment() {
        this.price = swordPrice;
    }

    public static int getSwordDamageValue() {
        return swordDamageValue;
    }

    public static int getSwordPrice() {
        return swordPrice;
    }
}
