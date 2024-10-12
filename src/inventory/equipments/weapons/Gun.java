package inventory.equipments.weapons;

import inventory.equipments.Equipment;

public class Gun extends Equipment {

    private static final int gunDamageValue = 2;
    private static final int gunPrice = 25;

    public Gun(){
        super();
    }

    @Override
    public void setEquipment() {
        this.price = gunPrice;
    }

    public static int getGunDamageValue() {
        return gunDamageValue;
    }

    public static int getGunPrice() {
        return gunPrice;
    }
}
