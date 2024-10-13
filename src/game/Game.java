package game;

import location.Location;
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

    public static void start() {

        printCharsInfo();
        Player player = getChar();

        safeHouse = new SafeHouse(player);
        toolStore = new ToolStore(player);

        int locationChoice = takeLocationChoice();
        teleport(locationChoice);

    }

    public static void gameOver(){

    }

    public static void teleport(int choice){
        switch (choice){
            case 1:
                safeHouse.LocationActions();
                break;
            case 2:
                toolStore.LocationActions();
                break;
        }
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
                        5- River""");
        return scanner.nextInt();
    }

    public static Player getChar(){
        Scanner scanner = new Scanner(System.in);
        Player player = null;
        boolean isInvalidChoice;

        do {
            System.out.print("Enter the character id that you want to play: ");
            int charChoice = scanner.nextInt();
            isInvalidChoice = true;
            switch (charChoice) {
                case 1:
                    player = new Samurai();
                    break;
                case 2:
                    player = new Archer();
                    break;
                case 3:
                    player = new Knight();
                    break;
                default:
                    System.out.println("You made an invalid choice. Please select 1, 2 or 3.");
                    isInvalidChoice = false;
                    break;
            }
        }while (!isInvalidChoice);

        System.out.println("You choose " + player.getName());
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
