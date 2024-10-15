package inventory.equipments;

public abstract class Equipment {
    protected int price;
    protected int weaponDamageValue;
    protected int armorBlockValue;
    protected String equipmentName;

    public int getArmorBlockValue() {
        return armorBlockValue;
    }

    public Equipment(){
        setEquipment();
    }

    public abstract void setEquipment();

    public String getEquipmentName() {
        return equipmentName;
    }

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
