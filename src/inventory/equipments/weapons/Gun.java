package inventory.equipments.weapons;

import inventory.equipments.Equipment;

public class Gun extends Equipment {

    private static final int gunDamageValue = 2;
    private static final int gunPrice = 25;
    private static final String gunName = "GUN";

    public Gun(){
        super();
    }

    @Override
    public void setEquipment() {
        this.price = gunPrice;
        this.weaponDamageValue = gunDamageValue;
        this.equipmentName = gunName;
    }
}
