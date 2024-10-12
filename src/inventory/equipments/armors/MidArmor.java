package inventory.equipments.armors;

import inventory.equipments.Equipment;

public class MidArmor extends Equipment {

    private static final int midArmorBlockingValue = 3;
    private static final int midArmorPrice = 25;

    public MidArmor(){
        super();
    }

    @Override
    public void setEquipment() {
        this.price = midArmorPrice;
    }

    public static int getMidArmorBlockingValue() {
        return midArmorBlockingValue;
    }

    public static int getMidArmorPrice() {
        return midArmorPrice;
    }
}
