package location.battleLoc;

import game.Game;
import inventory.Inventory;
import inventory.equipments.Equipment;
import location.Location;
import location.monsters.Monsters;
import player.Player;

import java.util.List;
import java.util.Random;

public abstract class BattleLoc extends Location {
    public BattleLoc(Player player) {
        super(player);
    }

    public void battle(Player player, List<Monsters> monsters){
        Equipment playerWeapon = player.getWeapon();
        Equipment playerArmor = player.getArmor();
        int playerWeaponDamageValue = playerWeapon.weaponDamageValue;
        int playerTotalDamageValue = player.getDamage() + playerWeaponDamageValue;
        int playerArmorValue = playerArmor.armorBlockValue;

        for (Monsters monster : monsters){
            while(monster.getHealthValue() > 0){
                System.out.println("You are attacking...");
                monster.setHealthValue(monster.getHealthValue() - playerTotalDamageValue);
                System.out.println("Current monsters new health value: " + monster.getHealthValue());

                System.out.println("Monster attacking to you...");
                player.setHealth(monster.getDamageValue() - playerArmorValue);
                if (player.getHealth() <= 0){
                    System.out.println("GAME OVER. YOU DIED.");
                    Game.gameOver();
                }
                System.out.println("Monster attacked you. Your new health is: " + player.getHealth());
            }
        }

        System.out.println("CONGRATS !! You killed all monsters.");

    }

    public void printCurrentInfos(){

        System.out.println();

    }

    public boolean checkItems(Inventory inventory){
        if (inventory.food || inventory.wood || inventory.water){
            System.out.println("CONGRATS !!! YOU HAVE ALL ITEMS, YOU WON THE GAME");
            return true;
        }
        else{
            return false;
        }
    }

    public static int generateRandomMonster(){
        Random rnd = new Random();
        return rnd.nextInt(3) + 1;
    }

}
