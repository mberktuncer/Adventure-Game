package game;

import inventory.Inventory;
import inventory.equipments.Equipment;
import inventory.equipments.armors.StartArmor;
import inventory.equipments.weapons.StartWeapon;
import location.Location;
import location.battleLoc.BattleLoc;
import location.battleLoc.Cave;
import location.battleLoc.Forest;
import location.battleLoc.River;
import location.normalLoc.SafeHouse;
import location.normalLoc.ToolStore;
import player.characters.Archer;
import player.characters.Knight;
import player.Player;
import player.characters.Samurai;

import java.util.Scanner;

public class Game {

    private static Location safeHouse;
    private static Location toolStore;
    private static Location cave;
    private static Location forest;
    private static Location river;
    private static Player player;

    public static void start() {

        printCharsInfo();
        player = getChar();

        safeHouse = new SafeHouse(player);
        toolStore = new ToolStore(player);
        cave = new Cave(player);
        forest = new Forest(player);
        river = new River(player);


        int locationChoice = takeLocationChoice();
        teleport(locationChoice, player);

    }

    public static void gameOver(){
        System.out.println("GAME OVER. YOU DEAD:");
    }

    public static void teleport(int choice, Player player){
        Scanner scanner = new Scanner(System.in);
        switch (choice){
            case 1:
                safeHouse.LocationActions();
                break;
            case 2:
                toolStore.LocationActions();
                break;
            case 3:
                cave.LocationActions();
                break;
            case 4:
                forest.LocationActions();
                break;
            case 5:
                river.LocationActions();
                break;
            case 6:
                printCurrentInfos(player);
                teleport(takeLocationChoice(), player);
                break;
            default:
                System.out.println("You enter the invalid choice ! Please enter a valid number: ");
                int input = scanner.nextInt();
                teleport(input, player);
        }

    }

    public static void printCurrentInfos(Player player){

        Inventory playerInventory = player.getInventory();
        Equipment playerWeapon = playerInventory.getWeapon();
        Equipment playerArmor = playerInventory.getArmor();

        String food = "";
        String water = "";
        String wood = "";

        if (playerInventory.food)
            food = "Food";
        if (playerInventory.water)
            water = "Water";
        if (playerInventory.wood)
            wood = "Wood";

        System.out.println("Your character is: " + player.getName() + "\n" +
                "Your current health is: " + player.getHealth() + "\n" +
                "Your current money is: " + player.getMoney() + "\n" +
                "Your current weapon and armor: " + playerWeapon.getEquipmentName() + ", " + playerArmor.getEquipmentName() + "\n" +
                "Your current items: " + food + ", " + water + ", " + wood);
        System.out.println("---------------------------");
    }

    public static int takeLocationChoice(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Where do you wanna go now ?");
        System.out.println("---------------------------");
        System.out.println(
                """
                        1- Safe House\s
                        2- Tool Store\s
                        3- Cave\s
                        4- Forest\s
                        5- River
                        6- Show current infos
                        ---------------------------""");
        return scanner.nextInt();
    }

    public static Player getChar(){
        Scanner scanner = new Scanner(System.in);
        boolean isInvalidChoice;
        Equipment startWeapon = new StartWeapon();
        Equipment startArmor = new StartArmor();
        Inventory playerInventory = new Inventory(false, false, false, startWeapon, startArmor);

        do {
            System.out.print("Enter the character id that you want to play: ");
            int charChoice = scanner.nextInt();
            isInvalidChoice = true;
            switch (charChoice) {
                case 1:
                    player = new Samurai();
                    player.setInventory(playerInventory);
                    break;
                case 2:
                    player = new Archer();
                    player.setInventory(playerInventory);
                    break;
                case 3:
                    player = new Knight();
                    player.setInventory(playerInventory);
                    break;
                default:
                    System.out.println("You made an invalid choice. Please select 1, 2 or 3.");
                    isInvalidChoice = false;
                    break;
            }
        }while (!isInvalidChoice);

        System.out.println("You choose " + player.getName());
        System.out.println("---------------------------");
        return player;
    }

    public static void printCharsInfo(){
        System.out.println("Welcome to the adventure game ! ");

        System.out.println("You can select 3 different characters...");
        System.out.println("----------------------------------------");

        System.out.println("""
                Character   - ID  - Damage - Health - Money\s
                --------------------------------------------
                Samurai     -  1  -   5    -   21   -   15 \s
                Archer      -  2  -   7    -   18   -   20 \s
                Knight      -  3  -   8    -   24   -   5  \s
                --------------------------------------------""");
    }

}
