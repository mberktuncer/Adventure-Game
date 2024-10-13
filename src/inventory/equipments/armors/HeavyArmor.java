package inventory.equipments.armors;

import inventory.equipments.Equipment;

public class HeavyArmor extends Equipment {

    private static final int heavyArmorBlockingValue = 5;
    private static final int heavyArmorPrice = 40;

    public HeavyArmor(){
        super();
    }

    @Override
    public void setEquipment() {
        this.price = heavyArmorPrice;
    }

    public static int heavyArmorBlockingValue() {
        return heavyArmorBlockingValue;
    }

    public static int getHeavyArmorPrice() {
        return heavyArmorPrice;
    }
}
