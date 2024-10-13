package location.battleLoc;

import location.Location;
import player.Player;

public abstract class BattleLoc extends Location {
    public BattleLoc(Player player) {
        super(player);
    }
}
