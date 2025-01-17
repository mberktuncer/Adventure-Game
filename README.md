# Adventure Game

Adventure Game is a text-based role-playing game developed in Java. In this game, players choose from three different characters, explore various locations, and battle monsters. The ultimate goal is to defeat all the monsters in different battle locations and collect specific items to win the game.

## Game Overview

At the beginning of the game, players are introduced to three available characters. Based on their stats, players can select their preferred character.

### Characters

| Character | ID | Damage | Health | Money |
|-----------|----|--------|--------|-------|
| Samurai   |  1 |   5    |   21   |   15  |
| Archer    |  2 |   7    |   18   |   20  |
| Knight    |  3 |   8    |   24   |    5  |

## Locations

The game features two types of locations: Normal Locations and Battle Locations.

### Normal Locations

- **Safe House**: A place where the player can restore their health to full.
- **Tool Store**: A shop where the player can purchase weapons and armors using the money earned by defeating monsters.

### Battle Locations

- **Cave**: Home to zombies. The player will encounter 1-3 zombies at random. Defeating all zombies rewards the player with the **Food** item.
    - Zombie Stats: Damage: 3, Health: 10, Prize Money: 4

- **Forest**: Home to vampires. The player will encounter 1-3 vampires at random. Defeating all vampires rewards the player with the **Wood** item.
    - Vampire Stats: Damage: 4, Health: 14, Prize Money: 7

- **River**: Home to bears. The player will encounter 1-3 bears at random. Defeating all bears rewards the player with the **Water** item.
    - Bear Stats: Damage: 7, Health: 20, Prize Money: 12

### Winning the Game

To win the game, the player must collect **Food**, **Wood**, and **Water** by defeating the monsters in each battle location. If the player dies in any battle, the game is lost.

## Weapons & Armors

Players can purchase weapons and armors from the Tool Store. These items help in battles and increase the player's survival chances.

### Weapons

| Weapon  | ID | Damage | Price |
|---------|----|--------|-------|
| Gun     |  1 |   2    |   25  |
| Sword   |  2 |   3    |   35  |
| Rifle   |  3 |   7    |   45  |

### Armors

| Armor   | ID | Blocking | Price |
|---------|----|----------|-------|
| Light   |  4 |    1     |   15  |
| Medium  |  5 |    3     |   25  |
| Heavy   |  6 |    5     |   40  |

## How to Run the Game

1. Clone the repository to your local machine.
   ```bash
   git clone <https://github.com/mberktuncer/AdventureGame>
2. Open the project in your preferred IDE (e.g., IntelliJ IDEA or Eclipse).
3. Build and run the project.

Enjoy the adventure and try to survive the battles!