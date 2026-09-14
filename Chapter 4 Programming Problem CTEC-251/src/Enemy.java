public abstract class Enemy {

    protected Weapon weapon;
    protected Armor armor;

    public Enemy(EquipmentFactory equipmentFactory) {
        this.weapon = equipmentFactory.createWeapon();
        this.armor = equipmentFactory.createArmor();
    }

    public abstract void attack();
}
