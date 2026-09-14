public class DungeonSpawner extends EnemySpawner {

    @Override
    protected Enemy createEnemy(String type) {

        EquipmentFactory equipmentFactory = new MageEquipmentFactory();

        switch (type.toLowerCase()) {
            case "skeleton":
                return new Skeleton(equipmentFactory);

            case "slime":
                return new Slime(equipmentFactory);

            default:
                return null;
        }
    }
}
