package inventory.equipments;

public abstract class Equipment {
    public int price;
    public int weaponDamageValue;
    public int armorBlockValue;

    public int getArmorBlockValue() {
        return armorBlockValue;
    }

    public Equipment(){
        setEquipment();
    }

    public abstract void setEquipment();

    public int getWeaponDamageValue() {
        return weaponDamageValue;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }
}
