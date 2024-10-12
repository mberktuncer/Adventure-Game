package game;

import player.Archer;
import player.Knight;
import player.Player;
import player.Samurai;

import java.sql.SQLOutput;
import java.util.Scanner;

public class Game {

    public void start() {
        Scanner scanner = new Scanner(System.in);
        Player player = null;
        boolean isInvalidChoice;

        System.out.println("Welcome to the adventure game ! ");

        System.out.println("You can select 3 different characters...");
        System.out.println("----------------------------------------");

        System.out.println("Character   - ID  - Damage - Health - Money \n" +
                "--------------------------------------------\n" +
                "Samurai     -  1  -   5    -   21   -   15  \n" +
                "Archer      -  2  -   7    -   18   -   20  \n" +
                "Knight      -  3  -   8    -   24   -   5   \n" +
                "--------------------------------------------");


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

    }

}
