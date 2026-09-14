Phase 1 Journal

Approach

I created an abstract Enemy class with an attack() method. I then created Goblin and Skeleton classes that extend Enemy and provide their own attack messages.

I also created a SimpleEnemyFactory to handle creating the different enemy objects. In Main, I use the factory instead of directly creating Goblin and Skeleton objects.

How does the factory decouple Main from the concrete enemy classes?

The factory moves the object creation code out of Main. Main only needs to know about the Enemy class and the factory. It does not need to directly create a Goblin or Skeleton.

How would this help when adding Slime?

If I add a new Slime class, I could add the creation of Slime to the factory. This keeps the object creation in one place instead of having to change the code throughout the program.

---------------------------------

Phase 2 Journal

Approach

For Phase 2, I created `Wolf` and `Slime` as new enemy subclasses. I also created an abstract `EnemySpawner` class with a factory method called `createEnemy()`.

I then created `ForestSpawner` and `DungeonSpawner`. The ForestSpawner creates Goblins and Wolves, while the DungeonSpawner creates Skeletons and Slimes.

How does inheritance help add a new level?

Inheritance allows me to create a new spawner without changing the existing spawners. For example, I could create a `MountainSpawner` that extends `EnemySpawner` and make it create new enemies such as a Troll or Dragon.

This makes the program easier to expand because each level can have its own enemy creation logic.

---------------------------------

Phase 3 Journal

Approach

For Phase 3, I created the `Weapon` and `Armor` interfaces and several concrete equipment classes. I then created an `EquipmentFactory` interface with methods for creating both a weapon and armor.

I created two factories: `WarriorEquipmentFactory` and `MageEquipmentFactory`. The Warrior factory creates a Sword and Plate Armor, while the Mage factory creates a Staff and Robe.

I updated the `Enemy` class so that it receives an `EquipmentFactory` in its constructor. This allows the enemy to automatically receive its weapon and armor.

How does the Abstract Factory guarantee compatible equipment?

The Abstract Factory keeps related equipment together. The Warrior factory always creates a Sword and Plate Armor, while the Mage factory always creates a Staff and Robe.

This means the code requesting equipment does not have to separately choose a weapon and armor. It can choose one equipment factory and receive a matching set.

Challenge

Changing the Enemy constructor caused the old factories and spawners to stop working because they were still creating enemies without an EquipmentFactory. This is expected because those classes will be updated during Phase 4.

-----------------------------------

Phase 4 Journal

Approach

For Phase 4, I connected the enemy spawners with the equipment factories. The `ForestSpawner` uses the `WarriorEquipmentFactory`, while the `DungeonSpawner` uses the `MageEquipmentFactory`.

This allows each spawner to automatically give its enemies the correct equipment family.

In `Main`, I only work with the `EnemySpawner` and `Enemy` abstract types. I do not have to manually create the equipment factories or individual enemy classes.

Where did I use abstract types?

I used the `EnemySpawner` type when creating the forest and dungeon spawners:

`EnemySpawner forestSpawner = new ForestSpawner();`

I also used the `Enemy` type when storing the enemies and calling their `attack()` methods.

The `EquipmentFactory` type is also used when the spawners create the appropriate equipment factory.

Why does abstraction make the system easier to maintain?

Using abstract types means that `Main` does not need to know the details of every enemy or equipment type. If I add another spawner or enemy later, I can create a new class that follows the existing abstractions without having to rewrite the main program.

This makes the system easier to maintain and extend because the different parts of the program are less dependent on specific concrete classes.
