package location;

import location.normalLoc.ToolStore;
import player.Player;

public abstract class Location {

    public Player player;



    public Location(Player player) {
        this.player = player;
    }



    public abstract void LocationActions();

}
