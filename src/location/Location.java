package location;

import location.normalLoc.SafeHouse;
import player.Player;

import java.util.Scanner;

public abstract class Location {

    public Player player;
    public String name;

    public Location(Player player, String name) {
        this.player = player;
        this.name = name;
    }

    public void Teleport(){
        Scanner scanner = new Scanner(System.in);



        System.out.println("Where do you wanna go now ?");
        System.out.println("---------------------------");
        System.out.println("1- Safe House \n" +
                "2- Tool Store \n" +
                "3- Cave \n" +
                "4- Forest \n" +
                "5- River");
        int input = scanner.nextInt();

        switch (input){
            case 1:
        }
    }

    public abstract void Location();

}
