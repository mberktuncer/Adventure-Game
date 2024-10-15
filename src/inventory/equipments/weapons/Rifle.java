package inventory.equipments.weapons;

import inventory.equipments.Equipment;

public class Rifle extends Equipment {

    private static final int rifleDamageValue = 7;
    private static final int riflePrice = 45;
    private static final String rifleName = "RIFLE";

    public Rifle(){
        super();
    }

    @Override
    public void setEquipment() {
        this.price = riflePrice;
        this.weaponDamageValue = rifleDamageValue;
        this.equipmentName = rifleName;
    }


}
