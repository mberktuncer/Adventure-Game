package inventory.equipments.weapons;

import inventory.equipments.Equipment;

public class StartWeapon extends Equipment {
    private static final int startWeaponDamageValue = 0;
    private static final int startWeaponPrice = 0;
    private static final String startWeaponName = "DONT HAVE WEAPON";
    @Override
    public void setEquipment() {
        this.weaponDamageValue = startWeaponDamageValue;
        this.price = startWeaponPrice;
        this.equipmentName = startWeaponName;
    }
}
