# Adventure-Game

***I made a text based adventure game with Java.***

***This project was made to develop OOP capability with Java.***



## Class Diagram

![Class Diagram](https://github.com/bratcelik/Adventure-Game/blob/main/img/Adventure%20Game%20Class%20Diagram.png)



### Game Characters

| ID   | Character Name | Damage | Health | Money |
| :--- | :------------: | :----: | :----: | ----: |
| 1    |    Samurai     |   5    |   21   |    15 |
| 2    |     Archer     |   7    |   18   |    20 |
| 3    |     Knight     |   8    |   24   |     5 |



### Obstacles

| ID   | Obstacle Name |    Damage    | Health | Money |
| :--- | :-----------: | :----------: | :----: | ----: |
| 1    |    Zombie     |      3       |   10   |     4 |
| 2    |    Vampire    |      4       |   14   |     7 |
| 3    |     Bear      |      7       |   20   |    12 |
| 4    |     Snake     | 3-6 (Random) |   12   |     - |



### Tools

   #### Armors

| ID   |  Armor Name  | Block | Money |
| :--- | :----------: | :---: | ----: |
| 1    | Light Armor  |   1   |    15 |
| 2    | Medium Armor |   3   |    25 |
| 3    | Heavy Armor  |   5   |    40 |

   #### Weapons

| ID   | Weapon Name | Damage | Money |
| :--- | :---------: | :----: | ----: |
| 1    |     Gun     |   2    |    25 |
| 2    |    Sword    |   3    |    35 |
| 3    |    Rifle    |   7    |    45 |


### Locations

| ID   | Location Name |       Benefit       |
| :--- | :-----------: | :-----------------: |
| 1    |  Safe House   |    Health (Safe)    |
| 2    |  Tool Store   |  Equipment (Safe)   |
| 3    |     Cave      |   Food (Not Safe)   |
| 4    |    Forest     | Firewood (Not Safe) |
| 5    |     River     |  Water (Not Safe)   |
| 6    |     Mine      |   Item (Not Safe)   |



### - Safe House

   **Requirements :** 

  * Must fill the player's health.

  * If the cave, forest and river quests have been completed. It should give the message that you have won the game.

    

### - Tool Store

   **Requirements :** 

  * The player can buy armor and weapons.



### - Cave

   **Requirements :** 

  * There must be 1-3 random ***Zombies***.
  * If all zombies are defeated, the zombies' money is transferred to the wallet and the ***Food*** is added to the inventory.



### - Forest

   **Requirements :** 

  * There must be 1-3 random ***Vampires***.
  * If all vampires are defeated, the vampires' money is transferred to the wallet and the ***Firewood*** is added to the inventory.



### - River

   **Requirements :** 

  * There must be 1-3 random ***Bears***.
  * If all bears are defeated, the bears' money is transferred to the wallet and the ***Water*** is added to the inventory.



### - Mine

   **Requirements :** 

  * There must be 1-5 random ***Snakes***.
  * If all snakes are defeated, items or money must be earned and added to the inventory.
  * **15%** chance to win a **Weapon**

	 **♦** 20% chance to win a **Rifle**      ♦ 30% chance to win a **Sword**      ♦ 50% chance to win a **Gun**

* **15%** chance to win a **Armor**

	 **♦** 20% chance to win a **Heavy Armor**      ♦ 30% chance to win a **Medium Armor**      ♦ 50% chance to win a **Light Armor**

* **25%** chance of making **Money**

	 **♦** 10% chance of winning **10 coins**       ♦ 30% chance of winning **5 coins**      ♦ 10% chance of winning **1 coins**

* **45%** chance of not winning **Anything**

