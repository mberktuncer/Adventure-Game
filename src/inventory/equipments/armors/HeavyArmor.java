package inventory.equipments.armors;

import inventory.equipments.Equipment;

public class HeavyArmor extends Equipment {

    private static final int heavyArmorBlockingValue = 5;
    private static final int heavyArmorPrice = 40;
    private static final String heavyArmorName = "HEAVY ARMOR";

    public HeavyArmor(){
        super();
    }

    @Override
    public void setEquipment() {
        this.price = heavyArmorPrice;
        this.armorBlockValue = heavyArmorBlockingValue;
        this.equipmentName = heavyArmorName;
    }

}
