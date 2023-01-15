package day11.task2;

public abstract class Hero implements PhysAttack {

    protected int health;
    protected static final int MAX_HEALTH = 100;
    protected static final int MIN_HEALTH = 0;
    protected double physDef;
    protected double magicDef;
    protected int physAtt;

    public Hero() {
        health = MAX_HEALTH;
    }

    @Override
    public void physicalAttack(Hero hero) {
        double attack = physAtt - physAtt * hero.physDef;
        if (hero.health - attack < MIN_HEALTH) {
            hero.health = MIN_HEALTH;
        } else {
            hero.health -= attack;
        }
    }
}
