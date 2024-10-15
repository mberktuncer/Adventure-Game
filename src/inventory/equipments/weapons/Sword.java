package inventory.equipments.weapons;

import inventory.equipments.Equipment;

public class Sword extends Equipment {

    private static final int swordDamageValue = 3;
    private static final int swordPrice = 35;
    private static final String swordName = "SWORD";

    public Sword(){
        super();
    }

    @Override
    public void setEquipment() {
        this.price = swordPrice;
        this.weaponDamageValue = swordDamageValue;
        this.equipmentName = swordName;
    }

}
