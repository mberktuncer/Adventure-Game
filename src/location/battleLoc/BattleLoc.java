package location.battleLoc;

import game.Game;
import inventory.Inventory;
import inventory.equipments.Equipment;
import location.Location;
import location.monsters.Monsters;
import player.Player;

import java.sql.SQLOutput;
import java.util.List;
import java.util.Random;
import java.util.concurrent.TimeUnit;

public abstract class BattleLoc extends Location {
    public BattleLoc(Player player) {
        super(player);
    }

    public boolean battle(Player player, List<Monsters> monsters){

        Inventory playerInventory = player.getInventory();
        Equipment playerWeapon = playerInventory.getWeapon();
        int playerWeaponDamageValue = 0;
        if (playerWeapon != null){
            playerWeaponDamageValue = playerWeapon.getWeaponDamageValue();
        }

        Equipment playerArmor = playerInventory.getArmor();
        int playerArmorValue = 0;
        if (playerArmor != null){
            playerArmorValue = playerArmor.getArmorBlockValue();
        }

        int playerTotalDamageValue = player.getDamage() + playerWeaponDamageValue;

        for (Monsters monster : monsters){
            while(monster.getHealthValue() > 0){

                System.out.println("----------------------------");
                System.out.println("You are attacking...");
                try {
                    TimeUnit.SECONDS.sleep(1);
                } catch (InterruptedException ie) {
                    Thread.currentThread().interrupt();
                }

                monster.setHealthValue(monster.getHealthValue() - playerTotalDamageValue);
                if (monster.getHealthValue() <= 0){
                    player.setMoney(player.getMoney() + monster.getPrizeMoney());
                    System.out.println("You killed the monster !!");
                    System.out.println("----------------------------");
                    break;
                }

                System.out.println("Current monsters new health value: " + monster.getHealthValue());

                System.out.println("Monster attacking to you...");
                try {
                    TimeUnit.SECONDS.sleep(1);
                } catch (InterruptedException ie) {
                    Thread.currentThread().interrupt();
                }

                player.setHealth(player.getHealth() - (monster.getDamageValue() - playerArmorValue));
                System.out.println("Monster attacked you. Your new health is: " + player.getHealth());
                System.out.println("----------------------------");

                if (player.getHealth() <= 0){
                    break;
                }

            }
            if (player.getHealth() <= 0){
                return false;
            }
        }
        System.out.println("CONGRATS !! You killed all monsters.");
        return true;
    }

    public boolean checkItems(Inventory inventory){
        if (inventory.food && inventory.wood && inventory.water){
            System.out.println("CONGRATS !!! YOU HAVE ALL ITEMS, YOU WON THE GAME");
            return false;
        }
        else{
            return true;
        }
    }

    public static int generateRandomMonster(){
        Random rnd = new Random();
        return rnd.nextInt(3) + 1;
    }

}
