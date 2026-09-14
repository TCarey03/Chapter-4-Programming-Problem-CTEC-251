public class Skeleton extends Enemy {

    public Skeleton(EquipmentFactory equipmentFactory) {
        super(equipmentFactory);
    }

    @Override
    public void attack() {
        System.out.println(
                "Skeleton attacks with "
                + weapon.getDescription()
                + " wearing "
                + armor.getDescription()
        );
    }
}
