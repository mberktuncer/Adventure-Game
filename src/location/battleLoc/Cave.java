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
        boolean isAlive;
        Inventory playerInventory = player.getInventory();

        if (!playerInventory.food){
            int numberOfZombie = generateRandomMonster();

            List<Monsters> zombies = new ArrayList<>();

            for (int i = 0; i < numberOfZombie; i++){
                Monsters zombie = new Zombie();
                zombies.add(zombie);
            }

            System.out.println("There is " + numberOfZombie + " zombie here.");
            isAlive = battle(player, zombies);

            if (isAlive){
                System.out.println("You found FOOD from cave. Congrats...");
                playerInventory.food = true;
                if (checkItems(playerInventory)){
                    Game.teleport(Game.takeLocationChoice(), player);
                }
            }
            else{
                Game.gameOver();
            }
        }
        else{
            System.out.println("You already clean this cave.");
            Game.teleport(Game.takeLocationChoice(), player);
        }
    }
}