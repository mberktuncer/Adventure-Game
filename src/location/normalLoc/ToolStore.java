package location.normalLoc;

import game.Game;
import inventory.Inventory;
import inventory.equipments.Equipment;
import inventory.equipments.armors.HeavyArmor;
import inventory.equipments.armors.LightArmor;
import inventory.equipments.armors.MidArmor;
import inventory.equipments.weapons.Gun;
import inventory.equipments.weapons.Rifle;
import inventory.equipments.weapons.Sword;
import player.Player;

import java.util.Scanner;

public class ToolStore extends NormalLoc{
    public ToolStore(Player player) {
        super(player);
    }

    @Override
    public void LocationActions() {
        Scanner scanner = new Scanner(System.in);

        Inventory playerInventory = player.getInventory();

        System.out.println("You are at Tool Store. You can buy weapons and armors here !");
        Menu();

        System.out.print("Please enter the Equipment ID that you want to buy: ");
        int input = scanner.nextInt();
        Buy(input, playerInventory);

        Game.teleport(Game.takeLocationChoice(), player);

    }

    public void Menu(){

        System.out.println( "------------- WEAPONS -------------");
        System.out.println("""
                Weapon  - ID  - Damage - Price\s
                -------------------------------
                Gun     -  1  -   2   -   25  \s
                Sword   -  2  -   3   -   35  \s
                Rifle   -  3  -   7   -   45  \s
                ---------------------------------""");
        System.out.println();
        System.out.println( "------------- ARMORS -------------");
        System.out.println("""
                Armor  - ID  - Blocking - Price\s
                --------------------------------
                Light  -  4  -    1    -   15  \s
                Medium -  5  -    3    -   25  \s
                Heavy  -  6  -    5    -   40  \s
                --------------------------------""");

    }

    public void Buy(int equipmentId, Inventory playerInventory){
        int playerCurrentMoney = player.getMoney();

        switch (equipmentId){
            case 1:
                Gun gun = new Gun();
                if (playerCurrentMoney >= gun.getPrice()){
                    playerInventory.setWeapon(new Gun());
                    player.setMoney(playerCurrentMoney - gun.getPrice());
                    System.out.println("You bought a new Gun !!!");
                }
                else{
                    System.out.println("You dont have enough money for Gun :(");
                }
                break;
            case 2:
                Sword sword = new Sword();
                if (playerCurrentMoney >= sword.getPrice()){
                    playerInventory.setWeapon(new Sword());
                    player.setMoney(playerCurrentMoney - sword.getPrice());
                    System.out.println("You bought a Sword !");
                }
                else{
                    System.out.println("You dont have enough money for Sword :(");
                }
                break;
            case 3:
                Rifle rifle = new Rifle();
                if (playerCurrentMoney >= rifle.getPrice()){
                    playerInventory.setWeapon(new Rifle());
                    player.setMoney(playerCurrentMoney - rifle.getPrice());
                    System.out.println("You bought a Rifle !");
                }
                else{
                    System.out.println("You dont have enough money for Rifle :(");
                }
                break;
            case 4:
                LightArmor lightArmor = new LightArmor();
                if (playerCurrentMoney >= lightArmor.getPrice()){
                    playerInventory.setArmor(new LightArmor());
                    player.setMoney(playerCurrentMoney - lightArmor.getPrice());
                    System.out.println("You bought a Light Armor !");
                }
                else{
                    System.out.println("You dont have enough money for Light Armor :(");
                }
                break;
            case 5:
                MidArmor midArmor = new MidArmor();
                if (playerCurrentMoney >= midArmor.getPrice()){
                    playerInventory.setArmor(new MidArmor());
                    player.setMoney(playerCurrentMoney - midArmor.getPrice());
                    System.out.println("You bough a Medium Armor !");
                }
                else{
                    System.out.println("You dont have money for Mid Armor :(");
                }
                break;
            case 6:
                HeavyArmor heavyArmor = new HeavyArmor();
                if (playerCurrentMoney >= heavyArmor.getPrice()){
                    playerInventory.setArmor(new HeavyArmor());
                    player.setMoney(playerCurrentMoney - heavyArmor.getPrice());
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
