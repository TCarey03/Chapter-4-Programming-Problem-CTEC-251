Phase 1 Journal
Approach

I created an abstract Enemy class with an attack() method. I then created Goblin and Skeleton classes that extend Enemy and provide their own attack messages.

I also created a SimpleEnemyFactory to handle creating the different enemy objects. In Main, I use the factory instead of directly creating Goblin and Skeleton objects.

How does the factory decouple Main from the concrete enemy classes?

The factory moves the object creation code out of Main. Main only needs to know about the Enemy class and the factory. It does not need to directly create a Goblin or Skeleton.

How would this help when adding Slime?

If I add a new Slime class, I could add the creation of Slime to the factory. This keeps the object creation in one place instead of having to change the code throughout the program.
