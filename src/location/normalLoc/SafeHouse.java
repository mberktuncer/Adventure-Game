package location.normalLoc;

import player.Player;

public class SafeHouse extends NormalLoc{
    private static final int safeHouseHealingValue = 5;
    public SafeHouse(Player player) {
        super(player);
    }

    @Override
    public void LocationActions() {
        int playerCurrentHealth = player.getHealth();

        System.out.println("You are at Safe House. Your current health is: " +  playerCurrentHealth);
        System.out.println("You are healing...");

        player.setHealth(playerCurrentHealth + safeHouseHealingValue);

        System.out.println("Your new health is: " + player.getHealth());

    }
}
