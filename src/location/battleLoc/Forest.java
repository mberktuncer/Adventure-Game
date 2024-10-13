package location.battleLoc;

import game.Game;
import inventory.Inventory;
import location.monsters.Monsters;
import location.monsters.Vampire;
import location.monsters.Zombie;
import player.Player;

import java.util.ArrayList;
import java.util.List;

public class Forest extends BattleLoc{
    public Forest(Player player) {
        super(player);
    }

    @Override
    public void LocationActions() {
        Inventory playerInventory = player.getInventory();
        int numberOfVampire = generateRandomMonster();

        List<Monsters> vampires = new ArrayList<>();

        for (int i = 0; i < numberOfVampire; i++){
            Monsters vampire = new Vampire();
            vampires.add(vampire);
        }

        if (!playerInventory.wood){
            battle(player, vampires);
            System.out.println("You found wood from forest. Congrats...");
            playerInventory.wood = true;
        }
        else{
            System.out.println("You already clean this forest.");
        }

        if (!checkItems(playerInventory)){
            Game.teleport(Game.takeLocationChoice());
        }
    }
}
