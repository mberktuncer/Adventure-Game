package location.battleLoc;

import game.Game;
import inventory.Inventory;
import location.monsters.Monsters;
import location.monsters.Zombie;
import player.Player;

import java.util.ArrayList;
import java.util.List;

public class Cave extends BattleLoc{
    public Cave(Player player) {
        super(player);
    }

    @Override
    public void LocationActions() {

        Inventory playerInventory = player.getInventory();
        int numberOfZombie = generateRandomMonster();

        List<Monsters> zombies = new ArrayList<>();

        for (int i = 0; i < numberOfZombie; i++){
            Monsters zombie = new Zombie();
            zombies.add(zombie);
        }

        if (!playerInventory.food){
            battle(player, zombies);
            System.out.println("You found food from cave. Congrats...");
            playerInventory.food = true;
        }
        else{
            System.out.println("You already clean this cave.");
        }

        if (!checkItems(playerInventory)){
            Game.teleport(Game.takeLocationChoice());
        }

    }
}
