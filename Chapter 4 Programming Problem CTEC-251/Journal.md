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
