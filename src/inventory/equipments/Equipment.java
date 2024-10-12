package inventory.equipments;

public abstract class Equipment {
    public int price;

    public Equipment(){
        setEquipment();
    }

    public abstract void setEquipment();

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }
}
