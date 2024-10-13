package location.battleLoc;

import game.Game;
import inventory.Inventory;
import location.monsters.Bear;
import location.monsters.Monsters;
import location.monsters.Vampire;
import player.Player;

import java.util.ArrayList;
import java.util.List;

public class River extends BattleLoc{
    public River(Player player) {
        super(player);
    }

    @Override
    public void LocationActions() {
        Inventory playerInventory = player.getInventory();
        int numberOfBear = generateRandomMonster();

        List<Monsters> bears = new ArrayList<>();

        for (int i = 0; i < numberOfBear; i++){
            Monsters bear = new Bear();
            bears.add(bear);
        }

        if (!playerInventory.water){
            battle(player, bears);
            System.out.println("You found water from river. Congrats...");
            playerInventory.water = true;
        }
        else{
            System.out.println("You already clean this river.");
        }

        if (!checkItems(playerInventory)){
            Game.teleport(Game.takeLocationChoice());
        }

    }

}
