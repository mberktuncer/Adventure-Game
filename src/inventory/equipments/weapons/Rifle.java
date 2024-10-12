package inventory.equipments.weapons;

import inventory.equipments.Equipment;

public class Rifle extends Equipment {

    private static final int rifleDamageValue = 7;
    private static final int riflePrice = 45;

    public Rifle(){
        super();
    }

    @Override
    public void setEquipment() {
        this.price = riflePrice;
    }

    public int getRifleDamageValue() {
        return rifleDamageValue;
    }

    public int getRiflePrice() {
        return riflePrice;
    }
}