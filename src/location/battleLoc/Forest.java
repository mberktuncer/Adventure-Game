package location.battleLoc;

import game.Game;
import inventory.Inventory;
import location.monsters.Monsters;
import location.monsters.Vampire;
import player.Player;

import java.util.ArrayList;
import java.util.List;

public class Forest extends BattleLoc{
    public Forest(Player player) {
        super(player);
    }

    @Override
    public void LocationActions() {
        boolean isAlive;
        Inventory playerInventory = player.getInventory();

        if (!playerInventory.wood){
            int numberOfVampire = generateRandomMonster();

            List<Monsters> vampires = new ArrayList<>();

            for (int i = 0; i < numberOfVampire; i++){
                Monsters vampire = new Vampire();
                vampires.add(vampire);
            }

            System.out.println("There is " + numberOfVampire + " vampire here.");
            isAlive = battle(player, vampires);

            if (isAlive){
                System.out.println("You found WOOD from forest. Congrats...");
                playerInventory.wood = true;
                if (checkItems(playerInventory)){
                    Game.teleport(Game.takeLocationChoice(), player);
                }
            }
            else{
                Game.gameOver();
            }
        }
        else{
            System.out.println("You already clean this forest.");
            Game.teleport(Game.takeLocationChoice(), player);
        }
    }
}