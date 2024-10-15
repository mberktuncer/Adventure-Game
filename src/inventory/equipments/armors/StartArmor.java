package inventory.equipments.armors;

import inventory.equipments.Equipment;

public class StartArmor extends Equipment {

    private static final int startArmorBlockValue = 0;
    private static final int startArmorPrice = 0;
    private static final String startArmorName = "DONT HAVE ARMOR YET";

    @Override
    public void setEquipment() {
        this.armorBlockValue = startArmorBlockValue;
        this.price = startArmorPrice;
        this.equipmentName = startArmorName;
    }
}
