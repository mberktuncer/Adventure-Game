package location.battleLoc;

import game.Game;
import inventory.Inventory;
import location.monsters.Bear;
import location.monsters.Monsters;
import player.Player;

import java.util.ArrayList;
import java.util.List;

public class River extends BattleLoc{
    public River(Player player) {
        super(player);
    }

    @Override
    public void LocationActions() {
        boolean isAlive;
        Inventory playerInventory = player.getInventory();

        if (!playerInventory.water){
            int numberOfBear = generateRandomMonster();

            List<Monsters> bears = new ArrayList<>();

            for (int i = 0; i < numberOfBear; i++){
                Monsters bear = new Bear();
                bears.add(bear);
            }

            System.out.println("There is " + numberOfBear + " bear here.");
            isAlive = battle(player, bears);
            if (isAlive){
                System.out.println("You found WATER from river. Congrats...");
                playerInventory.water = true;
                if (checkItems(playerInventory)){
                    Game.teleport(Game.takeLocationChoice(), player);
                }
            }
            else{
                Game.gameOver();
            }
        }
        else{
            System.out.println("You already clean this river.");
            Game.teleport(Game.takeLocationChoice(), player);
        }
    }
}