package inventory.equipments.armors;

import inventory.equipments.Equipment;

public class MidArmor extends Equipment {

    private static final int midArmorBlockingValue = 3;
    private static final int midArmorPrice = 25;
    private static final String midArmorName = "MID ARMOR";

    public MidArmor(){
        super();
    }

    @Override
    public void setEquipment() {
        this.price = midArmorPrice;
        this.armorBlockValue = midArmorBlockingValue;
        this.equipmentName = midArmorName;
    }

}
