public class Main {

    public static void main(String[] args) {

        EnemySpawner forestSpawner = new ForestSpawner();
        EnemySpawner dungeonSpawner = new DungeonSpawner();

        Enemy[] enemies = {
                forestSpawner.spawnEnemy("goblin"),
                forestSpawner.spawnEnemy("wolf"),
                dungeonSpawner.spawnEnemy("skeleton"),
                dungeonSpawner.spawnEnemy("slime")
        };

        for (Enemy enemy : enemies) {
            enemy.attack();
        }
    }
}
