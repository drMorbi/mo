package day11.task2;

public class Magician extends Hero implements MagicAttack {

    public Magician() {
        physAtt = 5;
        magicDef = 0.8;
    }

    private int magicAtt = 20;

    @Override
    public void magicalAttack(Hero hero) {
        double attack = magicAtt - magicAtt * hero.magicDef;
        if (hero.health - attack < MIN_HEALTH) {
            hero.health = MIN_HEALTH;
        } else {
            hero.health -= attack;
        }
    }


    public String toString() {
        return "Magician " + "{health = " + health + "}";
    }
}
