public class ForestSpawner extends EnemySpawner {

    @Override
    protected Enemy createEnemy(String type) {

        EquipmentFactory equipmentFactory = new WarriorEquipmentFactory();

        switch (type.toLowerCase()) {
            case "goblin":
                return new Goblin(equipmentFactory);

            case "wolf":
                return new Wolf(equipmentFactory);

            default:
                return null;
        }
    }
}
