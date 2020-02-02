package JavaCourses.OOP;

public class FireMage extends Magician {
    public FireMage() {
        super("FireMage", 3, 120, 20, 0, 95);
    }

    @Override
    public void attack (Warrior warrior) {
        warrior.health = warrior.health - magicAttack;
        mana = mana - 4;
        cooldown = 3;
        if (mana > 0) {
            while (cooldown > 0) {
                warrior.takeDamage(attack);
                cooldown--;
            }
        }
    }
}
