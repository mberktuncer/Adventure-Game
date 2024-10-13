package location.normalLoc;

import inventory.equipments.armors.HeavyArmor;
import inventory.equipments.armors.LightArmor;
import inventory.equipments.armors.MidArmor;
import inventory.equipments.weapons.Gun;
import inventory.equipments.weapons.Rifle;
import inventory.equipments.weapons.Sword;
import player.Player;

import java.util.Scanner;

public class ToolStore extends NormalLoc{
    public ToolStore(Player player, String name) {
        super(player, name);
    }

    @Override
    public void Location() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("You are at Tool Store. You can buy weapons and armors here !");
        Menu();

        System.out.print("Please enter the Equipment ID that you want to buy: ");
        int input = scanner.nextInt();
        Buy(input);
    }

    public void Menu(){

        System.out.println( "------------- WEAPONS -------------");
        System.out.println( "Weapon  - ID  - Damage - Price \n" +
                            "-------------------------------\n" +
                            "Gun     -  1  -   2   -   25   \n" +
                            "Sword   -  2  -   3   -   35   \n" +
                            "Rifle   -  3  -   7   -   45   \n" +
                            "---------------------------------");
        System.out.println();
        System.out.println( "------------- ARMORS -------------");
        System.out.println( "Armor  - ID  - Blocking - Price \n" +
                            "--------------------------------\n" +
                            "Light  -  4  -    1    -   15   \n" +
                            "Medium -  5  -    3    -   25   \n" +
                            "Heavy  -  6  -    5    -   40   \n" +
                            "--------------------------------");

    }

    public void Buy(int equipmentId){
        int playerCurrentMoney = player.getMoney();
        switch (equipmentId){
            case 1:
                if (playerCurrentMoney >= Gun.getGunPrice()){
                    player.setWeapon(new Gun());
                    player.setMoney(playerCurrentMoney - Gun.getGunPrice());
                    System.out.println("You bought a new Gun !!!");
                }
                else{
                    System.out.println("You dont have enough money for Gun :(");
                }
                break;
            case 2:
                if (playerCurrentMoney >= Sword.getSwordPrice()){
                    player.setWeapon(new Sword());
                    player.setMoney(playerCurrentMoney - Sword.getSwordPrice());
                    System.out.println("You bought a Sword !");
                }
                else{
                    System.out.println("You dont have enough money for Sword :(");
                }
                break;
            case 3:
                if (playerCurrentMoney >= Rifle.getRiflePrice()){
                    player.setWeapon(new Rifle());
                    player.setMoney(playerCurrentMoney - Rifle.getRiflePrice());
                    System.out.println("You bought a Rifle !");
                }
                else{
                    System.out.println("You dont have enough money for Rifle :(");
                }
                break;
            case 4:
                if (playerCurrentMoney >= LightArmor.getLightArmorPrice()){
                    player.setArmor(new LightArmor());
                    player.setMoney(playerCurrentMoney - LightArmor.getLightArmorPrice());
                    System.out.println("You bought a Light Armor !");
                }
                else{
                    System.out.println("You dont have enough money for Light Armor :(");
                }
                break;
            case 5:
                if (playerCurrentMoney >= MidArmor.getMidArmorPrice()){
                    player.setArmor(new MidArmor());
                    player.setMoney(playerCurrentMoney - MidArmor.getMidArmorPrice());
                    System.out.println("You bough a Medium Armor !");
                }
                else{
                    System.out.println("You dont have money for Mid Armor :(");
                }
                break;
            case 6:
                if (playerCurrentMoney >= HeavyArmor.getHeavyArmorPrice()){
                    player.setArmor(new HeavyArmor());
                    player.setMoney(playerCurrentMoney - HeavyArmor.getHeavyArmorPrice());
                    System.out.println("You bought a Heavy armor !");
                }
                else{
                    System.out.println("You dont have enough money for Heavy Armor :(");
                }
                break;
            default:
                System.out.println("Your choice is not invalid !!");
                break;
        }
    }

}
