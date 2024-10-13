package inventory.equipments.armors;

import inventory.equipments.Equipment;

public class LightArmor extends Equipment {

    private final static int lightArmorBlockingValue = 1;
    private final static int lightArmorPrice = 15;

    public LightArmor(){
        super();
    }

    @Override
    public void setEquipment() {
        this.price = lightArmorPrice;
        this.armorBlockValue = lightArmorBlockingValue;
    }
}
